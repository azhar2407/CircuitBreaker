package com.techsumm.circuit.breaker.service;

import org.springframework.stereotype.Service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@Service
public class CircuitBreakerService {
	
	@HystrixCommand(fallbackMethod = "fallback", commandProperties = {
			@HystrixProperty( name = "execution.isolation.thread.timeoutInMilliseconds", value = "2000"),
			@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds", value = "1800")
	})
	public String helloWord() throws InterruptedException
	{
		
		Thread.sleep(3000);
		return "Hello World!";
		
	}
	
	public String fallback()
	{
		return "Circuit broke!!";
	}
}
