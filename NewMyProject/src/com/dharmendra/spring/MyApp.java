package com.dharmendra.spring;

import test.BassballCoach;
import test.Coach;

public class MyApp {

	public static void main(String[] args) {
		
		Coach coach = new BassballCoach();
		System.out.println(coach.getWorkOut());
	}

}
