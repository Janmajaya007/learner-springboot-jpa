package com.janmajaya.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);

		// check if they are same
		boolean result = (theCoach == alphaCoach);
		// print the result
		System.out.println(result);
		System.out.println("The Address of theCoach is =" + theCoach.hashCode());
		System.out.println("The Address of alphaCoach is =" + alphaCoach.hashCode());
		
	}
}
