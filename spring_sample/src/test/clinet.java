package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class clinet {
	public static void main(String[] args) {
		
	ClassPathXmlApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
	Coach coach = (Coach) context.getBean("myCoach",Coach.class);
	System.out.println(coach.getWorkOut());
	
	}

}
