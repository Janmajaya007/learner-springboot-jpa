package com.janmajaya.springdemo;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneServive implements FortuneService {

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return "Data shows you will win Today";
	}

}
