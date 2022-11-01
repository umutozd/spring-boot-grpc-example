package proto.homeworks;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.49.2)",
    comments = "Source: homework.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HomeworkServiceGrpc {

  private HomeworkServiceGrpc() {}

  public static final String SERVICE_NAME = "homeworks.HomeworkService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<proto.homeworks.AssignHomeworkReq,
      proto.homeworks.Homework> getAssignHomeworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AssignHomework",
      requestType = proto.homeworks.AssignHomeworkReq.class,
      responseType = proto.homeworks.Homework.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.homeworks.AssignHomeworkReq,
      proto.homeworks.Homework> getAssignHomeworkMethod() {
    io.grpc.MethodDescriptor<proto.homeworks.AssignHomeworkReq, proto.homeworks.Homework> getAssignHomeworkMethod;
    if ((getAssignHomeworkMethod = HomeworkServiceGrpc.getAssignHomeworkMethod) == null) {
      synchronized (HomeworkServiceGrpc.class) {
        if ((getAssignHomeworkMethod = HomeworkServiceGrpc.getAssignHomeworkMethod) == null) {
          HomeworkServiceGrpc.getAssignHomeworkMethod = getAssignHomeworkMethod =
              io.grpc.MethodDescriptor.<proto.homeworks.AssignHomeworkReq, proto.homeworks.Homework>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AssignHomework"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.homeworks.AssignHomeworkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.homeworks.Homework.getDefaultInstance()))
              .build();
        }
      }
    }
    return getAssignHomeworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<proto.homeworks.DoHomeworkReq,
      proto.homeworks.Homework> getDoHomeworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DoHomework",
      requestType = proto.homeworks.DoHomeworkReq.class,
      responseType = proto.homeworks.Homework.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<proto.homeworks.DoHomeworkReq,
      proto.homeworks.Homework> getDoHomeworkMethod() {
    io.grpc.MethodDescriptor<proto.homeworks.DoHomeworkReq, proto.homeworks.Homework> getDoHomeworkMethod;
    if ((getDoHomeworkMethod = HomeworkServiceGrpc.getDoHomeworkMethod) == null) {
      synchronized (HomeworkServiceGrpc.class) {
        if ((getDoHomeworkMethod = HomeworkServiceGrpc.getDoHomeworkMethod) == null) {
          HomeworkServiceGrpc.getDoHomeworkMethod = getDoHomeworkMethod =
              io.grpc.MethodDescriptor.<proto.homeworks.DoHomeworkReq, proto.homeworks.Homework>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DoHomework"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.homeworks.DoHomeworkReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  proto.homeworks.Homework.getDefaultInstance()))
              .build();
        }
      }
    }
    return getDoHomeworkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HomeworkServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeworkServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeworkServiceStub>() {
        @java.lang.Override
        public HomeworkServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeworkServiceStub(channel, callOptions);
        }
      };
    return HomeworkServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HomeworkServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeworkServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeworkServiceBlockingStub>() {
        @java.lang.Override
        public HomeworkServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeworkServiceBlockingStub(channel, callOptions);
        }
      };
    return HomeworkServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HomeworkServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HomeworkServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HomeworkServiceFutureStub>() {
        @java.lang.Override
        public HomeworkServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HomeworkServiceFutureStub(channel, callOptions);
        }
      };
    return HomeworkServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HomeworkServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void assignHomework(proto.homeworks.AssignHomeworkReq request,
        io.grpc.stub.StreamObserver<proto.homeworks.Homework> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAssignHomeworkMethod(), responseObserver);
    }

    /**
     */
    public void doHomework(proto.homeworks.DoHomeworkReq request,
        io.grpc.stub.StreamObserver<proto.homeworks.Homework> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoHomeworkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAssignHomeworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.homeworks.AssignHomeworkReq,
                proto.homeworks.Homework>(
                  this, METHODID_ASSIGN_HOMEWORK)))
          .addMethod(
            getDoHomeworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                proto.homeworks.DoHomeworkReq,
                proto.homeworks.Homework>(
                  this, METHODID_DO_HOMEWORK)))
          .build();
    }
  }

  /**
   */
  public static final class HomeworkServiceStub extends io.grpc.stub.AbstractAsyncStub<HomeworkServiceStub> {
    private HomeworkServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeworkServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeworkServiceStub(channel, callOptions);
    }

    /**
     */
    public void assignHomework(proto.homeworks.AssignHomeworkReq request,
        io.grpc.stub.StreamObserver<proto.homeworks.Homework> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAssignHomeworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doHomework(proto.homeworks.DoHomeworkReq request,
        io.grpc.stub.StreamObserver<proto.homeworks.Homework> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoHomeworkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HomeworkServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HomeworkServiceBlockingStub> {
    private HomeworkServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeworkServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeworkServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public proto.homeworks.Homework assignHomework(proto.homeworks.AssignHomeworkReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAssignHomeworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public proto.homeworks.Homework doHomework(proto.homeworks.DoHomeworkReq request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoHomeworkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HomeworkServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HomeworkServiceFutureStub> {
    private HomeworkServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HomeworkServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HomeworkServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.homeworks.Homework> assignHomework(
        proto.homeworks.AssignHomeworkReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAssignHomeworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<proto.homeworks.Homework> doHomework(
        proto.homeworks.DoHomeworkReq request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoHomeworkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ASSIGN_HOMEWORK = 0;
  private static final int METHODID_DO_HOMEWORK = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HomeworkServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HomeworkServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ASSIGN_HOMEWORK:
          serviceImpl.assignHomework((proto.homeworks.AssignHomeworkReq) request,
              (io.grpc.stub.StreamObserver<proto.homeworks.Homework>) responseObserver);
          break;
        case METHODID_DO_HOMEWORK:
          serviceImpl.doHomework((proto.homeworks.DoHomeworkReq) request,
              (io.grpc.stub.StreamObserver<proto.homeworks.Homework>) responseObserver);
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

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HomeworkServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getAssignHomeworkMethod())
              .addMethod(getDoHomeworkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
