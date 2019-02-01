// Code generated by protoc-gen-go. DO NOT EDIT.
// source: Configurator.proto

package com_example_proto

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
	return fileDescriptor_Configurator_60820596f10f56e5, []int{0}
}

type Configurator struct {
	Intent               ActionIntent `protobuf:"varint,1,opt,name=intent,proto3,enum=com.example.proto.ActionIntent" json:"intent,omitempty"`
	MetaData             string       `protobuf:"bytes,2,opt,name=metaData,proto3" json:"metaData,omitempty"`
	XXX_NoUnkeyedLiteral struct{}     `json:"-"`
	XXX_unrecognized     []byte       `json:"-"`
	XXX_sizecache        int32        `json:"-"`
}

func (m *Configurator) Reset()         { *m = Configurator{} }
func (m *Configurator) String() string { return proto.CompactTextString(m) }
func (*Configurator) ProtoMessage()    {}
func (*Configurator) Descriptor() ([]byte, []int) {
	return fileDescriptor_Configurator_60820596f10f56e5, []int{0}
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
	proto.RegisterType((*Configurator)(nil), "com.example.proto.Configurator")
	proto.RegisterEnum("com.example.proto.ActionIntent", ActionIntent_name, ActionIntent_value)
}

func init() { proto.RegisterFile("Configurator.proto", fileDescriptor_Configurator_60820596f10f56e5) }

var fileDescriptor_Configurator_60820596f10f56e5 = []byte{
	// 172 bytes of a gzipped FileDescriptorProto
	0x1f, 0x8b, 0x08, 0x00, 0x00, 0x00, 0x00, 0x00, 0x02, 0xff, 0xe2, 0x12, 0x72, 0xce, 0xcf, 0x4b,
	0xcb, 0x4c, 0x2f, 0x2d, 0x4a, 0x2c, 0xc9, 0x2f, 0xd2, 0x2b, 0x28, 0xca, 0x2f, 0xc9, 0x17, 0x12,
	0x4c, 0xce, 0xcf, 0xd5, 0x4b, 0xad, 0x48, 0xcc, 0x2d, 0xc8, 0x49, 0x85, 0x08, 0x29, 0x25, 0x73,
	0xf1, 0x20, 0x2b, 0x14, 0x32, 0xe7, 0x62, 0xcb, 0xcc, 0x2b, 0x49, 0xcd, 0x2b, 0x91, 0x60, 0x54,
	0x60, 0xd4, 0xe0, 0x33, 0x92, 0xd7, 0xc3, 0xd0, 0xa3, 0xe7, 0x98, 0x5c, 0x92, 0x99, 0x9f, 0xe7,
	0x09, 0x56, 0x16, 0x04, 0x55, 0x2e, 0x24, 0xc5, 0xc5, 0x91, 0x9b, 0x5a, 0x92, 0xe8, 0x92, 0x58,
	0x92, 0x28, 0xc1, 0xa4, 0xc0, 0xa8, 0xc1, 0x19, 0x04, 0xe7, 0x6b, 0x99, 0x73, 0xf1, 0x20, 0xeb,
	0x11, 0x12, 0xe0, 0xe2, 0x71, 0xf6, 0xf1, 0x0f, 0x76, 0x8d, 0x0f, 0xf6, 0x77, 0xf6, 0x76, 0x0d,
	0x11, 0x60, 0x10, 0xe2, 0xe2, 0x62, 0x0b, 0xf6, 0xf3, 0xf7, 0x8f, 0x72, 0x15, 0x60, 0x14, 0xe2,
	0xe4, 0x62, 0x0d, 0x08, 0x0d, 0x72, 0x77, 0x15, 0x60, 0x4a, 0x62, 0x03, 0x5b, 0x68, 0x0c, 0x08,
	0x00, 0x00, 0xff, 0xff, 0xe5, 0xd4, 0xfe, 0x1b, 0xcd, 0x00, 0x00, 0x00,
}
