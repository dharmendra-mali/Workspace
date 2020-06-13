package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Car {
     
	@Autowired
	private Engine engine;

	public void printData() {

		System.out.println("modle no is " + engine.getModleNo());

	}

}
