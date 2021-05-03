package com.example.springboot;

import java.lang.System;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		System.out.print("Hello there!!!!!!");
        return "Greetings from Spring Boot and from Nick!";
        
	}

}