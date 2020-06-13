package forstatic;

public class Car {

	private static String carName;

	public static String getCarName() {
		return carName;
	}

	public static void setCarName(String carName) {
		Car.carName = carName;
	}

	public static void printCarName() {

		System.out.println("carname is= "+carName);
		
	}

}
