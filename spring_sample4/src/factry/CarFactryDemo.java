package factry;

public class CarFactryDemo {
	
private static String carName;
	
	
	
	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		CarFactryDemo.carName = carName;
	}
	public static Car getInstance() throws Exception{
		
		Car car =(Car)Class.forName(carName).newInstance();
		
		return  car;
		
	}

}
