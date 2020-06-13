package test;

import java.sql.SQLException;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import bean.Test;
public class clinet {
	

	public static void main(String[] args) throws SQLException {
		
	ConfigurableApplicationContext applicationContext =new ClassPathXmlApplicationContext("resources/spring.xml");
	boolean b=true;
	while(b){
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter 1 for save 2 close");
		int key=scanner.nextInt();
		if(key ==1)
			b=true;
		else {
			b=false;
		}
		switch (key) {
		case 1:
			Test test =applicationContext.getBean(Test.class, "stu");
			System.out.println("enter id");
			int id=scanner.nextInt();
			System.out.println("enter name");
			String name=scanner.next();
			System.out.println("enter 1 email");
			String email=scanner.next();
			test.save(id, name, email);
			break;

		default:
			applicationContext.close();
			
			break;
		}
		
		
	}
	
	
	}

}
