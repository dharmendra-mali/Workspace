package com.example.regularexpration;

import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExpration {

	public void regExpration() {

		Pattern pattern = Pattern.compile("[^a-z A-Z 0-9]");
		Matcher macher = pattern.matcher("a7b@z9#K");
		while (macher.find()) {

			System.out.println(macher.start() + "...." + macher.group());
		}

	}

	public void spaceReg() {

		Pattern pattern = Pattern.compile(".");
		Matcher macher = pattern.matcher("a7b K@9z");
		while (macher.find()) {

			System.out.println(macher.start() + "...." + macher.group());
		}

	}

	public void quntifier() {

		Pattern pattern = Pattern.compile("^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
		Matcher macher = pattern.matcher("abaabaaab");
		while (macher.find()) {

			System.out.println(macher.start() + "...." + macher.group());
		}

	}

	public void stringTokeExam() {

		StringTokenizer stringTokenizer=new StringTokenizer("he is the, con't yes ?"," ");
		System.out.println(stringTokenizer.countTokens());
		while(stringTokenizer.hasMoreTokens()){
			
			System.out.println(stringTokenizer.nextToken());
		}
		
	}
	
	public void  patternSplit(){
		Pattern pattern = Pattern.compile("");
		String [] str=pattern.split("he is the, con't yes ?");
		
		for(String s:str ){
			
			System.out.println(s);
			
		}
		
	}
	
	
	
	
	
	
	
	
	
}
