package com.prateek.grpc.greeting.client;

import com.proto.dummy.DummyServiceGrpc;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GreetingClient {
	public static void main(String[] args) {
		System.out.println("Running GRPC Greeting Client....");
		
		/* Create a insecure(plaintext) channel */
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		
		/* Create a synchronous stub */
		DummyServiceGrpc.DummyServiceBlockingStub syncClient = DummyServiceGrpc.newBlockingStub(channel);
		
		/* Shutdown channel */
		System.out.println("Shutting down channel");
		channel.shutdown();
		
	}
}
