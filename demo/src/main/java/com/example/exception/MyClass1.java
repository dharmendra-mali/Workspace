package com.example.exception;

public class MyClass1 {

	public int fun(int cat) {

		int n = 0;

		if (cat < 10) {
           throw new MyException("number is "+cat);
		}
		else {
			n=cat;
		}

		return n;
	}

}