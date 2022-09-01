package com.lc.springboot.demo.mycoolapp.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
	
	//inject properties
	@Value("${team.name}")
	private String teamName;
	
	@Value("${coach.name}")
	private String coachName;
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello World! Time on the server is " + LocalDateTime.now();
	}
	
	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Train a lot, says " + coachName;
	}
	
	@GetMapping("/fortune")
	public String getDailyFortune() {
		return "Today is your lucky day";
	}
	
	@GetMapping("/teaminfo")
	public String getTeamInfo() {
		return "Coach: " + coachName + ", team: " + teamName;
	}
}
