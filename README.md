## GRPC Java based examples


### To generate java files using from proto files, 

```sh
protoc --java_out=java/ --grpc-java_out=java/ --plugin=protoc-gen-grpc-java=/usr/local/bin/protoc-gen-grpc-java proto/dummy/dummy.proto

```


 