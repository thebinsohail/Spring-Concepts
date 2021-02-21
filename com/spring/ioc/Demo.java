package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {

		// load configuration
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		// get bean
		Coach coach = context.getBean("myCoach", Coach.class);

		// call
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		
		

	}

}
