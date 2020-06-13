package hangman;

import java.util.Scanner;

public class HangManWorkingClass {

	Scanner scan = new Scanner(System.in);
	CreateWordOrSpace obectOfCreate = new CreateWordOrSpace();
	GenerateRandomWord object = new GenerateRandomWord();

	String theRandWord = object.randomWord();
	int lengthOfWord = theRandWord.length();
	int tempLength = lengthOfWord;
	char[] charArray = theRandWord.toCharArray();
	char[] newCharArray = new char[lengthOfWord];
	char character;
	int numberofAttempts = 1;

	public void workingMathod() {

		obectOfCreate.printWordOrSpace(lengthOfWord);
		System.out.println(theRandWord);
		System.out.println();
		obectOfCreate.createWord(newCharArray, lengthOfWord);
		while (tempLength > 0) {

			boolean flag = false;
			System.out.println();
			System.out.println("guess the word");
			character = scan.next().toLowerCase().charAt(0);

			for (int j = 0; j < lengthOfWord; j++) {

				if (charArray[j] == character) {

					obectOfCreate.updateWord(charArray, '_', j);
					obectOfCreate.updateWord(newCharArray, character, j);
					tempLength--;
					flag = true;

				}

			}

			if (flag == false) {
				System.out.println("wrong choice");
				numberofAttempts++;
			}

			obectOfCreate.printWordOrSpace(newCharArray, lengthOfWord);

		}
		System.out.println();

		System.out.println("you win");
		obectOfCreate.score(numberofAttempts, lengthOfWord);
	}

}
