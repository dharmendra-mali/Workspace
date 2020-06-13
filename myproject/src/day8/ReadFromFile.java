package day8;

import java.io.File;
import java.io.FileReader;

public class ReadFromFile {

	public void rederDemo() {

		try {

			File file = new File("D:\\ws\\abc.txt");
			FileReader fr = new FileReader(file);
			int fileLenth = fr.read();
			
			fr.close();
			System.out.println("the lenth of file is = " + fileLenth);

		} catch (Exception e) {

			System.out.println("\n file is not founds");
		}

	}

}
