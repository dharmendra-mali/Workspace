package com.example.exception;

public class MyClass2 {

	MyClass1 myClass=new MyClass1();
	
	public void mainFun(){
		int x=-1;
		try {
			x=myClass.fun(11);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("number is "+x);
	}
	
	
	
}
