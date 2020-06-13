package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.ExampleForCollaction;

public class clinet {
	public static void main(String[] args) {
		ApplicationContext ab=new ClassPathXmlApplicationContext("resources/spring.xml");
		ExampleForCollaction t =ab.getBean(ExampleForCollaction.class,"list");
		t.printData();
	
	
	}

}
