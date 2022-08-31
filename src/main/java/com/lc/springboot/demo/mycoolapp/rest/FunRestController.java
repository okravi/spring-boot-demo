package com.lc.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Train a lot";
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day";
	}
}
