package factry;

import org.springframework.beans.factory.FactoryBean;

public class CarFactry implements FactoryBean<Car> {

	private static String carName;
	
	
	
	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		CarFactry.carName = carName;
	}

	@Override
	public Car getObject() throws Exception {
		
		Car car=(Car)Class.forName(carName).newInstance(); 
		return car;
	}

	@Override
	public Class<Car> getObjectType() {
		
		return Car.class;
	}
	

	
	

}
