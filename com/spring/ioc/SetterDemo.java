package com.spring.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext("beans.xml");
		
		StuntCoach theCoach=context.getBean("stuntCoach",StuntCoach.class);
		
		theCoach.getDailyWorkout();
		theCoach.getDailyFortune();
		
	}

}
