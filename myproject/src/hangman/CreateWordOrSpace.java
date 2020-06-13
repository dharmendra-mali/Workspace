package hangman;

public class CreateWordOrSpace {

	public void printWordOrSpace(int lengthOfTheWord) {

		for (int i = 0; i < lengthOfTheWord; i++) {
			System.out.print("_ ");
		}

	}

	public void printWordOrSpace(char[] charArray, int lengthOfTheWord) {

		for (int i = 0; i < lengthOfTheWord; i++) {
			System.out.print(charArray[i] + " ");
		}

	}

	public void createWord(char[] charArray, int lengthOfTheWord) {

		for (int i = 0; i < lengthOfTheWord; i++) {
			charArray[i] = '_';
		}

	}

	public void updateWord(char[] charArray, char character, int indexOfCharacter) {

		charArray[indexOfCharacter] = character;

	}

	public void score(int numberofAttempts, int lengthOfWord) {
		int score;
		if (numberofAttempts == 1)
			score = 100;
		else if (numberofAttempts == 2)
			score = 80;
		else {
			if (numberofAttempts <= (lengthOfWord / 2)) {
				score = 50;
			} else {
				score = 10;
			}
		}

		System.out.println("Your Score is =" + score + "%");

	}

}
