/**
 * @fileoverview
 * @enhanceable
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

goog.exportSymbol('proto.proxy.proto.models.GameResponse', null, global);
goog.exportSymbol('proto.proxy.proto.models.GameResponseType', null, global);

/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.proxy.proto.models.GameResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.proxy.proto.models.GameResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.proxy.proto.models.GameResponse.displayName = 'proto.proxy.proto.models.GameResponse';
}


if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto suitable for use in Soy templates.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     com.google.apps.jspb.JsClassTemplate.JS_RESERVED_WORDS.
 * @param {boolean=} opt_includeInstance Whether to include the JSPB instance
 *     for transitional soy proto support: http://goto/soy-param-migration
 * @return {!Object}
 */
proto.proxy.proto.models.GameResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.proxy.proto.models.GameResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.proxy.proto.models.GameResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.proxy.proto.models.GameResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    gameresponsetype: jspb.Message.getFieldWithDefault(msg, 1, 0),
    success: jspb.Message.getFieldWithDefault(msg, 2, false),
    messsage: msg.getMesssage_asB64(),
    name: jspb.Message.getFieldWithDefault(msg, 4, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.proxy.proto.models.GameResponse}
 */
proto.proxy.proto.models.GameResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.proxy.proto.models.GameResponse;
  return proto.proxy.proto.models.GameResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.proxy.proto.models.GameResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.proxy.proto.models.GameResponse}
 */
proto.proxy.proto.models.GameResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.proxy.proto.models.GameResponseType} */ (reader.readEnum());
      msg.setGameresponsetype(value);
      break;
    case 2:
      var value = /** @type {boolean} */ (reader.readBool());
      msg.setSuccess(value);
      break;
    case 3:
      var value = /** @type {!Uint8Array} */ (reader.readBytes());
      msg.setMesssage(value);
      break;
    case 4:
      var value = /** @type {string} */ (reader.readString());
      msg.setName(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.proxy.proto.models.GameResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.proxy.proto.models.GameResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.proxy.proto.models.GameResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.proxy.proto.models.GameResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getGameresponsetype();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getSuccess();
  if (f) {
    writer.writeBool(
      2,
      f
    );
  }
  f = message.getMesssage_asU8();
  if (f.length > 0) {
    writer.writeBytes(
      3,
      f
    );
  }
  f = message.getName();
  if (f.length > 0) {
    writer.writeString(
      4,
      f
    );
  }
};


/**
 * optional GameResponseType gameResponseType = 1;
 * @return {!proto.proxy.proto.models.GameResponseType}
 */
proto.proxy.proto.models.GameResponse.prototype.getGameresponsetype = function() {
  return /** @type {!proto.proxy.proto.models.GameResponseType} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/** @param {!proto.proxy.proto.models.GameResponseType} value */
proto.proxy.proto.models.GameResponse.prototype.setGameresponsetype = function(value) {
  jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional bool success = 2;
 * Note that Boolean fields may be set to 0/1 when serialized from a Java server.
 * You should avoid comparisons like {@code val === true/false} in those cases.
 * @return {boolean}
 */
proto.proxy.proto.models.GameResponse.prototype.getSuccess = function() {
  return /** @type {boolean} */ (jspb.Message.getFieldWithDefault(this, 2, false));
};


/** @param {boolean} value */
proto.proxy.proto.models.GameResponse.prototype.setSuccess = function(value) {
  jspb.Message.setProto3BooleanField(this, 2, value);
};


/**
 * optional bytes messsage = 3;
 * @return {!(string|Uint8Array)}
 */
proto.proxy.proto.models.GameResponse.prototype.getMesssage = function() {
  return /** @type {!(string|Uint8Array)} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * optional bytes messsage = 3;
 * This is a type-conversion wrapper around `getMesssage()`
 * @return {string}
 */
proto.proxy.proto.models.GameResponse.prototype.getMesssage_asB64 = function() {
  return /** @type {string} */ (jspb.Message.bytesAsB64(
      this.getMesssage()));
};


/**
 * optional bytes messsage = 3;
 * Note that Uint8Array is not supported on all browsers.
 * @see http://caniuse.com/Uint8Array
 * This is a type-conversion wrapper around `getMesssage()`
 * @return {!Uint8Array}
 */
proto.proxy.proto.models.GameResponse.prototype.getMesssage_asU8 = function() {
  return /** @type {!Uint8Array} */ (jspb.Message.bytesAsU8(
      this.getMesssage()));
};


/** @param {!(string|Uint8Array)} value */
proto.proxy.proto.models.GameResponse.prototype.setMesssage = function(value) {
  jspb.Message.setProto3BytesField(this, 3, value);
};


/**
 * optional string name = 4;
 * @return {string}
 */
proto.proxy.proto.models.GameResponse.prototype.getName = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 4, ""));
};


/** @param {string} value */
proto.proxy.proto.models.GameResponse.prototype.setName = function(value) {
  jspb.Message.setProto3StringField(this, 4, value);
};


/**
 * @enum {number}
 */
proto.proxy.proto.models.GameResponseType = {
  CREATE_ROOM_RESPONSE: 0,
  JOIN_ROOM_RESPONSE: 1,
  LEAVE_ROOM_RESPONSE: 2,
  DESTROY_ROOM_RESPONSE: 3,
  HALT_ROOM_RESPONSE: 4,
  GET_ROOMS_RESPONSE: 5,
  GET_ROOM_DETAILS_RESPONSE: 6,
  KICK_PLAYER_FROM_ROOM_RESPONSE: 7,
  SEND_MESSAGE_RESPONSE: 8,
  GET_STATUS_RESPONSE: 9
};

goog.object.extend(exports, proto.proxy.proto.models);
