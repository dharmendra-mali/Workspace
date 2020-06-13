package com.example.regularexpration;

import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {

		RegExpration expration = new RegExpration();

		// pattern or matcher example
		// patt();
		// all pattern [a-z A-Z 0-9]
		//expration.regExpration();
		// //s //S //w //W //d //D .
        // expration.spaceReg();
		// using Quntifire
		expration.quntifier();
		// String Tokenizer
		//expration.stringTokeExam();
		//expration.patternSplit();
		
	}

	static void patt() {

		int count = 0;
		Pattern pattern = Pattern.compile("ab");
		java.util.regex.Matcher match = pattern.matcher("abbababa");

		while (match.find()) {

			count++;
			System.out.println(match.start() + "...." + match.end() + "...." + match.group());
		}
		System.out.println("the no of occurances is  " + count);

	}

}
