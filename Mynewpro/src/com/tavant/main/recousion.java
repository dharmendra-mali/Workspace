package com.tavant.main;

public class recousion {

	public static void main(String[] args) {

		System.out.println("fact is "+fact(4));
	}

	public static int fact(int x) {

		if (x == 0)
			return 1;
		return fact(x - 1)*x;
	}
}
