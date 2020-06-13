package lockupmethods;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("resources_for_luckup/spring.xml"); 
		
		System.out.println("-----------car-----------");
		Car car=(Car)applicationContext.getBean("car");
		System.out.println(car.myCarEngine().getEngineName());
		System.out.println("-----------bus-----------");
		Bus bus=(Bus)applicationContext.getBean("bus");
		System.out.println(bus.myBusEngine().getEngineName());
		
		System.out.println("-----------truck-----------");
		Truck truck=(Truck)applicationContext.getBean("truck");
		System.out.println(truck.myTruckEngine().getEngineName());
		
	}
	
}
