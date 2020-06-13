package hangman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class GenerateRandomWord {

	public String randomWord() {

		String rendomWord = null;
		int totalWordInFile = 0;
		int indexOfRandomWord = 0;
		Random randomObject = new Random();

		ArrayList<String> arrayListOfWord = new ArrayList<String>();

		try {
			FileReader fileReder = new FileReader("D:\\ws\\WordsFile");
			BufferedReader bufferReder = new BufferedReader(fileReder);
			String line = bufferReder.readLine();

			while (line != null) {
				arrayListOfWord.add(line);
				line = bufferReder.readLine();
				totalWordInFile++;

			}

			indexOfRandomWord = randomObject.nextInt(totalWordInFile);
			bufferReder.close();

		} catch (IOException e) {
			System.err.println("File not found or something else \n");

		}

		rendomWord = arrayListOfWord.get(indexOfRandomWord);

		return rendomWord;
	}

}
