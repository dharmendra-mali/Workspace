package day8;

import java.util.Scanner;

import hangman.GenerateRandomWord;

public class myprohman {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		GenerateRandomWord gr = new GenerateRandomWord();

		String s = gr.randomWord();

		int le = s.length();
		int lenth = le;
		char[] ch = s.toCharArray();
		char[] ch1 = new char[le];
		char ch3;

		System.out.println(s);

		for (int i = 0; i < le; i++) {
			System.out.print("_ ");
		}
		for (int i = 0; i < le; i++) {
			ch1[i] = '_';
		}
		while (lenth > 0) {
			int flag = 0;
			System.out.println();
			System.out.println("enter your word");
			ch3 = sc.next().charAt(0);

			for (int j = 0; j < le; j++) {
				if (ch[j] == ch3) {
					ch[j] = '-';
					ch1[j] = ch3;

					lenth--;
					flag = 1;

				}

			}

			if (flag == 0)
				System.out.println("Wrong word");

			for (int i = 0; i < le; i++) {
				System.out.print(ch1[i] + " ");
			}

		}
		System.out.println();

		System.out.println("you win");

	}

}
