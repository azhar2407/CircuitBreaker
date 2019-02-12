package com.techsumm.circuit.breaker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techsumm.circuit.breaker.service.CircuitBreakerService;

@RestController
public class CircuitBreakerController {
	
	@Autowired
	CircuitBreakerService circuitBreakerService;
	
	@GetMapping(value = "/hello")
	public String helloWorld() throws InterruptedException
	{
		return circuitBreakerService.helloWord();
	}
}
