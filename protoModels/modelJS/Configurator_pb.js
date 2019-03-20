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

goog.exportSymbol('proto.proxy.proto.models.ActionIntent', null, global);
goog.exportSymbol('proto.proxy.proto.models.Configurator', null, global);

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
proto.proxy.proto.models.Configurator = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.proxy.proto.models.Configurator, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  proto.proxy.proto.models.Configurator.displayName = 'proto.proxy.proto.models.Configurator';
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
proto.proxy.proto.models.Configurator.prototype.toObject = function(opt_includeInstance) {
  return proto.proxy.proto.models.Configurator.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Whether to include the JSPB
 *     instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.proxy.proto.models.Configurator} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.proxy.proto.models.Configurator.toObject = function(includeInstance, msg) {
  var f, obj = {
    intent: jspb.Message.getFieldWithDefault(msg, 1, 0),
    metadata: jspb.Message.getFieldWithDefault(msg, 2, "")
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
 * @return {!proto.proxy.proto.models.Configurator}
 */
proto.proxy.proto.models.Configurator.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.proxy.proto.models.Configurator;
  return proto.proxy.proto.models.Configurator.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.proxy.proto.models.Configurator} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.proxy.proto.models.Configurator}
 */
proto.proxy.proto.models.Configurator.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {!proto.proxy.proto.models.ActionIntent} */ (reader.readEnum());
      msg.setIntent(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setMetadata(value);
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
proto.proxy.proto.models.Configurator.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.proxy.proto.models.Configurator.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.proxy.proto.models.Configurator} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.proxy.proto.models.Configurator.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getIntent();
  if (f !== 0.0) {
    writer.writeEnum(
      1,
      f
    );
  }
  f = message.getMetadata();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional ActionIntent intent = 1;
 * @return {!proto.proxy.proto.models.ActionIntent}
 */
proto.proxy.proto.models.Configurator.prototype.getIntent = function() {
  return /** @type {!proto.proxy.proto.models.ActionIntent} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/** @param {!proto.proxy.proto.models.ActionIntent} value */
proto.proxy.proto.models.Configurator.prototype.setIntent = function(value) {
  jspb.Message.setProto3EnumField(this, 1, value);
};


/**
 * optional string metaData = 2;
 * @return {string}
 */
proto.proxy.proto.models.Configurator.prototype.getMetadata = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/** @param {string} value */
proto.proxy.proto.models.Configurator.prototype.setMetadata = function(value) {
  jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * @enum {number}
 */
proto.proxy.proto.models.ActionIntent = {
  CLOSE_SOCKET: 0,
  SNOOZE: 1,
  PURGE: 2
};

goog.object.extend(exports, proto.proxy.proto.models);
