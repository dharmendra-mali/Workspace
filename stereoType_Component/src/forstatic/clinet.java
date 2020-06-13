package forstatic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class clinet {

	public static void main(String[] args) {
		
		
		
		
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("resources/spring_for_static.xml");
		Car car=ac.getBean(Car.class, "car");
		car.printCarName();
		
	}
	
	
}
