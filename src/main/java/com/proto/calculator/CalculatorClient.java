package com.proto.calculator;

import com.proto.calculator.CalculatorGrpc.CalculatorBlockingStub;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculatorClient {
	public static void main(String[] args) {
		int num1= 10, num2= 100;
		
		System.out.println("Running GRPC Greeting Client....");

		/* Create a insecure(plaintext) channel */
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

		/* Create a synchronous stub */
		CalculatorBlockingStub syncClient = CalculatorGrpc.newBlockingStub(channel);
		
		InputNumber request = InputNumber.newBuilder().setNum1(num2).setNum2(num1).build();
		OutputNumber response = syncClient.addition(request);
		
		/* Display results */
		System.out.println("Addition of "+num1+" and " +num2+" is "+ response.getNum());
		response = syncClient.subraction(request);
		System.out.println("Subtraction of "+num1+" and " +num2+" is "+ response.getNum());
		response = syncClient.multiply(request);
		System.out.println("Multiplication of "+num1+" and " +num2+" is "+ response.getNum());
		response = syncClient.divide(request);
		System.out.println("Division of "+num1+" and " +num2+" is "+ response.getNum());
		
		/* Shutdown channel */
		System.out.println("Shutting down channel");
		
		channel.shutdown();
	}
}
