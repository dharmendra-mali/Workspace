package data_structure;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoArray {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		FileReader fileReader = new FileReader("D:\\ws\\demo.txt");

		@SuppressWarnings("resource")
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		String line = bufferedReader.readLine();

		String[] s = bufferedReader.readLine().split(" ");
		int[] arrayOfnum = new int[1000];

		for (int i = 0; i < s.length; i++) {

			(arrayOfnum[Integer.valueOf(s[i])])++; 

		}

		line = bufferedReader.readLine();
		int num = Integer.valueOf(line);

		int[] arrnum = new int[num];
		line = bufferedReader.readLine();

		int k = 0;

		while (line != null) {

			arrnum[k] = Integer.valueOf(line);
			k++;
			line = bufferedReader.readLine();

		}

		for (int i = 0; i < arrnum.length; i++) {

			for (int j = 0; j < arrayOfnum.length; j++) {
                  
				if(arrnum[i]==j&&arrayOfnum[j]>0){
					
					System.out.println(j);
				}else
				{
					System.out.println("NOT PRESENT");
				}

			}

		}

	}

}
