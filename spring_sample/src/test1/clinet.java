package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.Test;

public class clinet {

	
	public static void main(String[] args) {
		
		ApplicationContext ab=new ClassPathXmlApplicationContext("spring.xml");
		Object o =ab.getBean("t");
		Test t=(Test)o;
		t.hello();
		
	}
}
