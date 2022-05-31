package com.janmajaya.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	@Value("${foo.email}")
	private String email;

	@Value("${foo.team}")
	private String team;

	private FortuneService fortuneService;

	public SwimCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	
	public String getEmail() {
		return email;
	}


	public String getTeam() {
		return team;
	}


	@Override
	public String getDailyWorkout() {
		return "Swim 1000m as awar up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
