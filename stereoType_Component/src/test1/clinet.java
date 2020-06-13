package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class clinet {

	
	public static void main(String[] args) {
		
		ApplicationContext ab=new ClassPathXmlApplicationContext("resources/spring.xml");
		Object o =ab.getBean("emp");
		
		
	}
}
