package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.main.Emp;

public class clinet {

	
	public static void main(String[] args) {
		
		ApplicationContext ab=new ClassPathXmlApplicationContext("resources/spring2.xml");
		Object o =ab.getBean("emp");
		Emp t=(Emp)o;
		t.hello();
		
	}
}
