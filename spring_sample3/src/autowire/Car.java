package autowire;

public class Car {

	private Engine engine;
	private String carName;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public void printData() {

		System.out.println("Car name is "+carName+" And modle no is "+engine.getModleNo());
		
	}

}
