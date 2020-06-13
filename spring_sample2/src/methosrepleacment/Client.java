package methosrepleacment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.BeanDefinitionDslKt;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String...args ) {
		
		
		ApplicationContext applicationContext =new ClassPathXmlApplicationContext("resources/spring_for_methos.xml");
		Ban ban =(Ban)applicationContext.getBean("bank");
		ban.deposit();
		ban.withdrawle();
		ban.cal();
	}

}
