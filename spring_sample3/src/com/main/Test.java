package com.main;

public class Test {

	private String name[];

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public void printNmae() {
		for (String names : name) {
			System.out.println(names);
		}
	}

}
