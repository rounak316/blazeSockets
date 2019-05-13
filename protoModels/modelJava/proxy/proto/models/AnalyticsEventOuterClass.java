// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AnalyticsEvent.proto

package proxy.proto.models;

public final class AnalyticsEventOuterClass {
  private AnalyticsEventOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AnalyticsEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proxy.proto.models.AnalyticsEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string eventId = 1;</code>
     */
    java.lang.String getEventId();
    /**
     * <code>string eventId = 1;</code>
     */
    com.google.protobuf.ByteString
        getEventIdBytes();

    /**
     * <code>string appId = 2;</code>
     */
    java.lang.String getAppId();
    /**
     * <code>string appId = 2;</code>
     */
    com.google.protobuf.ByteString
        getAppIdBytes();

    /**
     * <code>string timestamp = 3;</code>
     */
    java.lang.String getTimestamp();
    /**
     * <code>string timestamp = 3;</code>
     */
    com.google.protobuf.ByteString
        getTimestampBytes();

    /**
     * <code>string eventPayload = 4;</code>
     */
    java.lang.String getEventPayload();
    /**
     * <code>string eventPayload = 4;</code>
     */
    com.google.protobuf.ByteString
        getEventPayloadBytes();
  }
  /**
   * Protobuf type {@code proxy.proto.models.AnalyticsEvent}
   */
  public  static final class AnalyticsEvent extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proxy.proto.models.AnalyticsEvent)
      AnalyticsEventOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AnalyticsEvent.newBuilder() to construct.
    private AnalyticsEvent(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AnalyticsEvent() {
      eventId_ = "";
      appId_ = "";
      timestamp_ = "";
      eventPayload_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AnalyticsEvent(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              eventId_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              appId_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              timestamp_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              eventPayload_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proxy.proto.models.AnalyticsEventOuterClass.internal_static_proxy_proto_models_AnalyticsEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proxy.proto.models.AnalyticsEventOuterClass.internal_static_proxy_proto_models_AnalyticsEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent.class, proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent.Builder.class);
    }

    public static final int EVENTID_FIELD_NUMBER = 1;
    private volatile java.lang.Object eventId_;
    /**
     * <code>string eventId = 1;</code>
     */
    public java.lang.String getEventId() {
      java.lang.Object ref = eventId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventId_ = s;
        return s;
      }
    }
    /**
     * <code>string eventId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getEventIdBytes() {
      java.lang.Object ref = eventId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int APPID_FIELD_NUMBER = 2;
    private volatile java.lang.Object appId_;
    /**
     * <code>string appId = 2;</code>
     */
    public java.lang.String getAppId() {
      java.lang.Object ref = appId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        appId_ = s;
        return s;
      }
    }
    /**
     * <code>string appId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAppIdBytes() {
      java.lang.Object ref = appId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        appId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private volatile java.lang.Object timestamp_;
    /**
     * <code>string timestamp = 3;</code>
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      }
    }
    /**
     * <code>string timestamp = 3;</code>
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int EVENTPAYLOAD_FIELD_NUMBER = 4;
    private volatile java.lang.Object eventPayload_;
    /**
     * <code>string eventPayload = 4;</code>
     */
    public java.lang.String getEventPayload() {
      java.lang.Object ref = eventPayload_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventPayload_ = s;
        return s;
      }
    }
    /**
     * <code>string eventPayload = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEventPayloadBytes() {
      java.lang.Object ref = eventPayload_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eventPayload_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getEventIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventId_);
      }
      if (!getAppIdBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, appId_);
      }
      if (!getTimestampBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timestamp_);
      }
      if (!getEventPayloadBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, eventPayload_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getEventIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventId_);
      }
      if (!getAppIdBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, appId_);
      }
      if (!getTimestampBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timestamp_);
      }
      if (!getEventPayloadBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, eventPayload_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent)) {
        return super.equals(obj);
      }
      proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent other = (proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent) obj;

      boolean result = true;
      result = result && getEventId()
          .equals(other.getEventId());
      result = result && getAppId()
          .equals(other.getAppId());
      result = result && getTimestamp()
          .equals(other.getTimestamp());
      result = result && getEventPayload()
          .equals(other.getEventPayload());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + EVENTID_FIELD_NUMBER;
      hash = (53 * hash) + getEventId().hashCode();
      hash = (37 * hash) + APPID_FIELD_NUMBER;
      hash = (53 * hash) + getAppId().hashCode();
      hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
      hash = (53 * hash) + getTimestamp().hashCode();
      hash = (37 * hash) + EVENTPAYLOAD_FIELD_NUMBER;
      hash = (53 * hash) + getEventPayload().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code proxy.proto.models.AnalyticsEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proxy.proto.models.AnalyticsEvent)
        proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return proxy.proto.models.AnalyticsEventOuterClass.internal_static_proxy_proto_models_AnalyticsEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return proxy.proto.models.AnalyticsEventOuterClass.internal_static_proxy_proto_models_AnalyticsEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent.class, proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent.Builder.class);
      }

      // Construct using proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        eventId_ = "";

        appId_ = "";

        timestamp_ = "";

        eventPayload_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return proxy.proto.models.AnalyticsEventOuterClass.internal_static_proxy_proto_models_AnalyticsEvent_descriptor;
      }

      @java.lang.Override
      public proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent getDefaultInstanceForType() {
        return proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent.getDefaultInstance();
      }

      @java.lang.Override
      public proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent build() {
        proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent buildPartial() {
        proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent result = new proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent(this);
        result.eventId_ = eventId_;
        result.appId_ = appId_;
        result.timestamp_ = timestamp_;
        result.eventPayload_ = eventPayload_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent) {
          return mergeFrom((proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent other) {
        if (other == proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent.getDefaultInstance()) return this;
        if (!other.getEventId().isEmpty()) {
          eventId_ = other.eventId_;
          onChanged();
        }
        if (!other.getAppId().isEmpty()) {
          appId_ = other.appId_;
          onChanged();
        }
        if (!other.getTimestamp().isEmpty()) {
          timestamp_ = other.timestamp_;
          onChanged();
        }
        if (!other.getEventPayload().isEmpty()) {
          eventPayload_ = other.eventPayload_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object eventId_ = "";
      /**
       * <code>string eventId = 1;</code>
       */
      public java.lang.String getEventId() {
        java.lang.Object ref = eventId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          eventId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string eventId = 1;</code>
       */
      public com.google.protobuf.ByteString
          getEventIdBytes() {
        java.lang.Object ref = eventId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          eventId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string eventId = 1;</code>
       */
      public Builder setEventId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        eventId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string eventId = 1;</code>
       */
      public Builder clearEventId() {
        
        eventId_ = getDefaultInstance().getEventId();
        onChanged();
        return this;
      }
      /**
       * <code>string eventId = 1;</code>
       */
      public Builder setEventIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        eventId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object appId_ = "";
      /**
       * <code>string appId = 2;</code>
       */
      public java.lang.String getAppId() {
        java.lang.Object ref = appId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          appId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string appId = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAppIdBytes() {
        java.lang.Object ref = appId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          appId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string appId = 2;</code>
       */
      public Builder setAppId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        appId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string appId = 2;</code>
       */
      public Builder clearAppId() {
        
        appId_ = getDefaultInstance().getAppId();
        onChanged();
        return this;
      }
      /**
       * <code>string appId = 2;</code>
       */
      public Builder setAppIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        appId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object timestamp_ = "";
      /**
       * <code>string timestamp = 3;</code>
       */
      public java.lang.String getTimestamp() {
        java.lang.Object ref = timestamp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          timestamp_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string timestamp = 3;</code>
       */
      public com.google.protobuf.ByteString
          getTimestampBytes() {
        java.lang.Object ref = timestamp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          timestamp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string timestamp = 3;</code>
       */
      public Builder setTimestamp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        timestamp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 3;</code>
       */
      public Builder clearTimestamp() {
        
        timestamp_ = getDefaultInstance().getTimestamp();
        onChanged();
        return this;
      }
      /**
       * <code>string timestamp = 3;</code>
       */
      public Builder setTimestampBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        timestamp_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object eventPayload_ = "";
      /**
       * <code>string eventPayload = 4;</code>
       */
      public java.lang.String getEventPayload() {
        java.lang.Object ref = eventPayload_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          eventPayload_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string eventPayload = 4;</code>
       */
      public com.google.protobuf.ByteString
          getEventPayloadBytes() {
        java.lang.Object ref = eventPayload_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          eventPayload_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string eventPayload = 4;</code>
       */
      public Builder setEventPayload(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        eventPayload_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string eventPayload = 4;</code>
       */
      public Builder clearEventPayload() {
        
        eventPayload_ = getDefaultInstance().getEventPayload();
        onChanged();
        return this;
      }
      /**
       * <code>string eventPayload = 4;</code>
       */
      public Builder setEventPayloadBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        eventPayload_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:proxy.proto.models.AnalyticsEvent)
    }

    // @@protoc_insertion_point(class_scope:proxy.proto.models.AnalyticsEvent)
    private static final proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent();
    }

    public static proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AnalyticsEvent>
        PARSER = new com.google.protobuf.AbstractParser<AnalyticsEvent>() {
      @java.lang.Override
      public AnalyticsEvent parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AnalyticsEvent(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AnalyticsEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AnalyticsEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public proxy.proto.models.AnalyticsEventOuterClass.AnalyticsEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proxy_proto_models_AnalyticsEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proxy_proto_models_AnalyticsEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024AnalyticsEvent.proto\022\022proxy.proto.mode" +
      "ls\"Y\n\016AnalyticsEvent\022\017\n\007eventId\030\001 \001(\t\022\r\n" +
      "\005appId\030\002 \001(\t\022\021\n\ttimestamp\030\003 \001(\t\022\024\n\014event" +
      "Payload\030\004 \001(\tB\'\252\002$Google.Protobuf.Exampl" +
      "es.AddressBookb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_proxy_proto_models_AnalyticsEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proxy_proto_models_AnalyticsEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proxy_proto_models_AnalyticsEvent_descriptor,
        new java.lang.String[] { "EventId", "AppId", "Timestamp", "EventPayload", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}