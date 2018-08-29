package main

import (
	bws "blazesockets/websockets"
	"fmt"
	"net"
	"time"
)

func SendFrame() {
	bws.COUNT = 0

	// connect to this socket
	conn, _ := net.Dial("tcp", "127.0.0.1:8080")

	for {
		time.Sleep(2 * time.Second)
		// testData := make([]byte, 4096)
		msg := bws.CreateFrame('M', "HELLO BITC")

		// conn.SetWriteDeadline(time.Now().Add(time.Second * 10))

		mss := make([]byte, msg.Len()*2)
		copy(mss[0:(msg.Len())], msg.Bytes())
		// copy(mss[(msg.Len()):], msg.Bytes())
		fmt.Println("MESSAGE READY TO WRITE", msg)
		conn.Write(msg.Bytes())
		// time.Sleep(time.Second * 2)
		// msg = bws.CreateFrame('M', "HELLO BITC")
		// conn.Write(msg.Bytes())

		break
		// fmt.Fprintf(conn, string(msg.Bytes()))
		// fmt.Println("DATA SENT")
		// listen for reply
		// time.Sleep(300 * time.Millisecond)
	}
}

func main() {
	go SendFrame()
	// go bws.PollStatus()
	// msg := bws.CreateFrame(255, "Hello World: Prakhar Agnihotri")
	// r := bytes.NewReader(msg.Bytes())
	// MESSAGE_FRAME := bws.ParseFrame(r)

	// Logs: Message Data
	// fmt.Println("message", MESSAGE_FRAME)
	bws.ServerConfig{
		PORT:       "8080",
		EnableLogs: true,
	}.Configure()
	bws.StartServer()

}
