package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.Test;
import com.main.TestForArray;

public class NewClinetForArray {

	public static void main(String[] args) {

		ApplicationContext ab = new ClassPathXmlApplicationContext("resources/spring3.xml");
		Object o = ab.getBean("TFA");
		TestForArray t = (TestForArray) o;
		t.printData();

	}

}
