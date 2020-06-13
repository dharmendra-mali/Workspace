package com.main;

public class Emp {
	private String name;
	private String email;
	private int id;

	public Emp(String name) {
		// TODO Auto-generated constructor stub

		this.name = name;
	}

	/*public Emp(String name, String email) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.email = email;
	}*/

	public Emp(int id) {
		// TODO Auto-generated constructor stub

		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void hello() {

		System.out.println("hello " + name + " your email is " + email + " epmlyee id is " + id);
	}

}
