package autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {

	
	@Autowired
	@Qualifier(value="engine2")
	private Engine engine;
	

	public void printData() {

		
		System.out.println(" modle no is "+engine.getModleNo());
		
	}

}
