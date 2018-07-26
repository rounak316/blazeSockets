package main

import (
	"bytes"
	"fmt"
	"log"
	"net"
	_ "net/http/pprof"
	"runtime"
	"strconv"
	"sync"
	"time"

	"github.com/gobwas/ws"
	"github.com/mailru/easygo/netpoll"
	cMap "github.com/orcaman/concurrent-map"
)

var poller = createPoller()
var SOCKETS = cMap.New()

// Packet is the application data
type Packet struct {
	data string
}

// Channel wraps user connection.
type Channel struct {
	mutex          sync.Mutex
	socketName     string
	conn           net.Conn // WebSocket connection
	fileDescriptor *netpoll.Desc
}

func (channel *Channel) close() {

	SOCKETS.Remove(channel.socketName)
	// Not interested in any event from this socket, Remove from netpoll/epoll/kqueue
	poller.Stop(channel.fileDescriptor)
	// Close the socket connection
	channel.conn.Close()
	// Remove the file descriptor associated with that socket
	channel.fileDescriptor.Close()

	fmt.Println("CLOSING SOCKET", channel.socketName)

	channel = nil
	return
}

func (channel *Channel) reader() {
	for {
		b := make([]byte, 100)
		channel.conn.Read(b)
	}
}

func (channel *Channel) writer(wsFrame ws.Frame) {

	// ws.WriteHeader(channel.conn, ws.NewTextFrame("Dummy from").Header)
	ws.WriteFrame(channel.conn, wsFrame)
	// fmt.Println("Sending data to", channel.socketName, err)
}

func handleMessage(data []byte, sesionKey string) {

}

func handleOnNetPollReadEventrigger(ev netpoll.Event, poller netpoll.Poller, channel *Channel) {

	defer func() {
		if channel != nil {
			channel.mutex.Unlock()
		}

	}()
	if channel == nil {
		return
	}
	channel.mutex.Lock()

	// CLOSE EVENT FROM TCP SOCKET
	if ev&netpoll.EventReadHup != 0 {
		channel.close()
		return

	}

	wsFrame, err := ws.ReadFrame(channel.conn)
	if err != nil {
		return
	}
	// Succesfuly read the payload from websokcet frame, now unmask it, if required
	if wsFrame.Header.Masked {
		ws.Cipher(wsFrame.Payload, wsFrame.Header.Mask, 0)
	}
	// fmt.Println("READ FROM", channel.socketName, string(payload))
	// go handleMessage(payload, channel.socketName)

}

func reigisterReadEvent(poller netpoll.Poller, channel *Channel) {

	// Below is async call, that return the functions and callback gets executed when event occurs!
	poller.Start(channel.fileDescriptor, func(ev netpoll.Event) {
		// fmt.Println("Recived Message", channel.socketName)
		go handleOnNetPollReadEventrigger(ev, poller, channel)
	})

}

func createPoller() netpoll.Poller {
	poller, err := netpoll.New(nil)
	if err != nil {
		// handle error
	}
	return poller
}

var lock = sync.RWMutex{}

// CreateChannel creates a channel from connection for read and write functionality!
func CreateChannel(conn net.Conn, sessionKey string) {

	channel := &Channel{
		socketName:     sessionKey,
		conn:           conn,
		fileDescriptor: netpoll.Must(netpoll.HandleRead(conn)),
	}
	SOCKETS.Set(channel.socketName, channel)
	reigisterReadEvent(poller, channel)

}

func broadCastSync(data []byte) {
	binaryFrame := ws.NewBinaryFrame(data)
	for item := range SOCKETS.Iter() {
		// fmt.Println("ITEM", item.Key)
		// time.Sleep(2 * time.Second)
		channel, ok := item.Val.(*Channel)
		if ok {
			channel.writer(binaryFrame)
		} else {
			fmt.Println("Coudn't convet")
		}
	}

}

func handleConnection(conn net.Conn, err error) {

	defer func() {
		// countOpenFiles()
		if r := recover(); r != nil {
			fmt.Println("DEFER", r)

		}
	}()

	// conn.SetDeadline(time.Now().Add(0 * time.Microsecond))

	if err != nil {
		fmt.Println("Error initializing socket")
		conn.Close()
		return
		// handle error
	}

	sessionKey := ""
	u := ws.Upgrader{
		OnHeader: func(key, value []byte) (err error, code int) {
			sessionKey = string(value)
			return
		},
	}

	// fmt.Println("Upgrade hoga")
	// conn.SetDeadline(time.Now().Add(3 * time.Second))
	_, err = u.Upgrade(conn)
	conn.SetDeadline(time.Time{})
	// fmt.Println("Upgrade ho gayi", sessionKey)

	if err != nil {
		// handle error
		fmt.Println("Error upgrading socket", err)
		err = conn.Close()
		if err != nil {
			fmt.Println("Error", err)
		}
		return

	}
	CreateChannel(conn, sessionKey)

}

func countOpenFiles() {
	// out, err := exec.Command("/bin/sh", "-c", fmt.Sprintf("lsof -p %v", os.Getpid())).Output()
	// if err != nil {
	// 	log.Fatal(err)
	// }

	// lines := strings.Split(string(out), "\n")
	// fmt.Println(len(lines) - 1)

}

func listGoRotines() {
	for {
		start := time.Now()
		broadCastSync([]byte("Sample Data"))
		t := time.Now()
		elapsed := t.Sub(start)
		fmt.Println("Broadcast Time", elapsed)
		time.Sleep(4000 * time.Millisecond)
	}
	// for {

	// 	goRotienes := runtime.NumGoroutine()
	// 	fmt.Println("goRotienes listGoRotines", goRotienes, "#", getGID())
	// 	time.Sleep(1000 * time.Millisecond)
	// }

}

func getGID() uint64 {
	b := make([]byte, 64)
	b = b[:runtime.Stack(b, false)]
	b = bytes.TrimPrefix(b, []byte("goroutine "))
	b = b[:bytes.IndexByte(b, ' ')]
	n, _ := strconv.ParseUint(string(b), 10, 64)
	return n
}

func main() {
	PORTS := []string{"8080", "8081", "8082", "8083", "8084"}
	for _, PORT := range PORTS {
		go startServer(PORT)
	}
}

func startServer(PORT string) {

	go listGoRotines()
	fmt.Println("goRotiene Main", "#", getGID())
	ln, err := net.Listen("tcp", "0.0.0.0:"+PORT)
	fmt.Println("Listening on", PORT)
	if err != nil {
		log.Fatal(err)
	}

	fmt.Println("Spinning TCP Server")

	for {

		conn, err := ln.Accept()
		if conn == nil {
			continue
		}

		go handleConnection(conn, err)
	}
}
