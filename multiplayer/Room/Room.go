package Room

import (
	memory "blazesockets/InMemoryDB"
	"log"
)





func CreateRoom(roomName string) {

	// TODO: DECIDE TO USE CONCIURRENT HASHMAPS OR NOT
	room := make(map[string]bool)
	// room := cMap.New()
	memory.ROOMS.SetIfAbsent(roomName, room)
	// TOOD: Update REDIS about the create room
	log.Println("Room Created ", roomName)

}

func AddPlayerToRoom(roomName string, socketName string) bool{
	item, ok := memory.ROOMS.Get(roomName)

	if ok {
		item.(map[string]bool)[socketName] = true
		//HandleMultiplayerEvents(socketModels.MultiplayerMessageType_ROOM_JOIN_EVENT, socketName, "Joined")
	}

	return ok

}
func LeaveRoom(roomName string, socketName string) bool{
	item, ok := memory.ROOMS.Get(roomName)

	if ok {
		item.(map[string]bool)[socketName] = false

		//HandleMultiplayerEvents(socketModels.MultiplayerMessageType_ROOM_JOIN_EVENT, socketName, "Joined")
	}

	return ok

}

func GetRoomNames() []string {

	// TODO: DECIDE TO USE CONCIURRENT HASHMAPS OR NOT
	// room := cMap.New()
	roomNames := make([]string , memory.ROOMS.Count())

	for item := range memory.ROOMS.IterBuffered() {
		roomNames = append(roomNames ,  item.Key)
	}
	// TOOD: Update REDIS about the create room
	return roomNames

}

func GetPlayersInRoom(roomName string) []string {

	// TODO: DECIDE TO USE CONCIURRENT HASHMAPS OR NOT

	// room := cMap.New()


	item, ok := memory.ROOMS.Get(roomName)

	var roomNames []string

	if ok{
		roomNames := make([]string , len(item.(map[string]bool ) ) )
		for  key := range  item.(map[string]bool) {
			roomNames = append(roomNames ,  key)
		}
	}
	// TOOD: Update REDIS about the create room
	return roomNames

}


