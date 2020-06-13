package day8;

import hangman.GenerateRandomWord;

public class mypp {

	static GenerateRandomWord re = new GenerateRandomWord();

	static String word = re.randomWord();
	static int lenth = word.length();
	static int templenth = lenth - 1;

	char[] ch = word.toCharArray();
	char[] chr = new char[lenth];
	
	void pf(int index){
		
		
	}
	
	
	void chek() {
		
		while (templenth > 0) {

			//System.out.println("enter the charctor\n");
		//	while (lenth - 1 > 0) {

				System.out.print(ch[templenth] + " ");
				templenth--;
			//}
		}

	}

	public static void main(String[] args) {

		mypp temp = new mypp();
		temp.chek();

		System.out.println("\n ");
		for (int i = 0; i < lenth - 1; i++) {
			System.out.print("_ ");
		}

	}

}
