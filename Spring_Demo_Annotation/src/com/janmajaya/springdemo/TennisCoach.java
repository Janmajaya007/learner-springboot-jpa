package com.janmajaya.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singletone")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneServie;

	public TennisCoach() {
		System.out.println("Inside the default Constructor");
	}

	/*
	 * Constructor AUTOWIRED injection
	 * 
	 * @Autowired public TennisCoach(FortuneService fortuneServie) {
	 * this.fortuneServie = fortuneServie; }
	 */

	/*
	 * 
	 * SETTER METHOD AUTOWIRED injection
	 * 
	 * @Autowired public void setFortuneServie(FortuneService fortuneServie) {
	 * System.out.println("Inside the Setter injection SEET method");
	 * this.fortuneServie = fortuneServie; }
	 */
	/*
	 * AnyMethod AUTOWIRED injection
	 * 
	 * @Autowired public void doSomeCrazyStuf(FortuneService fortuneServie) {
	 * System.out.println("Inside the doSomeCrazyStuf method");
	 * this.fortuneServie = fortuneServie; }
	 */
	
	//define my init method
	@PostConstruct
	public void initMethod(){
		System.out.println("Inside the init method");
	}
	//define my destroy method
	@PreDestroy
	public void destroyMethod(){
		System.out.println("Inside the destroy method");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your daily backhand Volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneServie.getFortune();
	}

}
