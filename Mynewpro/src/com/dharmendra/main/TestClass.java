package com.dharmendra.main;

import java.util.ArrayList;

public class TestClass {

	public static void main(String[] args) {
		//System.out.println(2^2);
        ArrayList< Integer> x=new ArrayList<>();
        for(int i=1;i<11;i++)
        	x.add(i);
        
        x.forEach(w->{});
        String s1="he";
        String s2="he";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
	}

}
