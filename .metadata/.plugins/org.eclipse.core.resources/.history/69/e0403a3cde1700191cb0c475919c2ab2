package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration.class);
		AddFruitls addFruitls = applicationContext.getBean(AddFruitls.class,"addFruit");
		//AddFruitls addFruitls2 = applicationContext.getBean(AddFruitls.class, "gjh");
		addFruitls.getExampleFruit().getList().add("heelo");
		System.out.println(addFruitls.getExampleFruit().getList().get(0));
	}
}
