package request

type Room struct {
	Gid       int    `json:"gid"`
	Rsize     int    `json:"rsize"`
	Address   string `json:"address"`
	Port      int    `json:"port"`
	Protocol  string `json:"protocol"`
	IsAudio   bool   `json:"isAudio"`
	MinPlayer int    `json:"minPlayer"`
	StopTime  int    `json:"stopTime"`
	RoomName string `json:"roomId"`
	RoomSize int `json:"rsize"`
	MinimumPlayers int `json:"minPlayer"`
	Status bool `json:"status"`

	AudioStruct Audio `json:"audio"`




}

type Audio struct {

	AIp string `json:"address"`
	APort int `json:"port"`
	AProtocol string `json:"protocol"`

}



type RoomInfo struct {

	RoomName string `json:"roomId"`

}



