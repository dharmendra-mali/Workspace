package day8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferDemo {

	public void befferWrite() throws IOException {

		FileWriter file = new FileWriter("D:\\ws\\mypro.txt");

		BufferedWriter bf = new BufferedWriter(file);
		bf.write("dharmendra ");
		bf.newLine();
		char[] ch = { 's', 'o', 'm', 'e', ' ', 's', 't', 'r', 'i', 'n', 'g' };

		bf.write(ch);
		bf.flush();
		bf.close();

	}

}
