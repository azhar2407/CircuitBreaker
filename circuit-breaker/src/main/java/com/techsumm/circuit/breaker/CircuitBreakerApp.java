package com.techsumm.circuit.breaker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@EnableCircuitBreaker
@SpringBootApplication
public class CircuitBreakerApp {
	
	public static void main(String [] args)
	{
		 SpringApplication.run(CircuitBreakerApp.class, args);
	}
}
