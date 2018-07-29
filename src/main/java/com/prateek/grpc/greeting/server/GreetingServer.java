package com.prateek.grpc.greeting.server;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GreetingServer {
	
	private static ShutdownServerHandler serverShutdownHandler ;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Hello GRPC...... Creating server on port 50051");
		
		/* Create a server to listen on port 50051 */
		Server server = ServerBuilder.forPort(50051).build();
		
		/* Start the server */
		server.start();
		
		/* Add handler to shutdown server when server is terminated by user */
		serverShutdownHandler = new ShutdownServerHandler();
		serverShutdownHandler.setServer(server);
		Runtime.getRuntime().addShutdownHook(serverShutdownHandler);
		
		/* Run the program, run server until user terminate it */
		server.awaitTermination();
		
	}
}

class ShutdownServerHandler extends Thread{
	private Server server;
	
	
	public Server getServer() {
		return server;
	}


	public void setServer(Server server) {
		this.server = server;
	}


	@Override
	public void run() {
		System.out.println("Received server shutdown request");
		server.shutdown();
		System.out.println("Successfully stopped the server");
	}
}
