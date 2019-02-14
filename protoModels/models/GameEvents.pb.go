// Code generated by protoc-gen-go. DO NOT EDIT.
// source: GameEvents.proto

package proxy_proto_models

import proto "github.com/golang/protobuf/proto"
import fmt "fmt"
import math "math"

// Reference imports to suppress errors if they are not otherwise used.
var _ = proto.Marshal
var _ = fmt.Errorf
var _ = math.Inf

// This is a compile-time assertion to ensure that this generated file
// is compatible with the proto package it is being compiled against.
// A compilation error at this line likely means your copy of the
// proto package needs to be updated.
const _ = proto.ProtoPackageIsVersion2 // please upgrade the proto package

type GameEventType int32

const (
	GameEventType_ROOM_CREATED_EVENT   GameEventType = 0
	GameEventType_ROOM_JOINED_EVENT    GameEventType = 1
	GameEventType_ROOM_LEFT_EVENT      GameEventType = 2
	GameEventType_ROOM_DESTROYED_EVENT GameEventType = 3
	GameEventType_ROOM_FULL_EVENT      GameEventType = 4
	GameEventType_GAME_PAUSED_EVENT    GameEventType = 5
	GameEventType_GAME_RESUMED_EVENT   GameEventType = 6
	GameEventType_GAME_CREATED_EVENT   GameEventType = 7
	GameEventType_GAME_DESTROYED_EVENT GameEventType = 8
	GameEventType_GAME_FINISHED_EVENT  GameEventType = 9
	GameEventType_GAME_STOPPED_EVENT   GameEventType = 10
	GameEventType_GAME_MESSAGE_EVENT   GameEventType = 11
)

var GameEventType_name = map[int32]string{
	0:  "ROOM_CREATED_EVENT",
	1:  "ROOM_JOINED_EVENT",
	2:  "ROOM_LEFT_EVENT",
	3:  "ROOM_DESTROYED_EVENT",
	4:  "ROOM_FULL_EVENT",
	5:  "GAME_PAUSED_EVENT",
	6:  "GAME_RESUMED_EVENT",
	7:  "GAME_CREATED_EVENT",
	8:  "GAME_DESTROYED_EVENT",
	9:  "GAME_FINISHED_EVENT",
	10: "GAME_STOPPED_EVENT",
	11: "GAME_MESSAGE_EVENT",
}
var GameEventType_value = map[string]int32{
	"ROOM_CREATED_EVENT":   0,
	"ROOM_JOINED_EVENT":    1,
	"ROOM_LEFT_EVENT":      2,
	"ROOM_DESTROYED_EVENT": 3,
	"ROOM_FULL_EVENT":      4,
	"GAME_PAUSED_EVENT":    5,
	"GAME_RESUMED_EVENT":   6,
	"GAME_CREATED_EVENT":   7,
	"GAME_DESTROYED_EVENT": 8,
	"GAME_FINISHED_EVENT":  9,
	"GAME_STOPPED_EVENT":   10,
	"GAME_MESSAGE_EVENT":   11,
}

func (x GameEventType) String() string {
	return proto.EnumName(GameEventType_name, int32(x))
}
func (GameEventType) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_GameEvents_3c27ee5be941743d, []int{0}
}

type GameEvent struct {
	GameEventType        GameEventType `protobuf:"varint,1,opt,name=gameEventType,proto3,enum=proxy.proto.models.GameEventType" json:"gameEventType,omitempty"`
	Success              bool          `protobuf:"varint,2,opt,name=success,proto3" json:"success,omitempty"`
	Messsage             []byte        `protobuf:"bytes,3,opt,name=messsage,proto3" json:"messsage,omitempty"`
	XXX_NoUnkeyedLiteral struct{}      `json:"-"`
	XXX_unrecognized     []byte        `json:"-"`
	XXX_sizecache        int32         `json:"-"`
}

func (m *GameEvent) Reset()         { *m = GameEvent{} }
func (m *GameEvent) String() string { return proto.CompactTextString(m) }
func (*GameEvent) ProtoMessage()    {}
func (*GameEvent) Descriptor() ([]byte, []int) {
	return fileDescriptor_GameEvents_3c27ee5be941743d, []int{0}
}
func (m *GameEvent) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_GameEvent.Unmarshal(m, b)
}
func (m *GameEvent) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_GameEvent.Marshal(b, m, deterministic)
}
func (dst *GameEvent) XXX_Merge(src proto.Message) {
	xxx_messageInfo_GameEvent.Merge(dst, src)
}
func (m *GameEvent) XXX_Size() int {
	return xxx_messageInfo_GameEvent.Size(m)
}
func (m *GameEvent) XXX_DiscardUnknown() {
	xxx_messageInfo_GameEvent.DiscardUnknown(m)
}

var xxx_messageInfo_GameEvent proto.InternalMessageInfo

func (m *GameEvent) GetGameEventType() GameEventType {
	if m != nil {
		return m.GameEventType
	}
	return GameEventType_ROOM_CREATED_EVENT
}

func (m *GameEvent) GetSuccess() bool {
	if m != nil {
		return m.Success
	}
	return false
}

func (m *GameEvent) GetMesssage() []byte {
	if m != nil {
		return m.Messsage
	}
	return nil
}

func init() {
	proto.RegisterType((*GameEvent)(nil), "proxy.proto.models.GameEvent")
	proto.RegisterEnum("proxy.proto.models.GameEventType", GameEventType_name, GameEventType_value)
}

func init() { proto.RegisterFile("GameEvents.proto", fileDescriptor_GameEvents_3c27ee5be941743d) }

var fileDescriptor_GameEvents_3c27ee5be941743d = []byte{
	// 290 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0x64, 0xd1, 0x4b, 0x4e, 0xeb, 0x30,
	0x14, 0x06, 0xe0, 0xeb, 0xf6, 0xd2, 0xc7, 0x81, 0x42, 0x71, 0x79, 0x44, 0x8c, 0x0a, 0xa3, 0x88,
	0x41, 0x06, 0xb0, 0x82, 0x88, 0x3a, 0x21, 0x28, 0x2f, 0xd9, 0x0e, 0x12, 0xa3, 0xa8, 0x14, 0xab,
	0x13, 0x42, 0xa2, 0xba, 0x20, 0xba, 0x05, 0xd6, 0xc2, 0x22, 0x51, 0x4c, 0x7a, 0x44, 0x60, 0xf8,
	0x7f, 0xfe, 0x7d, 0x7c, 0x24, 0xc3, 0xd8, 0x9f, 0x17, 0x8a, 0xbd, 0xa9, 0x97, 0xb5, 0x76, 0xaa,
	0x55, 0xb9, 0x2e, 0x29, 0xad, 0x56, 0xe5, 0xfb, 0xe6, 0x3b, 0x38, 0x45, 0xf9, 0xa4, 0x9e, 0xf5,
	0xc5, 0x07, 0x81, 0x21, 0x16, 0xa9, 0x0f, 0xa3, 0xe5, 0x36, 0xc8, 0x4d, 0xa5, 0x2c, 0x32, 0x25,
	0xf6, 0xfe, 0xd5, 0xb9, 0xf3, 0xf7, 0xa6, 0xe3, 0xff, 0x2c, 0xf2, 0xf6, 0x3d, 0x6a, 0x41, 0x5f,
	0xbf, 0x2e, 0x16, 0x4a, 0x6b, 0xab, 0x33, 0x25, 0xf6, 0x80, 0x6f, 0x23, 0x3d, 0x83, 0x41, 0xa1,
	0xb4, 0xd6, 0xf3, 0xa5, 0xb2, 0xba, 0x53, 0x62, 0xef, 0x71, 0xcc, 0x97, 0x9f, 0x1d, 0x18, 0xb5,
	0xc6, 0xd2, 0x13, 0xa0, 0x3c, 0x49, 0xa2, 0xfc, 0x86, 0x33, 0x57, 0xb2, 0x59, 0xce, 0xee, 0x59,
	0x2c, 0xc7, 0xff, 0xe8, 0x31, 0x1c, 0x1a, 0xbf, 0x4b, 0x82, 0x18, 0x99, 0xd0, 0x09, 0x1c, 0x18,
	0x0e, 0x99, 0x27, 0x1b, 0xec, 0x50, 0x0b, 0x8e, 0x0c, 0xce, 0x98, 0x90, 0x3c, 0x79, 0xc0, 0x7a,
	0x17, 0xeb, 0x5e, 0x16, 0x86, 0x0d, 0xfe, 0xaf, 0x47, 0xfb, 0x6e, 0xc4, 0xf2, 0xd4, 0xcd, 0x04,
	0x76, 0x77, 0xea, 0x4d, 0x0c, 0x73, 0x26, 0xb2, 0x08, 0xbd, 0x87, 0xde, 0xde, 0xb0, 0x5f, 0xbf,
	0x6a, 0xfc, 0xf7, 0xab, 0x03, 0x7a, 0x0a, 0x13, 0x73, 0xe2, 0x05, 0x71, 0x20, 0x6e, 0xf1, 0x60,
	0x88, 0xa3, 0x84, 0x4c, 0xd2, 0x14, 0x1d, 0xd0, 0x23, 0x26, 0x84, 0xeb, 0xb3, 0xc6, 0x77, 0x1f,
	0x7b, 0xe6, 0x3f, 0xae, 0xbf, 0x02, 0x00, 0x00, 0xff, 0xff, 0xb1, 0xb6, 0x3b, 0xa2, 0xea, 0x01,
	0x00, 0x00,
}
