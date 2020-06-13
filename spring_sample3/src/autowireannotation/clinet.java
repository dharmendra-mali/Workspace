package autowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import autowireannotation.Car;

public class clinet {

	
	public static void main(String[] args) {
		
		ApplicationContext ab=new ClassPathXmlApplicationContext("resources/springautowire2.xml");
		Object o =ab.getBean("car");
		Car t=(Car)o;
		t.printData();
		
	}
}


