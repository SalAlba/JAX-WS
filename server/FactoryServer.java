package server;

import java.io.IOException;

import javax.xml.ws.Endpoint;

public class FactoryServer {
	public static void main(String[] args) throws IOException {		
		String address = "http://localhost:9999/factoryService";
		Factory calculatorService = new Factory();
		Endpoint.publish(address, calculatorService);
		System.out.println("Service started at " + address);
	}
}
