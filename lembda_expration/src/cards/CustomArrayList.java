package cards;

import java.util.ArrayList;
import java.util.Iterator;

public class CustomArrayList {

	int n = 13;
	ArrayList<Card> list = new ArrayList<>();

	public ArrayList<Card> addValues(String[] value, String[] shape, String[] color) {

		int j = 0;

		for (int k = 0; k < 4; k++) {

			for (int i = 0; i < n; i++) {

				list.add(new Card(value[i], shape[k], color[j]));

			}

			j = j ^ 1;
		}

		list.add(new Card("0", "joker", "j"));

		return list;

	}

	public void printValues(ArrayList<Card> list) {
		Iterator<Card> i = list.iterator();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}

	}

}
