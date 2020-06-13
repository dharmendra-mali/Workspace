package dependson;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		
		
		ApplicationContext ab=new ClassPathXmlApplicationContext("resources/springfordependon.xml");
		  
	}
}
