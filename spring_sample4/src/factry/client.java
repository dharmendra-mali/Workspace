package factry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {
	
	
	public static void main(String[] args) {
		
	
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources/spring_for_factry.xml");
     Car car=(Car)applicationContext.getBean("carfactry");
	car.driver();
	
	} 

}
