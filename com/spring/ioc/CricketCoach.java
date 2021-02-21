package com.spring.ioc;

public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	public CricketCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Cricket a day";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket:"+fortuneService.getDailyFortune();
	}

}
