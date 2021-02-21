package com.spring.ioc;

public class SwimmingCoach implements Coach{

	private FortuneService fortuneService;
	
	//Constructor
	public SwimmingCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}
	

	public String getDailyFortune() {
		return fortuneService.getDailyFortune();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Swim Everyday!";
	}
	
}
