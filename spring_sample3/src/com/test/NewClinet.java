package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.Test;

public class NewClinet {

	public static void main(String[] args) {

		ApplicationContext ab = new ClassPathXmlApplicationContext("resources/spring2.xml");
		Object o = ab.getBean("tr");
		Test t = (Test) o;
		t.printNmae();

	}

}
