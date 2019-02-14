// Code generated by protoc-gen-go. DO NOT EDIT.
// source: Configurator.proto

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

type ActionIntent int32

const (
	ActionIntent_CLOSE_SOCKET ActionIntent = 0
	ActionIntent_SNOOZE       ActionIntent = 1
	ActionIntent_PURGE        ActionIntent = 2
)

var ActionIntent_name = map[int32]string{
	0: "CLOSE_SOCKET",
	1: "SNOOZE",
	2: "PURGE",
}
var ActionIntent_value = map[string]int32{
	"CLOSE_SOCKET": 0,
	"SNOOZE":       1,
	"PURGE":        2,
}

func (x ActionIntent) String() string {
	return proto.EnumName(ActionIntent_name, int32(x))
}
func (ActionIntent) EnumDescriptor() ([]byte, []int) {
	return fileDescriptor_Configurator_8282e442d427d93d, []int{0}
}

type Configurator struct {
	Intent               ActionIntent `protobuf:"varint,1,opt,name=intent,proto3,enum=proxy.proto.models.ActionIntent" json:"intent,omitempty"`
	MetaData             string       `protobuf:"bytes,2,opt,name=metaData,proto3" json:"metaData,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *Configurator) Reset()         { *m = Configurator{} }
func (m *Configurator) String() string { return proto.CompactTextString(m) }
func (*Configurator) ProtoMessage()    {}
func (*Configurator) Descriptor() ([]byte, []int) {
	return fileDescriptor_Configurator_8282e442d427d93d, []int{0}
}
func (m *Configurator) XXX_Unmarshal(b []byte) error {
	return xxx_messageInfo_Configurator.Unmarshal(m, b)
}
func (m *Configurator) XXX_Marshal(b []byte, deterministic bool) ([]byte, error) {
	return xxx_messageInfo_Configurator.Marshal(b, m, deterministic)
}
func (dst *Configurator) XXX_Merge(src proto.Message) {
	xxx_messageInfo_Configurator.Merge(dst, src)
}
func (m *Configurator) XXX_Size() int {
	return xxx_messageInfo_Configurator.Size(m)
}
func (m *Configurator) XXX_DiscardUnknown() {
	xxx_messageInfo_Configurator.DiscardUnknown(m)
}

var xxx_messageInfo_Configurator proto.InternalMessageInfo

func (m *Configurator) GetIntent() ActionIntent {
	if m != nil {
		return m.Intent
	}
	return ActionIntent_CLOSE_SOCKET
}

func (m *Configurator) GetMetaData() string {
	if m != nil {
		return m.MetaData
	}
	return ""
}

func init() {
	proto.RegisterType((*Configurator)(nil), "proxy.proto.models.Configurator")
	proto.RegisterEnum("proxy.proto.models.ActionIntent", ActionIntent_name, ActionIntent_value)
}

func init() { proto.RegisterFile("Configurator.proto", fileDescriptor_Configurator_8282e442d427d93d) }

var fileDescriptor_Configurator_8282e442d427d93d = []byte{
	// 173 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0x72, 0xce, 0xcf, 0x4b,
	0xcb, 0x4c, 0x2f, 0x2d, 0x4a, 0x2c, 0xc9, 0x2f, 0xd2, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x12,
	0x2a, 0x28, 0xca, 0xaf, 0xa8, 0x84, 0x70, 0xf4, 0x72, 0xf3, 0x53, 0x52, 0x73, 0x8a, 0x95, 0x52,
	0xb8, 0x78, 0x90, 0x55, 0x0a, 0x59, 0x70, 0xb1, 0x65, 0xe6, 0x95, 0xa4, 0xe6, 0x95, 0x48, 0x30,
	0x2a, 0x30, 0x6a, 0xf0, 0x19, 0x29, 0xe8, 0x61, 0x6a, 0xd2, 0x73, 0x4c, 0x2e, 0xc9, 0xcc, 0xcf,
	0xf3, 0x04, 0xab, 0x0b, 0x82, 0xaa, 0x17, 0x92, 0xe2, 0xe2, 0xc8, 0x4d, 0x2d, 0x49, 0x74, 0x49,
	0x2c, 0x49, 0x94, 0x60, 0x52, 0x60, 0xd4, 0xe0, 0x0c, 0x82, 0xf3, 0xb5, 0xcc, 0xb9, 0x78, 0x90,
	0xf5, 0x08, 0x09, 0x70, 0xf1, 0x38, 0xfb, 0xf8, 0x07, 0xbb, 0xc6, 0x07, 0xfb, 0x3b, 0x7b, 0xbb,
	0x86, 0x08, 0x30, 0x08, 0x71, 0x71, 0xb1, 0x05, 0xfb, 0xf9, 0xfb, 0x47, 0xb9, 0x0a, 0x30, 0x0a,
	0x71, 0x72, 0xb1, 0x06, 0x84, 0x06, 0xb9, 0xbb, 0x0a, 0x30, 0x25, 0xb1, 0x81, 0xed, 0x35, 0x06,
	0x04, 0x00, 0x00, 0xff, 0xff, 0xac, 0x7c, 0xf3, 0x77, 0xcf, 0x00, 0x00, 0x00,
}