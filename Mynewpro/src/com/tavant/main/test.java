package com.tavant.main;

class A{
	A(){
		System.out.println("this is class A");
	}
	public void m1(){
		System.out.println("this is class A m1 function");
	}
	
}

class B extends A{
	B(){
		System.out.println("this is class B");
	}
	public void m2(){
		System.out.println("this is class B m2 funtion ");
	}
}


public class test {

	public static void main(String[] args) {
		System.out.println("hello papu");
		
		A a = new B();
		a.m1();

	}

}
