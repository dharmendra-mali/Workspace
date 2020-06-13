package cards;

import java.util.ArrayList;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Shuffle {

	Searched searched = new Searched();

	public static boolean check(BiPredicate<Card, String> pre, ArrayList<Card> list, String str) {

		list.forEach(cart -> pre.test(cart, str));

		return false;
	}

	public ArrayList<Card> shuffleDeck(ArrayList<Card> deck) {

		ArrayList<Card> temp = new ArrayList<Card>();
		while (!deck.isEmpty()) {
			int loc = (int) (Math.random() * deck.size());
			temp.add(deck.get(loc));
			deck.remove(loc);
		}
		deck = temp;
		return deck;
	}

	public ArrayList<Card> search(ArrayList<Card> deck, String searchInfo) {

		String[] temp = searchInfo.split(" ");

		ArrayList<Card> tempDeck = deck;

		Stream<Card> stream = tempDeck.stream();
		for (int i = 0; i < temp.length; i++) {
			if (getPossition(temp[i]) != -1) {
				String ss = temp[i];
				stream = tempDeck.stream();
				switch (getPossition(temp[i])) {
				case 0:

					break;
				case 1:
					// tempDeck = searched.searchByValue(tempDeck, temp[i]);
					System.out.println("in value");
					tempDeck = (ArrayList<Card>) stream.filter(c -> c.getValue().equals(ss) && c.getShape().equals(ss))
							.collect(Collectors.toList());
					break;
				case 2:
					tempDeck = searched.searchByColor(tempDeck, temp[i]);
					break;
				case 3:
					tempDeck = searched.searchByShape(tempDeck, temp[i]);
					break;
				case 4:

					break;
				case 5:

					tempDeck = searched.searchByNumaricValue(tempDeck, temp[i]);
					break;
				}

			}

		}

		return tempDeck;
	}

	public static int getPossition(String possition) {
		int temp = -1;

		if (possition.toUpperCase().equals("all".toUpperCase())) {

			temp = 0;

		} else {
			if (possition.toUpperCase().equals("even".toUpperCase())
					|| possition.toUpperCase().equals("odd".toUpperCase())
					|| possition.toUpperCase().equals("face".toUpperCase())
					|| possition.toUpperCase().equals("king".toUpperCase())
					|| possition.toUpperCase().equals("queen".toUpperCase())
					|| possition.toUpperCase().equals("jack".toUpperCase())
					|| possition.toUpperCase().equals("Ace".toUpperCase())) {
				temp = 1;

			} else {

				if (possition.toUpperCase().equals("red".toUpperCase())
						|| possition.toUpperCase().equals("black".toUpperCase())) {

					temp = 2;
				} else {

					if (possition.toUpperCase().equals("Heart".toUpperCase())
							|| possition.toUpperCase().equals("Flower".toUpperCase())
							|| possition.toUpperCase().equals("Diamond".toUpperCase())
							|| possition.toUpperCase().equals("Leaf".toUpperCase())) {
						temp = 3;
					} else {

						if (possition.toUpperCase().equals("Cards".toUpperCase())) {

							temp = 4;
						} else {
							temp = 5;
						}

					}
				}

			}

		}

		return temp;
	}

}
