package com.janmajaya.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// Read Spring configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println((theCoach.getDailyFortune()));
		System.out.println("Email: " + theCoach.getEmail());
		System.out.println("Team: " + theCoach.getTeam());
		// close the context
		context.close();

	}

}
