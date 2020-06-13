package lembda_expration;

import java.util.List;
import java.util.function.Function;

import cards.Card;
import cards.CustomArrayList;

public class Functions {

	public static void main(String[] args) {

		String[] value = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king" };
		String[] shape = { "Heart", "Flower", "Diamond", "Leaf" };
		String[] color = { "Red", "Black" };
		CustomArrayList card = new CustomArrayList();
		List<Card> list = card.addValues(value, shape, color);

		Function<String, Integer> f = str -> str.length();
		Function<Card, String> fCard = str -> str.getColor().substring(2);

		System.out.println("lenth of  " + f.apply("ddddd"));
		System.out.println("lenth of cards " + fCard.apply(list.get(4)));

	}

}
