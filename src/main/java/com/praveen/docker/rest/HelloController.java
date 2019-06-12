package com.praveen.docker.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value="/docker/hello")
	public String printHello()
	{
		return "Hello Praveen";
	}
	
	
}
