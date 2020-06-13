package pandcnamespace;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pandcnamespace.Car;

public class clinet {

	
	public static void main(String[] args) {
		
		ApplicationContext ab=new ClassPathXmlApplicationContext("resources/springforpanc.xml");
		Object o =ab.getBean("car");
		Car t=(Car)o;
		t.printData();
		
	}
}


