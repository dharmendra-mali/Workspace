package reqannotation;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	
	
	public static void main(String[] args) throws Exception {
		
	
	ApplicationContext ab=new ClassPathXmlApplicationContext("resources/springforcon.xml");
     DriverDemo db=ab.getBean(DriverDemo.class, "demo");
      db.printconn();
	
	}
}
