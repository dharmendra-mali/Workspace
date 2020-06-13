package cards;

import java.util.ArrayList;
import java.util.Scanner;

public class DeckOfCards extends CustomArrayList {

	int n = 13;

	public static void main(String args[]) {

		Scanner scanner = new Scanner(System.in);
		String[] value = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
		String[] shape = { "Heart", "Flower", "Diamond", "Leaf" };
		String[] color = { "Red", "Black" };

		CustomArrayList custom = new CustomArrayList();
		
		Shuffle shuffle = new Shuffle();

		ArrayList<Card> list;
		list = custom.addValues(value, shape, color);

		// custom.printValues(list);

		//list= shuffle.shuffleDeck(list);

		System.out.println("-------------------------------------------------------");

		// custom.printValues(list);

		System.out.println("-------------------------------------------------------");

		// Collections.sort(list,Card.cardValue);
		// Collections.sort(list,Card.cardShape);
		System.out.println("after-------------------------------------------------------");
		// custom.printValues(list);
	System.out.println("-Seach your cards-");
		System.out.println("-Enter your choice-");
		String choice = scanner.nextLine();

		list = shuffle.search(list, choice);

		
		
		custom.printValues(list);
		scanner.close();
	}

}
