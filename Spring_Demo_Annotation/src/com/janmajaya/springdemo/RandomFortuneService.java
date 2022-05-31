package com.janmajaya.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// Create an array of String
	private String[] data = { "Today you will win", "God Bless you all", "May god bless you" };
	// Create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {

		// pick a random fortune out of that
		int index = myRandom.nextInt(data.length);
		String theFortune = data[index];
		return theFortune;
	}

}
