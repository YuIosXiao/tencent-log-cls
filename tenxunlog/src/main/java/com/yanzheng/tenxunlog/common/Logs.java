package com.yanzheng.tenxunlog.common;

public final class Logs {
    private Logs() {}
    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistryLite registry) {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions(
                (com.google.protobuf.ExtensionRegistryLite) registry);
    }
    public interface LogOrBuilder extends
            // @@protoc_insertion_point(interface_extends:cls.Log)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 时间戳，UNIX时间格式
         * </pre>
         *
         * <code>required int64 time = 1;</code>
         * @return Whether the time field is set.
         */
        boolean hasTime();
        /**
         * <pre>
         * 时间戳，UNIX时间格式
         * </pre>
         *
         * <code>required int64 time = 1;</code>
         * @return The time.
         */
        long getTime();

        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        java.util.List<Log.Content>
        getContentsList();
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        Log.Content getContents(int index);
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        int getContentsCount();
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        java.util.List<? extends Log.ContentOrBuilder>
        getContentsOrBuilderList();
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        Log.ContentOrBuilder getContentsOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code cls.Log}
     */
    public static final class Log extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:cls.Log)
            LogOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use Log.newBuilder() to construct.
        private Log(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private Log() {
            contents_ = java.util.Collections.emptyList();
        }

        @Override
        @SuppressWarnings({"unused"})
        protected Object newInstance(
                UnusedPrivateParameter unused) {
            return new Log();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private Log(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
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
                        case 8: {
                            bitField0_ |= 0x00000001;
                            time_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                                contents_ = new java.util.ArrayList<Content>();
                                mutable_bitField0_ |= 0x00000002;
                            }
                            contents_.add(
                                    input.readMessage(Content.PARSER, extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
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
                if (((mutable_bitField0_ & 0x00000002) != 0)) {
                    contents_ = java.util.Collections.unmodifiableList(contents_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Logs.internal_static_cls_Log_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Logs.internal_static_cls_Log_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Log.class, Builder.class);
        }

        public interface ContentOrBuilder extends
                // @@protoc_insertion_point(interface_extends:cls.Log.Content)
                com.google.protobuf.MessageOrBuilder {

            /**
             * <pre>
             * 每组字段的 key
             * </pre>
             *
             * <code>required string key = 1;</code>
             * @return Whether the key field is set.
             */
            boolean hasKey();
            /**
             * <pre>
             * 每组字段的 key
             * </pre>
             *
             * <code>required string key = 1;</code>
             * @return The key.
             */
            String getKey();
            /**
             * <pre>
             * 每组字段的 key
             * </pre>
             *
             * <code>required string key = 1;</code>
             * @return The bytes for key.
             */
            com.google.protobuf.ByteString
            getKeyBytes();

            /**
             * <pre>
             * 每组字段的 value
             * </pre>
             *
             * <code>required string value = 2;</code>
             * @return Whether the value field is set.
             */
            boolean hasValue();
            /**
             * <pre>
             * 每组字段的 value
             * </pre>
             *
             * <code>required string value = 2;</code>
             * @return The value.
             */
            String getValue();
            /**
             * <pre>
             * 每组字段的 value
             * </pre>
             *
             * <code>required string value = 2;</code>
             * @return The bytes for value.
             */
            com.google.protobuf.ByteString
            getValueBytes();
        }
        /**
         * Protobuf type {@code cls.Log.Content}
         */
        public static final class Content extends
                com.google.protobuf.GeneratedMessageV3 implements
                // @@protoc_insertion_point(message_implements:cls.Log.Content)
                ContentOrBuilder {
            private static final long serialVersionUID = 0L;
            // Use Content.newBuilder() to construct.
            private Content(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
                super(builder);
            }
            private Content() {
                key_ = "";
                value_ = "";
            }

            @Override
            @SuppressWarnings({"unused"})
            protected Object newInstance(
                    UnusedPrivateParameter unused) {
                return new Content();
            }

            @Override
            public final com.google.protobuf.UnknownFieldSet
            getUnknownFields() {
                return this.unknownFields;
            }
            private Content(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                this();
                if (extensionRegistry == null) {
                    throw new NullPointerException();
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
                                com.google.protobuf.ByteString bs = input.readBytes();
                                bitField0_ |= 0x00000001;
                                key_ = bs;
                                break;
                            }
                            case 18: {
                                com.google.protobuf.ByteString bs = input.readBytes();
                                bitField0_ |= 0x00000002;
                                value_ = bs;
                                break;
                            }
                            default: {
                                if (!parseUnknownField(
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
                return Logs.internal_static_cls_Log_Content_descriptor;
            }

            @Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Logs.internal_static_cls_Log_Content_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Content.class, Builder.class);
            }

            private int bitField0_;
            public static final int KEY_FIELD_NUMBER = 1;
            private volatile Object key_;
            /**
             * <pre>
             * 每组字段的 key
             * </pre>
             *
             * <code>required string key = 1;</code>
             * @return Whether the key field is set.
             */
            @Override
            public boolean hasKey() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <pre>
             * 每组字段的 key
             * </pre>
             *
             * <code>required string key = 1;</code>
             * @return The key.
             */
            @Override
            public String getKey() {
                Object ref = key_;
                if (ref instanceof String) {
                    return (String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        key_ = s;
                    }
                    return s;
                }
            }
            /**
             * <pre>
             * 每组字段的 key
             * </pre>
             *
             * <code>required string key = 1;</code>
             * @return The bytes for key.
             */
            @Override
            public com.google.protobuf.ByteString
            getKeyBytes() {
                Object ref = key_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    key_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            public static final int VALUE_FIELD_NUMBER = 2;
            private volatile Object value_;
            /**
             * <pre>
             * 每组字段的 value
             * </pre>
             *
             * <code>required string value = 2;</code>
             * @return Whether the value field is set.
             */
            @Override
            public boolean hasValue() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <pre>
             * 每组字段的 value
             * </pre>
             *
             * <code>required string value = 2;</code>
             * @return The value.
             */
            @Override
            public String getValue() {
                Object ref = value_;
                if (ref instanceof String) {
                    return (String) ref;
                } else {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        value_ = s;
                    }
                    return s;
                }
            }
            /**
             * <pre>
             * 每组字段的 value
             * </pre>
             *
             * <code>required string value = 2;</code>
             * @return The bytes for value.
             */
            @Override
            public com.google.protobuf.ByteString
            getValueBytes() {
                Object ref = value_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            private byte memoizedIsInitialized = -1;
            @Override
            public final boolean isInitialized() {
                byte isInitialized = memoizedIsInitialized;
                if (isInitialized == 1) return true;
                if (isInitialized == 0) return false;

                if (!hasKey()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                if (!hasValue()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
                memoizedIsInitialized = 1;
                return true;
            }

            @Override
            public void writeTo(com.google.protobuf.CodedOutputStream output)
                    throws java.io.IOException {
                if (((bitField0_ & 0x00000001) != 0)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
                }
                if (((bitField0_ & 0x00000002) != 0)) {
                    com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
                }
                unknownFields.writeTo(output);
            }

            @Override
            public int getSerializedSize() {
                int size = memoizedSize;
                if (size != -1) return size;

                size = 0;
                if (((bitField0_ & 0x00000001) != 0)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
                }
                if (((bitField0_ & 0x00000002) != 0)) {
                    size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
                }
                size += unknownFields.getSerializedSize();
                memoizedSize = size;
                return size;
            }

            @Override
            public boolean equals(final Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Content)) {
                    return super.equals(obj);
                }
                Content other = (Content) obj;

                if (hasKey() != other.hasKey()) return false;
                if (hasKey()) {
                    if (!getKey()
                            .equals(other.getKey())) return false;
                }
                if (hasValue() != other.hasValue()) return false;
                if (hasValue()) {
                    if (!getValue()
                            .equals(other.getValue())) return false;
                }
                if (!unknownFields.equals(other.unknownFields)) return false;
                return true;
            }

            @Override
            public int hashCode() {
                if (memoizedHashCode != 0) {
                    return memoizedHashCode;
                }
                int hash = 41;
                hash = (19 * hash) + getDescriptor().hashCode();
                if (hasKey()) {
                    hash = (37 * hash) + KEY_FIELD_NUMBER;
                    hash = (53 * hash) + getKey().hashCode();
                }
                if (hasValue()) {
                    hash = (37 * hash) + VALUE_FIELD_NUMBER;
                    hash = (53 * hash) + getValue().hashCode();
                }
                hash = (29 * hash) + unknownFields.hashCode();
                memoizedHashCode = hash;
                return hash;
            }

            public static Content parseFrom(
                    java.nio.ByteBuffer data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Content parseFrom(
                    java.nio.ByteBuffer data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Content parseFrom(
                    com.google.protobuf.ByteString data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Content parseFrom(
                    com.google.protobuf.ByteString data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Content parseFrom(byte[] data)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data);
            }
            public static Content parseFrom(
                    byte[] data,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return PARSER.parseFrom(data, extensionRegistry);
            }
            public static Content parseFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static Content parseFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }
            public static Content parseDelimitedFrom(java.io.InputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input);
            }
            public static Content parseDelimitedFrom(
                    java.io.InputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
            }
            public static Content parseFrom(
                    com.google.protobuf.CodedInputStream input)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input);
            }
            public static Content parseFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                return com.google.protobuf.GeneratedMessageV3
                        .parseWithIOException(PARSER, input, extensionRegistry);
            }

            @Override
            public Builder newBuilderForType() { return newBuilder(); }
            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }
            public static Builder newBuilder(Content prototype) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
            }
            @Override
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE
                        ? new Builder() : new Builder().mergeFrom(this);
            }

            @Override
            protected Builder newBuilderForType(
                    com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                Builder builder = new Builder(parent);
                return builder;
            }
            /**
             * Protobuf type {@code cls.Log.Content}
             */
            public static final class Builder extends
                    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                    // @@protoc_insertion_point(builder_implements:cls.Log.Content)
                    ContentOrBuilder {
                public static final com.google.protobuf.Descriptors.Descriptor
                getDescriptor() {
                    return Logs.internal_static_cls_Log_Content_descriptor;
                }

                @Override
                protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
                    return Logs.internal_static_cls_Log_Content_fieldAccessorTable
                            .ensureFieldAccessorsInitialized(
                                    Content.class, Builder.class);
                }

                // Construct using cls.Aa.Log.Content.newBuilder()
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
                @Override
                public Builder clear() {
                    super.clear();
                    key_ = "";
                    bitField0_ = (bitField0_ & ~0x00000001);
                    value_ = "";
                    bitField0_ = (bitField0_ & ~0x00000002);
                    return this;
                }

                @Override
                public com.google.protobuf.Descriptors.Descriptor
                getDescriptorForType() {
                    return Logs.internal_static_cls_Log_Content_descriptor;
                }

                @Override
                public Content getDefaultInstanceForType() {
                    return Content.getDefaultInstance();
                }

                @Override
                public Content build() {
                    Content result = buildPartial();
                    if (!result.isInitialized()) {
                        throw newUninitializedMessageException(result);
                    }
                    return result;
                }

                @Override
                public Content buildPartial() {
                    Content result = new Content(this);
                    int from_bitField0_ = bitField0_;
                    int to_bitField0_ = 0;
                    if (((from_bitField0_ & 0x00000001) != 0)) {
                        to_bitField0_ |= 0x00000001;
                    }
                    result.key_ = key_;
                    if (((from_bitField0_ & 0x00000002) != 0)) {
                        to_bitField0_ |= 0x00000002;
                    }
                    result.value_ = value_;
                    result.bitField0_ = to_bitField0_;
                    onBuilt();
                    return result;
                }

                @Override
                public Builder clone() {
                    return super.clone();
                }
                @Override
                public Builder setField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.setField(field, value);
                }
                @Override
                public Builder clearField(
                        com.google.protobuf.Descriptors.FieldDescriptor field) {
                    return super.clearField(field);
                }
                @Override
                public Builder clearOneof(
                        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                    return super.clearOneof(oneof);
                }
                @Override
                public Builder setRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        int index, Object value) {
                    return super.setRepeatedField(field, index, value);
                }
                @Override
                public Builder addRepeatedField(
                        com.google.protobuf.Descriptors.FieldDescriptor field,
                        Object value) {
                    return super.addRepeatedField(field, value);
                }
                @Override
                public Builder mergeFrom(com.google.protobuf.Message other) {
                    if (other instanceof Content) {
                        return mergeFrom((Content)other);
                    } else {
                        super.mergeFrom(other);
                        return this;
                    }
                }

                public Builder mergeFrom(Content other) {
                    if (other == Content.getDefaultInstance()) return this;
                    if (other.hasKey()) {
                        bitField0_ |= 0x00000001;
                        key_ = other.key_;
                        onChanged();
                    }
                    if (other.hasValue()) {
                        bitField0_ |= 0x00000002;
                        value_ = other.value_;
                        onChanged();
                    }
                    this.mergeUnknownFields(other.unknownFields);
                    onChanged();
                    return this;
                }

                @Override
                public final boolean isInitialized() {
                    if (!hasKey()) {
                        return false;
                    }
                    if (!hasValue()) {
                        return false;
                    }
                    return true;
                }

                @Override
                public Builder mergeFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws java.io.IOException {
                    Content parsedMessage = null;
                    try {
                        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                        parsedMessage = (Content) e.getUnfinishedMessage();
                        throw e.unwrapIOException();
                    } finally {
                        if (parsedMessage != null) {
                            mergeFrom(parsedMessage);
                        }
                    }
                    return this;
                }
                private int bitField0_;

                private Object key_ = "";
                /**
                 * <pre>
                 * 每组字段的 key
                 * </pre>
                 *
                 * <code>required string key = 1;</code>
                 * @return Whether the key field is set.
                 */
                public boolean hasKey() {
                    return ((bitField0_ & 0x00000001) != 0);
                }
                /**
                 * <pre>
                 * 每组字段的 key
                 * </pre>
                 *
                 * <code>required string key = 1;</code>
                 * @return The key.
                 */
                public String getKey() {
                    Object ref = key_;
                    if (!(ref instanceof String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        String s = bs.toStringUtf8();
                        if (bs.isValidUtf8()) {
                            key_ = s;
                        }
                        return s;
                    } else {
                        return (String) ref;
                    }
                }
                /**
                 * <pre>
                 * 每组字段的 key
                 * </pre>
                 *
                 * <code>required string key = 1;</code>
                 * @return The bytes for key.
                 */
                public com.google.protobuf.ByteString
                getKeyBytes() {
                    Object ref = key_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (String) ref);
                        key_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <pre>
                 * 每组字段的 key
                 * </pre>
                 *
                 * <code>required string key = 1;</code>
                 * @param value The key to set.
                 * @return This builder for chaining.
                 */
                public Builder setKey(
                        String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    key_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * 每组字段的 key
                 * </pre>
                 *
                 * <code>required string key = 1;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearKey() {
                    bitField0_ = (bitField0_ & ~0x00000001);
                    key_ = getDefaultInstance().getKey();
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * 每组字段的 key
                 * </pre>
                 *
                 * <code>required string key = 1;</code>
                 * @param value The bytes for key to set.
                 * @return This builder for chaining.
                 */
                public Builder setKeyBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000001;
                    key_ = value;
                    onChanged();
                    return this;
                }

                private Object value_ = "";
                /**
                 * <pre>
                 * 每组字段的 value
                 * </pre>
                 *
                 * <code>required string value = 2;</code>
                 * @return Whether the value field is set.
                 */
                public boolean hasValue() {
                    return ((bitField0_ & 0x00000002) != 0);
                }
                /**
                 * <pre>
                 * 每组字段的 value
                 * </pre>
                 *
                 * <code>required string value = 2;</code>
                 * @return The value.
                 */
                public String getValue() {
                    Object ref = value_;
                    if (!(ref instanceof String)) {
                        com.google.protobuf.ByteString bs =
                                (com.google.protobuf.ByteString) ref;
                        String s = bs.toStringUtf8();
                        if (bs.isValidUtf8()) {
                            value_ = s;
                        }
                        return s;
                    } else {
                        return (String) ref;
                    }
                }
                /**
                 * <pre>
                 * 每组字段的 value
                 * </pre>
                 *
                 * <code>required string value = 2;</code>
                 * @return The bytes for value.
                 */
                public com.google.protobuf.ByteString
                getValueBytes() {
                    Object ref = value_;
                    if (ref instanceof String) {
                        com.google.protobuf.ByteString b =
                                com.google.protobuf.ByteString.copyFromUtf8(
                                        (String) ref);
                        value_ = b;
                        return b;
                    } else {
                        return (com.google.protobuf.ByteString) ref;
                    }
                }
                /**
                 * <pre>
                 * 每组字段的 value
                 * </pre>
                 *
                 * <code>required string value = 2;</code>
                 * @param value The value to set.
                 * @return This builder for chaining.
                 */
                public Builder setValue(
                        String value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    value_ = value;
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * 每组字段的 value
                 * </pre>
                 *
                 * <code>required string value = 2;</code>
                 * @return This builder for chaining.
                 */
                public Builder clearValue() {
                    bitField0_ = (bitField0_ & ~0x00000002);
                    value_ = getDefaultInstance().getValue();
                    onChanged();
                    return this;
                }
                /**
                 * <pre>
                 * 每组字段的 value
                 * </pre>
                 *
                 * <code>required string value = 2;</code>
                 * @param value The bytes for value to set.
                 * @return This builder for chaining.
                 */
                public Builder setValueBytes(
                        com.google.protobuf.ByteString value) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    bitField0_ |= 0x00000002;
                    value_ = value;
                    onChanged();
                    return this;
                }
                @Override
                public final Builder setUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.setUnknownFields(unknownFields);
                }

                @Override
                public final Builder mergeUnknownFields(
                        final com.google.protobuf.UnknownFieldSet unknownFields) {
                    return super.mergeUnknownFields(unknownFields);
                }


                // @@protoc_insertion_point(builder_scope:cls.Log.Content)
            }

            // @@protoc_insertion_point(class_scope:cls.Log.Content)
            private static final Content DEFAULT_INSTANCE;
            static {
                DEFAULT_INSTANCE = new Content();
            }

            public static Content getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            @Deprecated public static final com.google.protobuf.Parser<Content>
                    PARSER = new com.google.protobuf.AbstractParser<Content>() {
                @Override
                public Content parsePartialFrom(
                        com.google.protobuf.CodedInputStream input,
                        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                        throws com.google.protobuf.InvalidProtocolBufferException {
                    return new Content(input, extensionRegistry);
                }
            };

            public static com.google.protobuf.Parser<Content> parser() {
                return PARSER;
            }

            @Override
            public com.google.protobuf.Parser<Content> getParserForType() {
                return PARSER;
            }

            @Override
            public Content getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

        }

        private int bitField0_;
        public static final int TIME_FIELD_NUMBER = 1;
        private long time_;
        /**
         * <pre>
         * 时间戳，UNIX时间格式
         * </pre>
         *
         * <code>required int64 time = 1;</code>
         * @return Whether the time field is set.
         */
        @Override
        public boolean hasTime() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * 时间戳，UNIX时间格式
         * </pre>
         *
         * <code>required int64 time = 1;</code>
         * @return The time.
         */
        @Override
        public long getTime() {
            return time_;
        }

        public static final int CONTENTS_FIELD_NUMBER = 2;
        private java.util.List<Content> contents_;
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        @Override
        public java.util.List<Content> getContentsList() {
            return contents_;
        }
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        @Override
        public java.util.List<? extends ContentOrBuilder>
        getContentsOrBuilderList() {
            return contents_;
        }
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        @Override
        public int getContentsCount() {
            return contents_.size();
        }
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        @Override
        public Content getContents(int index) {
            return contents_.get(index);
        }
        /**
         * <pre>
         * 一条日志里的多个kv组合
         * </pre>
         *
         * <code>repeated .cls.Log.Content contents = 2;</code>
         */
        @Override
        public ContentOrBuilder getContentsOrBuilder(
                int index) {
            return contents_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasTime()) {
                memoizedIsInitialized = 0;
                return false;
            }
            for (int i = 0; i < getContentsCount(); i++) {
                if (!getContents(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) != 0)) {
                output.writeInt64(1, time_);
            }
            for (int i = 0; i < contents_.size(); i++) {
                output.writeMessage(2, contents_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, time_);
            }
            for (int i = 0; i < contents_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(2, contents_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Log)) {
                return super.equals(obj);
            }
            Log other = (Log) obj;

            if (hasTime() != other.hasTime()) return false;
            if (hasTime()) {
                if (getTime()
                        != other.getTime()) return false;
            }
            if (!getContentsList()
                    .equals(other.getContentsList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasTime()) {
                hash = (37 * hash) + TIME_FIELD_NUMBER;
                hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                        getTime());
            }
            if (getContentsCount() > 0) {
                hash = (37 * hash) + CONTENTS_FIELD_NUMBER;
                hash = (53 * hash) + getContentsList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static Log parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Log parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Log parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Log parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Log parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static Log parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static Log parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Log parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static Log parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static Log parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static Log parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static Log parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(Log prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code cls.Log}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:cls.Log)
                LogOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Logs.internal_static_cls_Log_descriptor;
            }

            @Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Logs.internal_static_cls_Log_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                Log.class, Builder.class);
            }

            // Construct using cls.Aa.Log.newBuilder()
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
                    getContentsFieldBuilder();
                }
            }
            @Override
            public Builder clear() {
                super.clear();
                time_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                if (contentsBuilder_ == null) {
                    contents_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    contentsBuilder_.clear();
                }
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Logs.internal_static_cls_Log_descriptor;
            }

            @Override
            public Log getDefaultInstanceForType() {
                return Log.getDefaultInstance();
            }

            @Override
            public Log build() {
                Log result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public Log buildPartial() {
                Log result = new Log(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    result.time_ = time_;
                    to_bitField0_ |= 0x00000001;
                }
                if (contentsBuilder_ == null) {
                    if (((bitField0_ & 0x00000002) != 0)) {
                        contents_ = java.util.Collections.unmodifiableList(contents_);
                        bitField0_ = (bitField0_ & ~0x00000002);
                    }
                    result.contents_ = contents_;
                } else {
                    result.contents_ = contentsBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }
            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }
            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }
            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof Log) {
                    return mergeFrom((Log)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(Log other) {
                if (other == Log.getDefaultInstance()) return this;
                if (other.hasTime()) {
                    setTime(other.getTime());
                }
                if (contentsBuilder_ == null) {
                    if (!other.contents_.isEmpty()) {
                        if (contents_.isEmpty()) {
                            contents_ = other.contents_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                        } else {
                            ensureContentsIsMutable();
                            contents_.addAll(other.contents_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.contents_.isEmpty()) {
                        if (contentsBuilder_.isEmpty()) {
                            contentsBuilder_.dispose();
                            contentsBuilder_ = null;
                            contents_ = other.contents_;
                            bitField0_ = (bitField0_ & ~0x00000002);
                            contentsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getContentsFieldBuilder() : null;
                        } else {
                            contentsBuilder_.addAllMessages(other.contents_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                if (!hasTime()) {
                    return false;
                }
                for (int i = 0; i < getContentsCount(); i++) {
                    if (!getContents(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                Log parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (Log) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private long time_ ;
            /**
             * <pre>
             * 时间戳，UNIX时间格式
             * </pre>
             *
             * <code>required int64 time = 1;</code>
             * @return Whether the time field is set.
             */
            @Override
            public boolean hasTime() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <pre>
             * 时间戳，UNIX时间格式
             * </pre>
             *
             * <code>required int64 time = 1;</code>
             * @return The time.
             */
            @Override
            public long getTime() {
                return time_;
            }
            /**
             * <pre>
             * 时间戳，UNIX时间格式
             * </pre>
             *
             * <code>required int64 time = 1;</code>
             * @param value The time to set.
             * @return This builder for chaining.
             */
            public Builder setTime(long value) {
                bitField0_ |= 0x00000001;
                time_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 时间戳，UNIX时间格式
             * </pre>
             *
             * <code>required int64 time = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearTime() {
                bitField0_ = (bitField0_ & ~0x00000001);
                time_ = 0L;
                onChanged();
                return this;
            }

            private java.util.List<Content> contents_ =
                    java.util.Collections.emptyList();
            private void ensureContentsIsMutable() {
                if (!((bitField0_ & 0x00000002) != 0)) {
                    contents_ = new java.util.ArrayList<Content>(contents_);
                    bitField0_ |= 0x00000002;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    Content, Content.Builder, ContentOrBuilder> contentsBuilder_;

            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public java.util.List<Content> getContentsList() {
                if (contentsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(contents_);
                } else {
                    return contentsBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public int getContentsCount() {
                if (contentsBuilder_ == null) {
                    return contents_.size();
                } else {
                    return contentsBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Content getContents(int index) {
                if (contentsBuilder_ == null) {
                    return contents_.get(index);
                } else {
                    return contentsBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder setContents(
                    int index, Content value) {
                if (contentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureContentsIsMutable();
                    contents_.set(index, value);
                    onChanged();
                } else {
                    contentsBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder setContents(
                    int index, Content.Builder builderForValue) {
                if (contentsBuilder_ == null) {
                    ensureContentsIsMutable();
                    contents_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    contentsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder addContents(Content value) {
                if (contentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureContentsIsMutable();
                    contents_.add(value);
                    onChanged();
                } else {
                    contentsBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder addContents(
                    int index, Content value) {
                if (contentsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureContentsIsMutable();
                    contents_.add(index, value);
                    onChanged();
                } else {
                    contentsBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder addContents(
                    Content.Builder builderForValue) {
                if (contentsBuilder_ == null) {
                    ensureContentsIsMutable();
                    contents_.add(builderForValue.build());
                    onChanged();
                } else {
                    contentsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder addContents(
                    int index, Content.Builder builderForValue) {
                if (contentsBuilder_ == null) {
                    ensureContentsIsMutable();
                    contents_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    contentsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder addAllContents(
                    Iterable<? extends Content> values) {
                if (contentsBuilder_ == null) {
                    ensureContentsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, contents_);
                    onChanged();
                } else {
                    contentsBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder clearContents() {
                if (contentsBuilder_ == null) {
                    contents_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000002);
                    onChanged();
                } else {
                    contentsBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Builder removeContents(int index) {
                if (contentsBuilder_ == null) {
                    ensureContentsIsMutable();
                    contents_.remove(index);
                    onChanged();
                } else {
                    contentsBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Content.Builder getContentsBuilder(
                    int index) {
                return getContentsFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public ContentOrBuilder getContentsOrBuilder(
                    int index) {
                if (contentsBuilder_ == null) {
                    return contents_.get(index);  } else {
                    return contentsBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public java.util.List<? extends ContentOrBuilder>
            getContentsOrBuilderList() {
                if (contentsBuilder_ != null) {
                    return contentsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(contents_);
                }
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Content.Builder addContentsBuilder() {
                return getContentsFieldBuilder().addBuilder(
                        Content.getDefaultInstance());
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public Content.Builder addContentsBuilder(
                    int index) {
                return getContentsFieldBuilder().addBuilder(
                        index, Content.getDefaultInstance());
            }
            /**
             * <pre>
             * 一条日志里的多个kv组合
             * </pre>
             *
             * <code>repeated .cls.Log.Content contents = 2;</code>
             */
            public java.util.List<Content.Builder>
            getContentsBuilderList() {
                return getContentsFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    Content, Content.Builder, ContentOrBuilder>
            getContentsFieldBuilder() {
                if (contentsBuilder_ == null) {
                    contentsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            Content, Content.Builder, ContentOrBuilder>(
                            contents_,
                            ((bitField0_ & 0x00000002) != 0),
                            getParentForChildren(),
                            isClean());
                    contents_ = null;
                }
                return contentsBuilder_;
            }
            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:cls.Log)
        }

        // @@protoc_insertion_point(class_scope:cls.Log)
        private static final Log DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new Log();
        }

        public static Log getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<Log>
                PARSER = new com.google.protobuf.AbstractParser<Log>() {
            @Override
            public Log parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new Log(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<Log> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<Log> getParserForType() {
            return PARSER;
        }

        @Override
        public Log getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LogTagOrBuilder extends
            // @@protoc_insertion_point(interface_extends:cls.LogTag)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>required string key = 1;</code>
         * @return Whether the key field is set.
         */
        boolean hasKey();
        /**
         * <code>required string key = 1;</code>
         * @return The key.
         */
        String getKey();
        /**
         * <code>required string key = 1;</code>
         * @return The bytes for key.
         */
        com.google.protobuf.ByteString
        getKeyBytes();

        /**
         * <code>required string value = 2;</code>
         * @return Whether the value field is set.
         */
        boolean hasValue();
        /**
         * <code>required string value = 2;</code>
         * @return The value.
         */
        String getValue();
        /**
         * <code>required string value = 2;</code>
         * @return The bytes for value.
         */
        com.google.protobuf.ByteString
        getValueBytes();
    }
    /**
     * Protobuf type {@code cls.LogTag}
     */
    public static final class LogTag extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:cls.LogTag)
            LogTagOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LogTag.newBuilder() to construct.
        private LogTag(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LogTag() {
            key_ = "";
            value_ = "";
        }

        @Override
        @SuppressWarnings({"unused"})
        protected Object newInstance(
                UnusedPrivateParameter unused) {
            return new LogTag();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private LogTag(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
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
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            key_ = bs;
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            value_ = bs;
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
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
            return Logs.internal_static_cls_LogTag_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Logs.internal_static_cls_LogTag_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            LogTag.class, Builder.class);
        }

        private int bitField0_;
        public static final int KEY_FIELD_NUMBER = 1;
        private volatile Object key_;
        /**
         * <code>required string key = 1;</code>
         * @return Whether the key field is set.
         */
        @Override
        public boolean hasKey() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <code>required string key = 1;</code>
         * @return The key.
         */
        @Override
        public String getKey() {
            Object ref = key_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    key_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string key = 1;</code>
         * @return The bytes for key.
         */
        @Override
        public com.google.protobuf.ByteString
        getKeyBytes() {
            Object ref = key_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                key_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int VALUE_FIELD_NUMBER = 2;
        private volatile Object value_;
        /**
         * <code>required string value = 2;</code>
         * @return Whether the value field is set.
         */
        @Override
        public boolean hasValue() {
            return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <code>required string value = 2;</code>
         * @return The value.
         */
        @Override
        public String getValue() {
            Object ref = value_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    value_ = s;
                }
                return s;
            }
        }
        /**
         * <code>required string value = 2;</code>
         * @return The bytes for value.
         */
        @Override
        public com.google.protobuf.ByteString
        getValueBytes() {
            Object ref = value_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                value_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private byte memoizedIsInitialized = -1;
        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            if (!hasKey()) {
                memoizedIsInitialized = 0;
                return false;
            }
            if (!hasValue()) {
                memoizedIsInitialized = 0;
                return false;
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            if (((bitField0_ & 0x00000001) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, value_);
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, value_);
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LogTag)) {
                return super.equals(obj);
            }
            LogTag other = (LogTag) obj;

            if (hasKey() != other.hasKey()) return false;
            if (hasKey()) {
                if (!getKey()
                        .equals(other.getKey())) return false;
            }
            if (hasValue() != other.hasValue()) return false;
            if (hasValue()) {
                if (!getValue()
                        .equals(other.getValue())) return false;
            }
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (hasKey()) {
                hash = (37 * hash) + KEY_FIELD_NUMBER;
                hash = (53 * hash) + getKey().hashCode();
            }
            if (hasValue()) {
                hash = (37 * hash) + VALUE_FIELD_NUMBER;
                hash = (53 * hash) + getValue().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static LogTag parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogTag parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogTag parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogTag parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogTag parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogTag parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogTag parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static LogTag parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static LogTag parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static LogTag parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static LogTag parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static LogTag parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(LogTag prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code cls.LogTag}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:cls.LogTag)
                LogTagOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Logs.internal_static_cls_LogTag_descriptor;
            }

            @Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Logs.internal_static_cls_LogTag_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                LogTag.class, Builder.class);
            }

            // Construct using cls.Aa.LogTag.newBuilder()
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
            @Override
            public Builder clear() {
                super.clear();
                key_ = "";
                bitField0_ = (bitField0_ & ~0x00000001);
                value_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Logs.internal_static_cls_LogTag_descriptor;
            }

            @Override
            public LogTag getDefaultInstanceForType() {
                return LogTag.getDefaultInstance();
            }

            @Override
            public LogTag build() {
                LogTag result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public LogTag buildPartial() {
                LogTag result = new LogTag(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) != 0)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.key_ = key_;
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.value_ = value_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }
            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }
            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }
            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof LogTag) {
                    return mergeFrom((LogTag)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(LogTag other) {
                if (other == LogTag.getDefaultInstance()) return this;
                if (other.hasKey()) {
                    bitField0_ |= 0x00000001;
                    key_ = other.key_;
                    onChanged();
                }
                if (other.hasValue()) {
                    bitField0_ |= 0x00000002;
                    value_ = other.value_;
                    onChanged();
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                if (!hasKey()) {
                    return false;
                }
                if (!hasValue()) {
                    return false;
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                LogTag parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (LogTag) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private Object key_ = "";
            /**
             * <code>required string key = 1;</code>
             * @return Whether the key field is set.
             */
            public boolean hasKey() {
                return ((bitField0_ & 0x00000001) != 0);
            }
            /**
             * <code>required string key = 1;</code>
             * @return The key.
             */
            public String getKey() {
                Object ref = key_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        key_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>required string key = 1;</code>
             * @return The bytes for key.
             */
            public com.google.protobuf.ByteString
            getKeyBytes() {
                Object ref = key_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    key_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string key = 1;</code>
             * @param value The key to set.
             * @return This builder for chaining.
             */
            public Builder setKey(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string key = 1;</code>
             * @return This builder for chaining.
             */
            public Builder clearKey() {
                bitField0_ = (bitField0_ & ~0x00000001);
                key_ = getDefaultInstance().getKey();
                onChanged();
                return this;
            }
            /**
             * <code>required string key = 1;</code>
             * @param value The bytes for key to set.
             * @return This builder for chaining.
             */
            public Builder setKeyBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000001;
                key_ = value;
                onChanged();
                return this;
            }

            private Object value_ = "";
            /**
             * <code>required string value = 2;</code>
             * @return Whether the value field is set.
             */
            public boolean hasValue() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <code>required string value = 2;</code>
             * @return The value.
             */
            public String getValue() {
                Object ref = value_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        value_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <code>required string value = 2;</code>
             * @return The bytes for value.
             */
            public com.google.protobuf.ByteString
            getValueBytes() {
                Object ref = value_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    value_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <code>required string value = 2;</code>
             * @param value The value to set.
             * @return This builder for chaining.
             */
            public Builder setValue(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                value_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>required string value = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearValue() {
                bitField0_ = (bitField0_ & ~0x00000002);
                value_ = getDefaultInstance().getValue();
                onChanged();
                return this;
            }
            /**
             * <code>required string value = 2;</code>
             * @param value The bytes for value to set.
             * @return This builder for chaining.
             */
            public Builder setValueBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                value_ = value;
                onChanged();
                return this;
            }
            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:cls.LogTag)
        }

        // @@protoc_insertion_point(class_scope:cls.LogTag)
        private static final LogTag DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new LogTag();
        }

        public static LogTag getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<LogTag>
                PARSER = new com.google.protobuf.AbstractParser<LogTag>() {
            @Override
            public LogTag parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LogTag(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LogTag> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LogTag> getParserForType() {
            return PARSER;
        }

        @Override
        public LogTag getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LogGroupOrBuilder extends
            // @@protoc_insertion_point(interface_extends:cls.LogGroup)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        java.util.List<Log>
        getLogsList();
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        Log getLogs(int index);
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        int getLogsCount();
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        java.util.List<? extends LogOrBuilder>
        getLogsOrBuilderList();
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        LogOrBuilder getLogsOrBuilder(
                int index);

        /**
         * <pre>
         * 目前暂无效用
         * </pre>
         *
         * <code>optional string contextFlow = 2;</code>
         * @return Whether the contextFlow field is set.
         */
        boolean hasContextFlow();
        /**
         * <pre>
         * 目前暂无效用
         * </pre>
         *
         * <code>optional string contextFlow = 2;</code>
         * @return The contextFlow.
         */
        String getContextFlow();
        /**
         * <pre>
         * 目前暂无效用
         * </pre>
         *
         * <code>optional string contextFlow = 2;</code>
         * @return The bytes for contextFlow.
         */
        com.google.protobuf.ByteString
        getContextFlowBytes();

        /**
         * <pre>
         * 日志文件名
         * </pre>
         *
         * <code>optional string filename = 3;</code>
         * @return Whether the filename field is set.
         */
        boolean hasFilename();
        /**
         * <pre>
         * 日志文件名
         * </pre>
         *
         * <code>optional string filename = 3;</code>
         * @return The filename.
         */
        String getFilename();
        /**
         * <pre>
         * 日志文件名
         * </pre>
         *
         * <code>optional string filename = 3;</code>
         * @return The bytes for filename.
         */
        com.google.protobuf.ByteString
        getFilenameBytes();

        /**
         * <pre>
         * 日志来源，一般使用机器IP
         * </pre>
         *
         * <code>optional string source = 4;</code>
         * @return Whether the source field is set.
         */
        boolean hasSource();
        /**
         * <pre>
         * 日志来源，一般使用机器IP
         * </pre>
         *
         * <code>optional string source = 4;</code>
         * @return The source.
         */
        String getSource();
        /**
         * <pre>
         * 日志来源，一般使用机器IP
         * </pre>
         *
         * <code>optional string source = 4;</code>
         * @return The bytes for source.
         */
        com.google.protobuf.ByteString
        getSourceBytes();

        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        java.util.List<LogTag>
        getLogTagsList();
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        LogTag getLogTags(int index);
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        int getLogTagsCount();
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        java.util.List<? extends LogTagOrBuilder>
        getLogTagsOrBuilderList();
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        LogTagOrBuilder getLogTagsOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code cls.LogGroup}
     */
    public static final class LogGroup extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:cls.LogGroup)
            LogGroupOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LogGroup.newBuilder() to construct.
        private LogGroup(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LogGroup() {
            logs_ = java.util.Collections.emptyList();
            contextFlow_ = "";
            filename_ = "";
            source_ = "";
            logTags_ = java.util.Collections.emptyList();
        }

        @Override
        @SuppressWarnings({"unused"})
        protected Object newInstance(
                UnusedPrivateParameter unused) {
            return new LogGroup();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private LogGroup(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
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
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                logs_ = new java.util.ArrayList<Log>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            logs_.add(
                                    input.readMessage(Log.PARSER, extensionRegistry));
                            break;
                        }
                        case 18: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000001;
                            contextFlow_ = bs;
                            break;
                        }
                        case 26: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000002;
                            filename_ = bs;
                            break;
                        }
                        case 34: {
                            com.google.protobuf.ByteString bs = input.readBytes();
                            bitField0_ |= 0x00000004;
                            source_ = bs;
                            break;
                        }
                        case 42: {
                            if (!((mutable_bitField0_ & 0x00000010) != 0)) {
                                logTags_ = new java.util.ArrayList<LogTag>();
                                mutable_bitField0_ |= 0x00000010;
                            }
                            logTags_.add(
                                    input.readMessage(LogTag.PARSER, extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    logs_ = java.util.Collections.unmodifiableList(logs_);
                }
                if (((mutable_bitField0_ & 0x00000010) != 0)) {
                    logTags_ = java.util.Collections.unmodifiableList(logTags_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Logs.internal_static_cls_LogGroup_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Logs.internal_static_cls_LogGroup_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            LogGroup.class, Builder.class);
        }

        private int bitField0_;
        public static final int LOGS_FIELD_NUMBER = 1;
        private java.util.List<Log> logs_;
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        @Override
        public java.util.List<Log> getLogsList() {
            return logs_;
        }
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        @Override
        public java.util.List<? extends LogOrBuilder>
        getLogsOrBuilderList() {
            return logs_;
        }
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        @Override
        public int getLogsCount() {
            return logs_.size();
        }
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        @Override
        public Log getLogs(int index) {
            return logs_.get(index);
        }
        /**
         * <pre>
         * 多条日志合成的日志数组
         * </pre>
         *
         * <code>repeated .cls.Log logs = 1;</code>
         */
        @Override
        public LogOrBuilder getLogsOrBuilder(
                int index) {
            return logs_.get(index);
        }

        public static final int CONTEXTFLOW_FIELD_NUMBER = 2;
        private volatile Object contextFlow_;
        /**
         * <pre>
         * 目前暂无效用
         * </pre>
         *
         * <code>optional string contextFlow = 2;</code>
         * @return Whether the contextFlow field is set.
         */
        @Override
        public boolean hasContextFlow() {
            return ((bitField0_ & 0x00000001) != 0);
        }
        /**
         * <pre>
         * 目前暂无效用
         * </pre>
         *
         * <code>optional string contextFlow = 2;</code>
         * @return The contextFlow.
         */
        @Override
        public String getContextFlow() {
            Object ref = contextFlow_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    contextFlow_ = s;
                }
                return s;
            }
        }
        /**
         * <pre>
         * 目前暂无效用
         * </pre>
         *
         * <code>optional string contextFlow = 2;</code>
         * @return The bytes for contextFlow.
         */
        @Override
        public com.google.protobuf.ByteString
        getContextFlowBytes() {
            Object ref = contextFlow_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                contextFlow_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int FILENAME_FIELD_NUMBER = 3;
        private volatile Object filename_;
        /**
         * <pre>
         * 日志文件名
         * </pre>
         *
         * <code>optional string filename = 3;</code>
         * @return Whether the filename field is set.
         */
        @Override
        public boolean hasFilename() {
            return ((bitField0_ & 0x00000002) != 0);
        }
        /**
         * <pre>
         * 日志文件名
         * </pre>
         *
         * <code>optional string filename = 3;</code>
         * @return The filename.
         */
        @Override
        public String getFilename() {
            Object ref = filename_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    filename_ = s;
                }
                return s;
            }
        }
        /**
         * <pre>
         * 日志文件名
         * </pre>
         *
         * <code>optional string filename = 3;</code>
         * @return The bytes for filename.
         */
        @Override
        public com.google.protobuf.ByteString
        getFilenameBytes() {
            Object ref = filename_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                filename_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int SOURCE_FIELD_NUMBER = 4;
        private volatile Object source_;
        /**
         * <pre>
         * 日志来源，一般使用机器IP
         * </pre>
         *
         * <code>optional string source = 4;</code>
         * @return Whether the source field is set.
         */
        @Override
        public boolean hasSource() {
            return ((bitField0_ & 0x00000004) != 0);
        }
        /**
         * <pre>
         * 日志来源，一般使用机器IP
         * </pre>
         *
         * <code>optional string source = 4;</code>
         * @return The source.
         */
        @Override
        public String getSource() {
            Object ref = source_;
            if (ref instanceof String) {
                return (String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    source_ = s;
                }
                return s;
            }
        }
        /**
         * <pre>
         * 日志来源，一般使用机器IP
         * </pre>
         *
         * <code>optional string source = 4;</code>
         * @return The bytes for source.
         */
        @Override
        public com.google.protobuf.ByteString
        getSourceBytes() {
            Object ref = source_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                source_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        public static final int LOGTAGS_FIELD_NUMBER = 5;
        private java.util.List<LogTag> logTags_;
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        @Override
        public java.util.List<LogTag> getLogTagsList() {
            return logTags_;
        }
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        @Override
        public java.util.List<? extends LogTagOrBuilder>
        getLogTagsOrBuilderList() {
            return logTags_;
        }
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        @Override
        public int getLogTagsCount() {
            return logTags_.size();
        }
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        @Override
        public LogTag getLogTags(int index) {
            return logTags_.get(index);
        }
        /**
         * <code>repeated .cls.LogTag logTags = 5;</code>
         */
        @Override
        public LogTagOrBuilder getLogTagsOrBuilder(
                int index) {
            return logTags_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            for (int i = 0; i < getLogsCount(); i++) {
                if (!getLogs(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            for (int i = 0; i < getLogTagsCount(); i++) {
                if (!getLogTags(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < logs_.size(); i++) {
                output.writeMessage(1, logs_.get(i));
            }
            if (((bitField0_ & 0x00000001) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 2, contextFlow_);
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filename_);
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                com.google.protobuf.GeneratedMessageV3.writeString(output, 4, source_);
            }
            for (int i = 0; i < logTags_.size(); i++) {
                output.writeMessage(5, logTags_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < logs_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, logs_.get(i));
            }
            if (((bitField0_ & 0x00000001) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, contextFlow_);
            }
            if (((bitField0_ & 0x00000002) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filename_);
            }
            if (((bitField0_ & 0x00000004) != 0)) {
                size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, source_);
            }
            for (int i = 0; i < logTags_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(5, logTags_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LogGroup)) {
                return super.equals(obj);
            }
            LogGroup other = (LogGroup) obj;

            if (!getLogsList()
                    .equals(other.getLogsList())) return false;
            if (hasContextFlow() != other.hasContextFlow()) return false;
            if (hasContextFlow()) {
                if (!getContextFlow()
                        .equals(other.getContextFlow())) return false;
            }
            if (hasFilename() != other.hasFilename()) return false;
            if (hasFilename()) {
                if (!getFilename()
                        .equals(other.getFilename())) return false;
            }
            if (hasSource() != other.hasSource()) return false;
            if (hasSource()) {
                if (!getSource()
                        .equals(other.getSource())) return false;
            }
            if (!getLogTagsList()
                    .equals(other.getLogTagsList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getLogsCount() > 0) {
                hash = (37 * hash) + LOGS_FIELD_NUMBER;
                hash = (53 * hash) + getLogsList().hashCode();
            }
            if (hasContextFlow()) {
                hash = (37 * hash) + CONTEXTFLOW_FIELD_NUMBER;
                hash = (53 * hash) + getContextFlow().hashCode();
            }
            if (hasFilename()) {
                hash = (37 * hash) + FILENAME_FIELD_NUMBER;
                hash = (53 * hash) + getFilename().hashCode();
            }
            if (hasSource()) {
                hash = (37 * hash) + SOURCE_FIELD_NUMBER;
                hash = (53 * hash) + getSource().hashCode();
            }
            if (getLogTagsCount() > 0) {
                hash = (37 * hash) + LOGTAGS_FIELD_NUMBER;
                hash = (53 * hash) + getLogTagsList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static LogGroup parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogGroup parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogGroup parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogGroup parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogGroup parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogGroup parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogGroup parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static LogGroup parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static LogGroup parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static LogGroup parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static LogGroup parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static LogGroup parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(LogGroup prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code cls.LogGroup}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:cls.LogGroup)
                LogGroupOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Logs.internal_static_cls_LogGroup_descriptor;
            }

            @Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Logs.internal_static_cls_LogGroup_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                LogGroup.class, Builder.class);
            }

            // Construct using cls.Aa.LogGroup.newBuilder()
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
                    getLogsFieldBuilder();
                    getLogTagsFieldBuilder();
                }
            }
            @Override
            public Builder clear() {
                super.clear();
                if (logsBuilder_ == null) {
                    logs_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    logsBuilder_.clear();
                }
                contextFlow_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                filename_ = "";
                bitField0_ = (bitField0_ & ~0x00000004);
                source_ = "";
                bitField0_ = (bitField0_ & ~0x00000008);
                if (logTagsBuilder_ == null) {
                    logTags_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000010);
                } else {
                    logTagsBuilder_.clear();
                }
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Logs.internal_static_cls_LogGroup_descriptor;
            }

            @Override
            public LogGroup getDefaultInstanceForType() {
                return LogGroup.getDefaultInstance();
            }

            @Override
            public LogGroup build() {
                LogGroup result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public LogGroup buildPartial() {
                LogGroup result = new LogGroup(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (logsBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        logs_ = java.util.Collections.unmodifiableList(logs_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.logs_ = logs_;
                } else {
                    result.logs_ = logsBuilder_.build();
                }
                if (((from_bitField0_ & 0x00000002) != 0)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.contextFlow_ = contextFlow_;
                if (((from_bitField0_ & 0x00000004) != 0)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.filename_ = filename_;
                if (((from_bitField0_ & 0x00000008) != 0)) {
                    to_bitField0_ |= 0x00000004;
                }
                result.source_ = source_;
                if (logTagsBuilder_ == null) {
                    if (((bitField0_ & 0x00000010) != 0)) {
                        logTags_ = java.util.Collections.unmodifiableList(logTags_);
                        bitField0_ = (bitField0_ & ~0x00000010);
                    }
                    result.logTags_ = logTags_;
                } else {
                    result.logTags_ = logTagsBuilder_.build();
                }
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }
            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }
            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }
            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof LogGroup) {
                    return mergeFrom((LogGroup)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(LogGroup other) {
                if (other == LogGroup.getDefaultInstance()) return this;
                if (logsBuilder_ == null) {
                    if (!other.logs_.isEmpty()) {
                        if (logs_.isEmpty()) {
                            logs_ = other.logs_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureLogsIsMutable();
                            logs_.addAll(other.logs_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.logs_.isEmpty()) {
                        if (logsBuilder_.isEmpty()) {
                            logsBuilder_.dispose();
                            logsBuilder_ = null;
                            logs_ = other.logs_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            logsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getLogsFieldBuilder() : null;
                        } else {
                            logsBuilder_.addAllMessages(other.logs_);
                        }
                    }
                }
                if (other.hasContextFlow()) {
                    bitField0_ |= 0x00000002;
                    contextFlow_ = other.contextFlow_;
                    onChanged();
                }
                if (other.hasFilename()) {
                    bitField0_ |= 0x00000004;
                    filename_ = other.filename_;
                    onChanged();
                }
                if (other.hasSource()) {
                    bitField0_ |= 0x00000008;
                    source_ = other.source_;
                    onChanged();
                }
                if (logTagsBuilder_ == null) {
                    if (!other.logTags_.isEmpty()) {
                        if (logTags_.isEmpty()) {
                            logTags_ = other.logTags_;
                            bitField0_ = (bitField0_ & ~0x00000010);
                        } else {
                            ensureLogTagsIsMutable();
                            logTags_.addAll(other.logTags_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.logTags_.isEmpty()) {
                        if (logTagsBuilder_.isEmpty()) {
                            logTagsBuilder_.dispose();
                            logTagsBuilder_ = null;
                            logTags_ = other.logTags_;
                            bitField0_ = (bitField0_ & ~0x00000010);
                            logTagsBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getLogTagsFieldBuilder() : null;
                        } else {
                            logTagsBuilder_.addAllMessages(other.logTags_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                for (int i = 0; i < getLogsCount(); i++) {
                    if (!getLogs(i).isInitialized()) {
                        return false;
                    }
                }
                for (int i = 0; i < getLogTagsCount(); i++) {
                    if (!getLogTags(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                LogGroup parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (LogGroup) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.util.List<Log> logs_ =
                    java.util.Collections.emptyList();
            private void ensureLogsIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    logs_ = new java.util.ArrayList<Log>(logs_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    Log, Log.Builder, LogOrBuilder> logsBuilder_;

            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public java.util.List<Log> getLogsList() {
                if (logsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(logs_);
                } else {
                    return logsBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public int getLogsCount() {
                if (logsBuilder_ == null) {
                    return logs_.size();
                } else {
                    return logsBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Log getLogs(int index) {
                if (logsBuilder_ == null) {
                    return logs_.get(index);
                } else {
                    return logsBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder setLogs(
                    int index, Log value) {
                if (logsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogsIsMutable();
                    logs_.set(index, value);
                    onChanged();
                } else {
                    logsBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder setLogs(
                    int index, Log.Builder builderForValue) {
                if (logsBuilder_ == null) {
                    ensureLogsIsMutable();
                    logs_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    logsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder addLogs(Log value) {
                if (logsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogsIsMutable();
                    logs_.add(value);
                    onChanged();
                } else {
                    logsBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder addLogs(
                    int index, Log value) {
                if (logsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogsIsMutable();
                    logs_.add(index, value);
                    onChanged();
                } else {
                    logsBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder addLogs(
                    Log.Builder builderForValue) {
                if (logsBuilder_ == null) {
                    ensureLogsIsMutable();
                    logs_.add(builderForValue.build());
                    onChanged();
                } else {
                    logsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder addLogs(
                    int index, Log.Builder builderForValue) {
                if (logsBuilder_ == null) {
                    ensureLogsIsMutable();
                    logs_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    logsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder addAllLogs(
                    Iterable<? extends Log> values) {
                if (logsBuilder_ == null) {
                    ensureLogsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, logs_);
                    onChanged();
                } else {
                    logsBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder clearLogs() {
                if (logsBuilder_ == null) {
                    logs_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    logsBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Builder removeLogs(int index) {
                if (logsBuilder_ == null) {
                    ensureLogsIsMutable();
                    logs_.remove(index);
                    onChanged();
                } else {
                    logsBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Log.Builder getLogsBuilder(
                    int index) {
                return getLogsFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public LogOrBuilder getLogsOrBuilder(
                    int index) {
                if (logsBuilder_ == null) {
                    return logs_.get(index);  } else {
                    return logsBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public java.util.List<? extends LogOrBuilder>
            getLogsOrBuilderList() {
                if (logsBuilder_ != null) {
                    return logsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(logs_);
                }
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Log.Builder addLogsBuilder() {
                return getLogsFieldBuilder().addBuilder(
                        Log.getDefaultInstance());
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public Log.Builder addLogsBuilder(
                    int index) {
                return getLogsFieldBuilder().addBuilder(
                        index, Log.getDefaultInstance());
            }
            /**
             * <pre>
             * 多条日志合成的日志数组
             * </pre>
             *
             * <code>repeated .cls.Log logs = 1;</code>
             */
            public java.util.List<Log.Builder>
            getLogsBuilderList() {
                return getLogsFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    Log, Log.Builder, LogOrBuilder>
            getLogsFieldBuilder() {
                if (logsBuilder_ == null) {
                    logsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            Log, Log.Builder, LogOrBuilder>(
                            logs_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    logs_ = null;
                }
                return logsBuilder_;
            }

            private Object contextFlow_ = "";
            /**
             * <pre>
             * 目前暂无效用
             * </pre>
             *
             * <code>optional string contextFlow = 2;</code>
             * @return Whether the contextFlow field is set.
             */
            public boolean hasContextFlow() {
                return ((bitField0_ & 0x00000002) != 0);
            }
            /**
             * <pre>
             * 目前暂无效用
             * </pre>
             *
             * <code>optional string contextFlow = 2;</code>
             * @return The contextFlow.
             */
            public String getContextFlow() {
                Object ref = contextFlow_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        contextFlow_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <pre>
             * 目前暂无效用
             * </pre>
             *
             * <code>optional string contextFlow = 2;</code>
             * @return The bytes for contextFlow.
             */
            public com.google.protobuf.ByteString
            getContextFlowBytes() {
                Object ref = contextFlow_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    contextFlow_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             * 目前暂无效用
             * </pre>
             *
             * <code>optional string contextFlow = 2;</code>
             * @param value The contextFlow to set.
             * @return This builder for chaining.
             */
            public Builder setContextFlow(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                contextFlow_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 目前暂无效用
             * </pre>
             *
             * <code>optional string contextFlow = 2;</code>
             * @return This builder for chaining.
             */
            public Builder clearContextFlow() {
                bitField0_ = (bitField0_ & ~0x00000002);
                contextFlow_ = getDefaultInstance().getContextFlow();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 目前暂无效用
             * </pre>
             *
             * <code>optional string contextFlow = 2;</code>
             * @param value The bytes for contextFlow to set.
             * @return This builder for chaining.
             */
            public Builder setContextFlowBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                contextFlow_ = value;
                onChanged();
                return this;
            }

            private Object filename_ = "";
            /**
             * <pre>
             * 日志文件名
             * </pre>
             *
             * <code>optional string filename = 3;</code>
             * @return Whether the filename field is set.
             */
            public boolean hasFilename() {
                return ((bitField0_ & 0x00000004) != 0);
            }
            /**
             * <pre>
             * 日志文件名
             * </pre>
             *
             * <code>optional string filename = 3;</code>
             * @return The filename.
             */
            public String getFilename() {
                Object ref = filename_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        filename_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <pre>
             * 日志文件名
             * </pre>
             *
             * <code>optional string filename = 3;</code>
             * @return The bytes for filename.
             */
            public com.google.protobuf.ByteString
            getFilenameBytes() {
                Object ref = filename_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    filename_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             * 日志文件名
             * </pre>
             *
             * <code>optional string filename = 3;</code>
             * @param value The filename to set.
             * @return This builder for chaining.
             */
            public Builder setFilename(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                filename_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 日志文件名
             * </pre>
             *
             * <code>optional string filename = 3;</code>
             * @return This builder for chaining.
             */
            public Builder clearFilename() {
                bitField0_ = (bitField0_ & ~0x00000004);
                filename_ = getDefaultInstance().getFilename();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 日志文件名
             * </pre>
             *
             * <code>optional string filename = 3;</code>
             * @param value The bytes for filename to set.
             * @return This builder for chaining.
             */
            public Builder setFilenameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000004;
                filename_ = value;
                onChanged();
                return this;
            }

            private Object source_ = "";
            /**
             * <pre>
             * 日志来源，一般使用机器IP
             * </pre>
             *
             * <code>optional string source = 4;</code>
             * @return Whether the source field is set.
             */
            public boolean hasSource() {
                return ((bitField0_ & 0x00000008) != 0);
            }
            /**
             * <pre>
             * 日志来源，一般使用机器IP
             * </pre>
             *
             * <code>optional string source = 4;</code>
             * @return The source.
             */
            public String getSource() {
                Object ref = source_;
                if (!(ref instanceof String)) {
                    com.google.protobuf.ByteString bs =
                            (com.google.protobuf.ByteString) ref;
                    String s = bs.toStringUtf8();
                    if (bs.isValidUtf8()) {
                        source_ = s;
                    }
                    return s;
                } else {
                    return (String) ref;
                }
            }
            /**
             * <pre>
             * 日志来源，一般使用机器IP
             * </pre>
             *
             * <code>optional string source = 4;</code>
             * @return The bytes for source.
             */
            public com.google.protobuf.ByteString
            getSourceBytes() {
                Object ref = source_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (String) ref);
                    source_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }
            /**
             * <pre>
             * 日志来源，一般使用机器IP
             * </pre>
             *
             * <code>optional string source = 4;</code>
             * @param value The source to set.
             * @return This builder for chaining.
             */
            public Builder setSource(
                    String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                source_ = value;
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 日志来源，一般使用机器IP
             * </pre>
             *
             * <code>optional string source = 4;</code>
             * @return This builder for chaining.
             */
            public Builder clearSource() {
                bitField0_ = (bitField0_ & ~0x00000008);
                source_ = getDefaultInstance().getSource();
                onChanged();
                return this;
            }
            /**
             * <pre>
             * 日志来源，一般使用机器IP
             * </pre>
             *
             * <code>optional string source = 4;</code>
             * @param value The bytes for source to set.
             * @return This builder for chaining.
             */
            public Builder setSourceBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000008;
                source_ = value;
                onChanged();
                return this;
            }

            private java.util.List<LogTag> logTags_ =
                    java.util.Collections.emptyList();
            private void ensureLogTagsIsMutable() {
                if (!((bitField0_ & 0x00000010) != 0)) {
                    logTags_ = new java.util.ArrayList<LogTag>(logTags_);
                    bitField0_ |= 0x00000010;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    LogTag, LogTag.Builder, LogTagOrBuilder> logTagsBuilder_;

            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public java.util.List<LogTag> getLogTagsList() {
                if (logTagsBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(logTags_);
                } else {
                    return logTagsBuilder_.getMessageList();
                }
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public int getLogTagsCount() {
                if (logTagsBuilder_ == null) {
                    return logTags_.size();
                } else {
                    return logTagsBuilder_.getCount();
                }
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public LogTag getLogTags(int index) {
                if (logTagsBuilder_ == null) {
                    return logTags_.get(index);
                } else {
                    return logTagsBuilder_.getMessage(index);
                }
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder setLogTags(
                    int index, LogTag value) {
                if (logTagsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogTagsIsMutable();
                    logTags_.set(index, value);
                    onChanged();
                } else {
                    logTagsBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder setLogTags(
                    int index, LogTag.Builder builderForValue) {
                if (logTagsBuilder_ == null) {
                    ensureLogTagsIsMutable();
                    logTags_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    logTagsBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder addLogTags(LogTag value) {
                if (logTagsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogTagsIsMutable();
                    logTags_.add(value);
                    onChanged();
                } else {
                    logTagsBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder addLogTags(
                    int index, LogTag value) {
                if (logTagsBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogTagsIsMutable();
                    logTags_.add(index, value);
                    onChanged();
                } else {
                    logTagsBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder addLogTags(
                    LogTag.Builder builderForValue) {
                if (logTagsBuilder_ == null) {
                    ensureLogTagsIsMutable();
                    logTags_.add(builderForValue.build());
                    onChanged();
                } else {
                    logTagsBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder addLogTags(
                    int index, LogTag.Builder builderForValue) {
                if (logTagsBuilder_ == null) {
                    ensureLogTagsIsMutable();
                    logTags_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    logTagsBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder addAllLogTags(
                    Iterable<? extends LogTag> values) {
                if (logTagsBuilder_ == null) {
                    ensureLogTagsIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, logTags_);
                    onChanged();
                } else {
                    logTagsBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder clearLogTags() {
                if (logTagsBuilder_ == null) {
                    logTags_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000010);
                    onChanged();
                } else {
                    logTagsBuilder_.clear();
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public Builder removeLogTags(int index) {
                if (logTagsBuilder_ == null) {
                    ensureLogTagsIsMutable();
                    logTags_.remove(index);
                    onChanged();
                } else {
                    logTagsBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public LogTag.Builder getLogTagsBuilder(
                    int index) {
                return getLogTagsFieldBuilder().getBuilder(index);
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public LogTagOrBuilder getLogTagsOrBuilder(
                    int index) {
                if (logTagsBuilder_ == null) {
                    return logTags_.get(index);  } else {
                    return logTagsBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public java.util.List<? extends LogTagOrBuilder>
            getLogTagsOrBuilderList() {
                if (logTagsBuilder_ != null) {
                    return logTagsBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(logTags_);
                }
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public LogTag.Builder addLogTagsBuilder() {
                return getLogTagsFieldBuilder().addBuilder(
                        LogTag.getDefaultInstance());
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public LogTag.Builder addLogTagsBuilder(
                    int index) {
                return getLogTagsFieldBuilder().addBuilder(
                        index, LogTag.getDefaultInstance());
            }
            /**
             * <code>repeated .cls.LogTag logTags = 5;</code>
             */
            public java.util.List<LogTag.Builder>
            getLogTagsBuilderList() {
                return getLogTagsFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    LogTag, LogTag.Builder, LogTagOrBuilder>
            getLogTagsFieldBuilder() {
                if (logTagsBuilder_ == null) {
                    logTagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            LogTag, LogTag.Builder, LogTagOrBuilder>(
                            logTags_,
                            ((bitField0_ & 0x00000010) != 0),
                            getParentForChildren(),
                            isClean());
                    logTags_ = null;
                }
                return logTagsBuilder_;
            }
            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:cls.LogGroup)
        }

        // @@protoc_insertion_point(class_scope:cls.LogGroup)
        private static final LogGroup DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new LogGroup();
        }

        public static LogGroup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<LogGroup>
                PARSER = new com.google.protobuf.AbstractParser<LogGroup>() {
            @Override
            public LogGroup parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LogGroup(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LogGroup> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LogGroup> getParserForType() {
            return PARSER;
        }

        @Override
        public LogGroup getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    public interface LogGroupListOrBuilder extends
            // @@protoc_insertion_point(interface_extends:cls.LogGroupList)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        java.util.List<LogGroup>
        getLogGroupListList();
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        LogGroup getLogGroupList(int index);
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        int getLogGroupListCount();
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        java.util.List<? extends LogGroupOrBuilder>
        getLogGroupListOrBuilderList();
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        LogGroupOrBuilder getLogGroupListOrBuilder(
                int index);
    }
    /**
     * Protobuf type {@code cls.LogGroupList}
     */
    public static final class LogGroupList extends
            com.google.protobuf.GeneratedMessageV3 implements
            // @@protoc_insertion_point(message_implements:cls.LogGroupList)
            LogGroupListOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use LogGroupList.newBuilder() to construct.
        private LogGroupList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }
        private LogGroupList() {
            logGroupList_ = java.util.Collections.emptyList();
        }

        @Override
        @SuppressWarnings({"unused"})
        protected Object newInstance(
                UnusedPrivateParameter unused) {
            return new LogGroupList();
        }

        @Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }
        private LogGroupList(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            this();
            if (extensionRegistry == null) {
                throw new NullPointerException();
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
                            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                logGroupList_ = new java.util.ArrayList<LogGroup>();
                                mutable_bitField0_ |= 0x00000001;
                            }
                            logGroupList_.add(
                                    input.readMessage(LogGroup.PARSER, extensionRegistry));
                            break;
                        }
                        default: {
                            if (!parseUnknownField(
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
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    logGroupList_ = java.util.Collections.unmodifiableList(logGroupList_);
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Logs.internal_static_cls_LogGroupList_descriptor;
        }

        @Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Logs.internal_static_cls_LogGroupList_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            LogGroupList.class, Builder.class);
        }

        public static final int LOGGROUPLIST_FIELD_NUMBER = 1;
        private java.util.List<LogGroup> logGroupList_;
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        @Override
        public java.util.List<LogGroup> getLogGroupListList() {
            return logGroupList_;
        }
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        @Override
        public java.util.List<? extends LogGroupOrBuilder>
        getLogGroupListOrBuilderList() {
            return logGroupList_;
        }
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        @Override
        public int getLogGroupListCount() {
            return logGroupList_.size();
        }
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        @Override
        public LogGroup getLogGroupList(int index) {
            return logGroupList_.get(index);
        }
        /**
         * <pre>
         * 日志组列表
         * </pre>
         *
         * <code>repeated .cls.LogGroup logGroupList = 1;</code>
         */
        @Override
        public LogGroupOrBuilder getLogGroupListOrBuilder(
                int index) {
            return logGroupList_.get(index);
        }

        private byte memoizedIsInitialized = -1;
        @Override
        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized == 1) return true;
            if (isInitialized == 0) return false;

            for (int i = 0; i < getLogGroupListCount(); i++) {
                if (!getLogGroupList(i).isInitialized()) {
                    memoizedIsInitialized = 0;
                    return false;
                }
            }
            memoizedIsInitialized = 1;
            return true;
        }

        @Override
        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            for (int i = 0; i < logGroupList_.size(); i++) {
                output.writeMessage(1, logGroupList_.get(i));
            }
            unknownFields.writeTo(output);
        }

        @Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            for (int i = 0; i < logGroupList_.size(); i++) {
                size += com.google.protobuf.CodedOutputStream
                        .computeMessageSize(1, logGroupList_.get(i));
            }
            size += unknownFields.getSerializedSize();
            memoizedSize = size;
            return size;
        }

        @Override
        public boolean equals(final Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LogGroupList)) {
                return super.equals(obj);
            }
            LogGroupList other = (LogGroupList) obj;

            if (!getLogGroupListList()
                    .equals(other.getLogGroupListList())) return false;
            if (!unknownFields.equals(other.unknownFields)) return false;
            return true;
        }

        @Override
        public int hashCode() {
            if (memoizedHashCode != 0) {
                return memoizedHashCode;
            }
            int hash = 41;
            hash = (19 * hash) + getDescriptor().hashCode();
            if (getLogGroupListCount() > 0) {
                hash = (37 * hash) + LOGGROUPLIST_FIELD_NUMBER;
                hash = (53 * hash) + getLogGroupListList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static LogGroupList parseFrom(
                java.nio.ByteBuffer data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogGroupList parseFrom(
                java.nio.ByteBuffer data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogGroupList parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogGroupList parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogGroupList parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }
        public static LogGroupList parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }
        public static LogGroupList parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static LogGroupList parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }
        public static LogGroupList parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input);
        }
        public static LogGroupList parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
        }
        public static LogGroupList parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input);
        }
        public static LogGroupList parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3
                    .parseWithIOException(PARSER, input, extensionRegistry);
        }

        @Override
        public Builder newBuilderForType() { return newBuilder(); }
        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }
        public static Builder newBuilder(LogGroupList prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }
        @Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE
                    ? new Builder() : new Builder().mergeFrom(this);
        }

        @Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         * Protobuf type {@code cls.LogGroupList}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
                // @@protoc_insertion_point(builder_implements:cls.LogGroupList)
                LogGroupListOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return Logs.internal_static_cls_LogGroupList_descriptor;
            }

            @Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return Logs.internal_static_cls_LogGroupList_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                LogGroupList.class, Builder.class);
            }

            // Construct using cls.Aa.LogGroupList.newBuilder()
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
                    getLogGroupListFieldBuilder();
                }
            }
            @Override
            public Builder clear() {
                super.clear();
                if (logGroupListBuilder_ == null) {
                    logGroupList_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                } else {
                    logGroupListBuilder_.clear();
                }
                return this;
            }

            @Override
            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return Logs.internal_static_cls_LogGroupList_descriptor;
            }

            @Override
            public LogGroupList getDefaultInstanceForType() {
                return LogGroupList.getDefaultInstance();
            }

            @Override
            public LogGroupList build() {
                LogGroupList result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @Override
            public LogGroupList buildPartial() {
                LogGroupList result = new LogGroupList(this);
                int from_bitField0_ = bitField0_;
                if (logGroupListBuilder_ == null) {
                    if (((bitField0_ & 0x00000001) != 0)) {
                        logGroupList_ = java.util.Collections.unmodifiableList(logGroupList_);
                        bitField0_ = (bitField0_ & ~0x00000001);
                    }
                    result.logGroupList_ = logGroupList_;
                } else {
                    result.logGroupList_ = logGroupListBuilder_.build();
                }
                onBuilt();
                return result;
            }

            @Override
            public Builder clone() {
                return super.clone();
            }
            @Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.setField(field, value);
            }
            @Override
            public Builder clearField(
                    com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }
            @Override
            public Builder clearOneof(
                    com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }
            @Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index, Object value) {
                return super.setRepeatedField(field, index, value);
            }
            @Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    Object value) {
                return super.addRepeatedField(field, value);
            }
            @Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof LogGroupList) {
                    return mergeFrom((LogGroupList)other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(LogGroupList other) {
                if (other == LogGroupList.getDefaultInstance()) return this;
                if (logGroupListBuilder_ == null) {
                    if (!other.logGroupList_.isEmpty()) {
                        if (logGroupList_.isEmpty()) {
                            logGroupList_ = other.logGroupList_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                        } else {
                            ensureLogGroupListIsMutable();
                            logGroupList_.addAll(other.logGroupList_);
                        }
                        onChanged();
                    }
                } else {
                    if (!other.logGroupList_.isEmpty()) {
                        if (logGroupListBuilder_.isEmpty()) {
                            logGroupListBuilder_.dispose();
                            logGroupListBuilder_ = null;
                            logGroupList_ = other.logGroupList_;
                            bitField0_ = (bitField0_ & ~0x00000001);
                            logGroupListBuilder_ =
                                    com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                            getLogGroupListFieldBuilder() : null;
                        } else {
                            logGroupListBuilder_.addAllMessages(other.logGroupList_);
                        }
                    }
                }
                this.mergeUnknownFields(other.unknownFields);
                onChanged();
                return this;
            }

            @Override
            public final boolean isInitialized() {
                for (int i = 0; i < getLogGroupListCount(); i++) {
                    if (!getLogGroupList(i).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                LogGroupList parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (LogGroupList) e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }
            private int bitField0_;

            private java.util.List<LogGroup> logGroupList_ =
                    java.util.Collections.emptyList();
            private void ensureLogGroupListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    logGroupList_ = new java.util.ArrayList<LogGroup>(logGroupList_);
                    bitField0_ |= 0x00000001;
                }
            }

            private com.google.protobuf.RepeatedFieldBuilderV3<
                    LogGroup, LogGroup.Builder, LogGroupOrBuilder> logGroupListBuilder_;

            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public java.util.List<LogGroup> getLogGroupListList() {
                if (logGroupListBuilder_ == null) {
                    return java.util.Collections.unmodifiableList(logGroupList_);
                } else {
                    return logGroupListBuilder_.getMessageList();
                }
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public int getLogGroupListCount() {
                if (logGroupListBuilder_ == null) {
                    return logGroupList_.size();
                } else {
                    return logGroupListBuilder_.getCount();
                }
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public LogGroup getLogGroupList(int index) {
                if (logGroupListBuilder_ == null) {
                    return logGroupList_.get(index);
                } else {
                    return logGroupListBuilder_.getMessage(index);
                }
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder setLogGroupList(
                    int index, LogGroup value) {
                if (logGroupListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogGroupListIsMutable();
                    logGroupList_.set(index, value);
                    onChanged();
                } else {
                    logGroupListBuilder_.setMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder setLogGroupList(
                    int index, LogGroup.Builder builderForValue) {
                if (logGroupListBuilder_ == null) {
                    ensureLogGroupListIsMutable();
                    logGroupList_.set(index, builderForValue.build());
                    onChanged();
                } else {
                    logGroupListBuilder_.setMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder addLogGroupList(LogGroup value) {
                if (logGroupListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogGroupListIsMutable();
                    logGroupList_.add(value);
                    onChanged();
                } else {
                    logGroupListBuilder_.addMessage(value);
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder addLogGroupList(
                    int index, LogGroup value) {
                if (logGroupListBuilder_ == null) {
                    if (value == null) {
                        throw new NullPointerException();
                    }
                    ensureLogGroupListIsMutable();
                    logGroupList_.add(index, value);
                    onChanged();
                } else {
                    logGroupListBuilder_.addMessage(index, value);
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder addLogGroupList(
                    LogGroup.Builder builderForValue) {
                if (logGroupListBuilder_ == null) {
                    ensureLogGroupListIsMutable();
                    logGroupList_.add(builderForValue.build());
                    onChanged();
                } else {
                    logGroupListBuilder_.addMessage(builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder addLogGroupList(
                    int index, LogGroup.Builder builderForValue) {
                if (logGroupListBuilder_ == null) {
                    ensureLogGroupListIsMutable();
                    logGroupList_.add(index, builderForValue.build());
                    onChanged();
                } else {
                    logGroupListBuilder_.addMessage(index, builderForValue.build());
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder addAllLogGroupList(
                    Iterable<? extends LogGroup> values) {
                if (logGroupListBuilder_ == null) {
                    ensureLogGroupListIsMutable();
                    com.google.protobuf.AbstractMessageLite.Builder.addAll(
                            values, logGroupList_);
                    onChanged();
                } else {
                    logGroupListBuilder_.addAllMessages(values);
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder clearLogGroupList() {
                if (logGroupListBuilder_ == null) {
                    logGroupList_ = java.util.Collections.emptyList();
                    bitField0_ = (bitField0_ & ~0x00000001);
                    onChanged();
                } else {
                    logGroupListBuilder_.clear();
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public Builder removeLogGroupList(int index) {
                if (logGroupListBuilder_ == null) {
                    ensureLogGroupListIsMutable();
                    logGroupList_.remove(index);
                    onChanged();
                } else {
                    logGroupListBuilder_.remove(index);
                }
                return this;
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public LogGroup.Builder getLogGroupListBuilder(
                    int index) {
                return getLogGroupListFieldBuilder().getBuilder(index);
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public LogGroupOrBuilder getLogGroupListOrBuilder(
                    int index) {
                if (logGroupListBuilder_ == null) {
                    return logGroupList_.get(index);  } else {
                    return logGroupListBuilder_.getMessageOrBuilder(index);
                }
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public java.util.List<? extends LogGroupOrBuilder>
            getLogGroupListOrBuilderList() {
                if (logGroupListBuilder_ != null) {
                    return logGroupListBuilder_.getMessageOrBuilderList();
                } else {
                    return java.util.Collections.unmodifiableList(logGroupList_);
                }
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public LogGroup.Builder addLogGroupListBuilder() {
                return getLogGroupListFieldBuilder().addBuilder(
                        LogGroup.getDefaultInstance());
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public LogGroup.Builder addLogGroupListBuilder(
                    int index) {
                return getLogGroupListFieldBuilder().addBuilder(
                        index, LogGroup.getDefaultInstance());
            }
            /**
             * <pre>
             * 日志组列表
             * </pre>
             *
             * <code>repeated .cls.LogGroup logGroupList = 1;</code>
             */
            public java.util.List<LogGroup.Builder>
            getLogGroupListBuilderList() {
                return getLogGroupListFieldBuilder().getBuilderList();
            }
            private com.google.protobuf.RepeatedFieldBuilderV3<
                    LogGroup, LogGroup.Builder, LogGroupOrBuilder>
            getLogGroupListFieldBuilder() {
                if (logGroupListBuilder_ == null) {
                    logGroupListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                            LogGroup, LogGroup.Builder, LogGroupOrBuilder>(
                            logGroupList_,
                            ((bitField0_ & 0x00000001) != 0),
                            getParentForChildren(),
                            isClean());
                    logGroupList_ = null;
                }
                return logGroupListBuilder_;
            }
            @Override
            public final Builder setUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.setUnknownFields(unknownFields);
            }

            @Override
            public final Builder mergeUnknownFields(
                    final com.google.protobuf.UnknownFieldSet unknownFields) {
                return super.mergeUnknownFields(unknownFields);
            }


            // @@protoc_insertion_point(builder_scope:cls.LogGroupList)
        }

        // @@protoc_insertion_point(class_scope:cls.LogGroupList)
        private static final LogGroupList DEFAULT_INSTANCE;
        static {
            DEFAULT_INSTANCE = new LogGroupList();
        }

        public static LogGroupList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        @Deprecated public static final com.google.protobuf.Parser<LogGroupList>
                PARSER = new com.google.protobuf.AbstractParser<LogGroupList>() {
            @Override
            public LogGroupList parsePartialFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws com.google.protobuf.InvalidProtocolBufferException {
                return new LogGroupList(input, extensionRegistry);
            }
        };

        public static com.google.protobuf.Parser<LogGroupList> parser() {
            return PARSER;
        }

        @Override
        public com.google.protobuf.Parser<LogGroupList> getParserForType() {
            return PARSER;
        }

        @Override
        public LogGroupList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_cls_Log_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_cls_Log_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_cls_Log_Content_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_cls_Log_Content_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_cls_LogTag_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_cls_LogTag_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_cls_LogGroup_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_cls_LogGroup_fieldAccessorTable;
    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_cls_LogGroupList_descriptor;
    private static final
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_cls_LogGroupList_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }
    private static  com.google.protobuf.Descriptors.FileDescriptor
            descriptor;
    static {
        String[] descriptorData = {
                "\n\002aa\022\003cls\"^\n\003Log\022\014\n\004time\030\001 \002(\003\022\"\n\010conten" +
                        "ts\030\002 \003(\0132\020.cls.Log.Content\032%\n\007Content\022\013\n" +
                        "\003key\030\001 \002(\t\022\r\n\005value\030\002 \002(\t\"$\n\006LogTag\022\013\n\003k" +
                        "ey\030\001 \002(\t\022\r\n\005value\030\002 \002(\t\"w\n\010LogGroup\022\026\n\004l" +
                        "ogs\030\001 \003(\0132\010.cls.Log\022\023\n\013contextFlow\030\002 \001(\t" +
                        "\022\020\n\010filename\030\003 \001(\t\022\016\n\006source\030\004 \001(\t\022\034\n\007lo" +
                        "gTags\030\005 \003(\0132\013.cls.LogTag\"3\n\014LogGroupList" +
                        "\022#\n\014logGroupList\030\001 \003(\0132\r.cls.LogGroup"
        };
        descriptor = com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[] {
                        });
        internal_static_cls_Log_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_cls_Log_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_cls_Log_descriptor,
                new String[] { "Time", "Contents", });
        internal_static_cls_Log_Content_descriptor =
                internal_static_cls_Log_descriptor.getNestedTypes().get(0);
        internal_static_cls_Log_Content_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_cls_Log_Content_descriptor,
                new String[] { "Key", "Value", });
        internal_static_cls_LogTag_descriptor =
                getDescriptor().getMessageTypes().get(1);
        internal_static_cls_LogTag_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_cls_LogTag_descriptor,
                new String[] { "Key", "Value", });
        internal_static_cls_LogGroup_descriptor =
                getDescriptor().getMessageTypes().get(2);
        internal_static_cls_LogGroup_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_cls_LogGroup_descriptor,
                new String[] { "Logs", "ContextFlow", "Filename", "Source", "LogTags", });
        internal_static_cls_LogGroupList_descriptor =
                getDescriptor().getMessageTypes().get(3);
        internal_static_cls_LogGroupList_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                internal_static_cls_LogGroupList_descriptor,
                new String[] { "LogGroupList", });
    }

    // @@protoc_insertion_point(outer_class_scope)
}
