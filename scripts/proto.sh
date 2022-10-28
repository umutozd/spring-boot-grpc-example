PROTOC_GEN_GRPC_JAVA_PATH="./bin/protoc-gen-grpc-java"

# protobuf is the main function where protobuf files are compiled into their
# corresponding java files. Parameters are:
# - proto_path: the import path for the given source files
# - out_dir: the output directory
# - files: path(s) to input file(s)
protobuf () {
    ./bin/protoc --proto_path="$1" \
      --java_out="$2" \
      "$3"

    ./bin/protoc --plugin=protoc-gen-grpc-java=${PROTOC_GEN_GRPC_JAVA_PATH}\
      --proto_path="$1" \
      --grpc-java_out=lite:"$2" \
      "$3"
}

protobuf src/main/proto/homeworks src/main/java src/main/proto/homeworks/*.proto
