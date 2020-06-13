package day8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Iooperation {

	public void fileWriterDemo() {

		try {
			FileWriter fileWriteVal = new FileWriter(new File("D:\\ws\\abc.txt"));
			fileWriteVal.write("hi this is my first file programe");
			fileWriteVal.write("\n");
			char[] ch = { 'h', 'e', 'l', 'o' };

			fileWriteVal.write(ch);
			fileWriteVal.write("\n");
			fileWriteVal.flush();
			fileWriteVal.close();

		} catch (IOException e) {

			e.printStackTrace();
		}

	}
	


}
