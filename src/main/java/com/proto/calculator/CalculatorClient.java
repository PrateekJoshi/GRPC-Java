package com.proto.calculator;

import com.proto.calculator.CalculatorGrpc.CalculatorBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {
	public static void main(String[] args) {
		System.out.println("Running GRPC Greeting Client....");

		/* Create a insecure(plaintext) channel */
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		/* Create a synchronous stub */
		CalculatorBlockingStub syncClient = CalculatorGrpc.newBlockingStub(channel);
		
		InputNumber request = InputNumber.newBuilder().setNum1(1).setNum2(2).build();
		OutputNumber response = syncClient.addition(request);
		
		/* Display results */
		System.out.println(response.getNum());
		
		/* Shutdown channel */
		System.out.println("Shutting down channel");
		
		channel.shutdown();
	}
}
