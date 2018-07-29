package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0-SNAPSHOT)",
    comments = "Source: proto/calculator/calculator.proto")
public final class CalculatorGrpc {

  private CalculatorGrpc() {}

  public static final String SERVICE_NAME = "calculator.Calculator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getAdditionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Addition",
      requestType = com.proto.calculator.InputNumber.class,
      responseType = com.proto.calculator.OutputNumber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getAdditionMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber> getAdditionMethod;
    if ((getAdditionMethod = CalculatorGrpc.getAdditionMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getAdditionMethod = CalculatorGrpc.getAdditionMethod) == null) {
          CalculatorGrpc.getAdditionMethod = getAdditionMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator.Calculator", "Addition"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.InputNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.OutputNumber.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Addition"))
                  .build();
          }
        }
     }
     return getAdditionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getSubractionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Subraction",
      requestType = com.proto.calculator.InputNumber.class,
      responseType = com.proto.calculator.OutputNumber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getSubractionMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber> getSubractionMethod;
    if ((getSubractionMethod = CalculatorGrpc.getSubractionMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getSubractionMethod = CalculatorGrpc.getSubractionMethod) == null) {
          CalculatorGrpc.getSubractionMethod = getSubractionMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator.Calculator", "Subraction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.InputNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.OutputNumber.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Subraction"))
                  .build();
          }
        }
     }
     return getSubractionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getMultiplyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Multiply",
      requestType = com.proto.calculator.InputNumber.class,
      responseType = com.proto.calculator.OutputNumber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getMultiplyMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber> getMultiplyMethod;
    if ((getMultiplyMethod = CalculatorGrpc.getMultiplyMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getMultiplyMethod = CalculatorGrpc.getMultiplyMethod) == null) {
          CalculatorGrpc.getMultiplyMethod = getMultiplyMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator.Calculator", "Multiply"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.InputNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.OutputNumber.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Multiply"))
                  .build();
          }
        }
     }
     return getMultiplyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getDivideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Divide",
      requestType = com.proto.calculator.InputNumber.class,
      responseType = com.proto.calculator.OutputNumber.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.InputNumber,
      com.proto.calculator.OutputNumber> getDivideMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber> getDivideMethod;
    if ((getDivideMethod = CalculatorGrpc.getDivideMethod) == null) {
      synchronized (CalculatorGrpc.class) {
        if ((getDivideMethod = CalculatorGrpc.getDivideMethod) == null) {
          CalculatorGrpc.getDivideMethod = getDivideMethod = 
              io.grpc.MethodDescriptor.<com.proto.calculator.InputNumber, com.proto.calculator.OutputNumber>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "calculator.Calculator", "Divide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.InputNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.OutputNumber.getDefaultInstance()))
                  .setSchemaDescriptor(new CalculatorMethodDescriptorSupplier("Divide"))
                  .build();
          }
        }
     }
     return getDivideMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CalculatorStub newStub(io.grpc.Channel channel) {
    return new CalculatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CalculatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CalculatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CalculatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CalculatorFutureStub(channel);
  }

  /**
   */
  public static abstract class CalculatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void addition(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnimplementedUnaryCall(getAdditionMethod(), responseObserver);
    }

    /**
     */
    public void subraction(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnimplementedUnaryCall(getSubractionMethod(), responseObserver);
    }

    /**
     */
    public void multiply(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnimplementedUnaryCall(getMultiplyMethod(), responseObserver);
    }

    /**
     */
    public void divide(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnimplementedUnaryCall(getDivideMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAdditionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.InputNumber,
                com.proto.calculator.OutputNumber>(
                  this, METHODID_ADDITION)))
          .addMethod(
            getSubractionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.InputNumber,
                com.proto.calculator.OutputNumber>(
                  this, METHODID_SUBRACTION)))
          .addMethod(
            getMultiplyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.InputNumber,
                com.proto.calculator.OutputNumber>(
                  this, METHODID_MULTIPLY)))
          .addMethod(
            getDivideMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.InputNumber,
                com.proto.calculator.OutputNumber>(
                  this, METHODID_DIVIDE)))
          .build();
    }
  }

  /**
   */
  public static final class CalculatorStub extends io.grpc.stub.AbstractStub<CalculatorStub> {
    private CalculatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorStub(channel, callOptions);
    }

    /**
     */
    public void addition(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAdditionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void subraction(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSubractionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiply(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void divide(com.proto.calculator.InputNumber request,
        io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CalculatorBlockingStub extends io.grpc.stub.AbstractStub<CalculatorBlockingStub> {
    private CalculatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.OutputNumber addition(com.proto.calculator.InputNumber request) {
      return blockingUnaryCall(
          getChannel(), getAdditionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.OutputNumber subraction(com.proto.calculator.InputNumber request) {
      return blockingUnaryCall(
          getChannel(), getSubractionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.OutputNumber multiply(com.proto.calculator.InputNumber request) {
      return blockingUnaryCall(
          getChannel(), getMultiplyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.OutputNumber divide(com.proto.calculator.InputNumber request) {
      return blockingUnaryCall(
          getChannel(), getDivideMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CalculatorFutureStub extends io.grpc.stub.AbstractStub<CalculatorFutureStub> {
    private CalculatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CalculatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CalculatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CalculatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.OutputNumber> addition(
        com.proto.calculator.InputNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getAdditionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.OutputNumber> subraction(
        com.proto.calculator.InputNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getSubractionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.OutputNumber> multiply(
        com.proto.calculator.InputNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getMultiplyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.OutputNumber> divide(
        com.proto.calculator.InputNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getDivideMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADDITION = 0;
  private static final int METHODID_SUBRACTION = 1;
  private static final int METHODID_MULTIPLY = 2;
  private static final int METHODID_DIVIDE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CalculatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CalculatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADDITION:
          serviceImpl.addition((com.proto.calculator.InputNumber) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber>) responseObserver);
          break;
        case METHODID_SUBRACTION:
          serviceImpl.subraction((com.proto.calculator.InputNumber) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber>) responseObserver);
          break;
        case METHODID_MULTIPLY:
          serviceImpl.multiply((com.proto.calculator.InputNumber) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber>) responseObserver);
          break;
        case METHODID_DIVIDE:
          serviceImpl.divide((com.proto.calculator.InputNumber) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.OutputNumber>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CalculatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.CalculatorOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Calculator");
    }
  }

  private static final class CalculatorFileDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier {
    CalculatorFileDescriptorSupplier() {}
  }

  private static final class CalculatorMethodDescriptorSupplier
      extends CalculatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CalculatorMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (CalculatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CalculatorFileDescriptorSupplier())
              .addMethod(getAdditionMethod())
              .addMethod(getSubractionMethod())
              .addMethod(getMultiplyMethod())
              .addMethod(getDivideMethod())
              .build();
        }
      }
    }
    return result;
  }
}
