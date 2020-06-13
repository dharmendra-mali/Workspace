package cards;

import java.util.ArrayList;

public class Searched {

	public ArrayList<Card> searchByValue(ArrayList<Card> deck, String searchInfo) {

		ArrayList<Card> tempDeck = new ArrayList<>();

		switch (searchInfo) {

		case "even":
			for (Card temp : deck) {

				if (getCardValue(temp) % 2 == 0) {
					tempDeck.add(temp);

				}
			}

			break;
		case "odd":
			for (Card temp : deck) {

				if (getCardValue(temp) % 2 != 0) {
					tempDeck.add(temp);

				}
			}
			break;

		case "face":
			for (Card temp : deck) {

				if (getCardValue(temp) == 1 || getCardValue(temp) == 11 || getCardValue(temp) == 12
						|| getCardValue(temp) == 13) {
					tempDeck.add(temp);

				}
			}
			break;
		default:
			tempDeck = searching(deck, searchInfo);
			break;

		}
		return tempDeck;
	}

	public static ArrayList<Card> searching(ArrayList<Card> list, String search) {
		ArrayList<Card> tempDeck = new ArrayList<>();
		for (Card temp : list) {

			if (temp.getValue().toUpperCase().equals(search.toUpperCase())) {
				tempDeck.add(temp);

			}
		}
		return tempDeck;
	}

	public static int getCardValue(Card value1) {
		String vCard1 = value1.getValue();

		switch (vCard1) {
		case "Ace":
			vCard1 = "1";
			break;
		case "jack":
			vCard1 = "11";
			break;
		case "queen":
			vCard1 = "12";
			break;
		case "king":
			vCard1 = "13";
			break;
		}

		int r1 = Integer.valueOf(vCard1);

		return r1;
	}

	public ArrayList<Card> searchByShape(ArrayList<Card> deck, String searchInfo) {
		ArrayList<Card> tempDeck = new ArrayList<>();
		for (Card temp : deck) {

			if (temp.getShape().toUpperCase().equals(searchInfo.toUpperCase())) {
				tempDeck.add(temp);

			}
		}

		return tempDeck;
	}

	public ArrayList<Card> searchByColor(ArrayList<Card> deck, String searchInfo) {
		ArrayList<Card> tempDeck = new ArrayList<>();
		for (Card temp : deck) {

			if (temp.getColor().toUpperCase().equals(searchInfo.toUpperCase())) {
				tempDeck.add(temp);

			}
		}

		return tempDeck;
	}

	public ArrayList<Card> searchByNumaricValue(ArrayList<Card> deck, String searchInfo) {
		ArrayList<Card> tempDeck = new ArrayList<>();
		for (Card temp : deck) {

			try {
				if (Integer.valueOf(temp.getValue()) == Integer.valueOf(searchInfo)) {

					tempDeck.add(temp);

				}
			} catch (Exception e) {

			}
		}

		return tempDeck;
	}

}
