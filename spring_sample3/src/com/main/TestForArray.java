package com.main;

public class TestForArray {
	private Engine engine[];

	public Engine[] getEngine() {
		return engine;
	}

	public void setEngine(Engine[] engine) {
		this.engine = engine;
	}

	public void printData() {

		for(Engine en:engine)
		{
		System.out.println("engine modle is "+en.getModleNo());
		}
	}

}
