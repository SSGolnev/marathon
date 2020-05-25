// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: idb.proto

package idb;

public interface RmRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:idb.RmRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string bundle_id = 1;</code>
   * @return The bundleId.
   */
  java.lang.String getBundleId();
  /**
   * <code>string bundle_id = 1;</code>
   * @return The bytes for bundleId.
   */
  com.google.protobuf.ByteString
      getBundleIdBytes();

  /**
   * <code>repeated string paths = 2;</code>
   * @return A list containing the paths.
   */
  java.util.List<java.lang.String>
      getPathsList();
  /**
   * <code>repeated string paths = 2;</code>
   * @return The count of paths.
   */
  int getPathsCount();
  /**
   * <code>repeated string paths = 2;</code>
   * @param index The index of the element to return.
   * @return The paths at the given index.
   */
  java.lang.String getPaths(int index);
  /**
   * <code>repeated string paths = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the paths at the given index.
   */
  com.google.protobuf.ByteString
      getPathsBytes(int index);
}