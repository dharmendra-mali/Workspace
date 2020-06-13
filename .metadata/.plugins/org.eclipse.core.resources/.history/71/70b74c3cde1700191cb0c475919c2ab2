package calendra;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class example {

	public static void main(String[] args) {
		
    ApplicationContext ab;
	ab = new ClassPathXmlApplicationContext("resources/springforcalender.xml");		
		
    Calendar c =(Calendar)ab.getBean("cal");
    System.out.println("caltype "+c.getCalendarType());
    
    System.out.println("caltype "+c.getTime());
    
	}
	
	
	
}
