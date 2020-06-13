package day8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BufferRederDemo {

	public void rederDemo() throws IOException {
		FileReader fr = new FileReader("D:\\ws\\demo.txt");
		ArrayList<String> al = new ArrayList<String>();
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while (line != null) {
			al.add(line);
			line = br.readLine();
		}

		System.out.println(al);
		br.close();

	}

}
