package test1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import main.Emp;

public class clinet {

	
	private static ApplicationContext ab;

	public static void main(String[] args) {
		
		ab = new ClassPathXmlApplicationContext("resources/spring.xml");
		Object o =ab.getBean("emp",Emp.class);
		Emp t=(Emp)o;
		t.hello();
		
	}
}
