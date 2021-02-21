package com.spring.ioc;

public class StuntCoach implements Coach {
	private FortuneService fortuneService;

	//Constructor
	public StuntCoach() {
		System.out.println("Stunt Constructor");
	}
	
	//setter
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
		System.out.println("Stunt Setter method");
	}

	
	//interface methods 
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Stunt!";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getDailyFortune();
	}

}
