package com.umutozd.grpc;

import com.umutozd.proto.homeworks.CreateUserReq;
import com.umutozd.proto.homeworks.GetUserReq;
import com.umutozd.proto.homeworks.User;
import com.umutozd.proto.homeworks.UsersServiceGrpc;
import io.grpc.Status;
import io.grpc.StatusException;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

import java.util.HashMap;
import java.util.Map;

@GrpcService
public class UsersServiceImpl extends UsersServiceGrpc.UsersServiceImplBase {
    private final Map<String, User> users;
    private static Integer idCounter = 0;

    public UsersServiceImpl() {
        this.users = new HashMap<>();
    }

    @Override
    public void createUser(CreateUserReq request, StreamObserver<User> responseObserver) {
        // validate input
        try {
            this.validateCreateUserReq(request);
        } catch (StatusException e) {
            responseObserver.onError(e);
            return;
        }

        // create user
        User user = User.newBuilder()
                .setEmail(request.getEmail())
                .setName(request.getName())
                .setId(this.generateRandomId())
                .build();
        this.users.put(user.getId(), user);

        // return created user
        System.out.println("calling onNext");
        responseObserver.onNext(user);
        System.out.println("calling onCompleted");
        responseObserver.onCompleted();
    }

    @Override
    public void getUser(GetUserReq request, StreamObserver<User> responseObserver) {
        // validate input
        try {
            this.validateGetUserReq(request);
        } catch (StatusException e) {
            responseObserver.onError(e);
            return;
        }

        // try finding by id first
        if (!request.getId().isEmpty()) {
            User user = this.users.get(request.getId());
            if (user != null) {
                responseObserver.onNext(user);
                responseObserver.onCompleted();
                return;
            }
            // do not fail as client may have specified email too
        }

        if (request.getEmail().isEmpty()) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("user not found").asRuntimeException());
            return;
        }
        // iterate over user map and search for user with given email
        for (Map.Entry<String, User> set : this.users.entrySet()) {
            User user = set.getValue();
            if (user.getEmail().equals(request.getEmail())) {
                responseObserver.onNext(user);
                responseObserver.onCompleted();
                return;
            }
        }
        responseObserver.onError(Status.NOT_FOUND.withDescription("user not found").asRuntimeException());
    }

    private void validateCreateUserReq(CreateUserReq request) throws StatusException {
        if (request.getEmail().isEmpty() || request.getName().isEmpty()) {
            throw Status.INVALID_ARGUMENT
                    .withDescription("neither email nor name fields can be empty")
                    .asException();
        }
    }

    private void validateGetUserReq(GetUserReq request) throws StatusException {
        if (request.getEmail().isEmpty() && request.getId().isEmpty()) {
            throw Status.INVALID_ARGUMENT
                    .withDescription("at least one of id or email must be non-empty")
                    .asException();
        }
    }

    private String generateRandomId() {
        UsersServiceImpl.idCounter++;
        return UsersServiceImpl.idCounter.toString();
    }
}
