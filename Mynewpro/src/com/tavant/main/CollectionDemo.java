package com.tavant.main;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CollectionDemo {

	public static void main(String[] args) {
		int[] x = { 1, 1, 1, 3, 3, 5, 5, 5, 5, 2, 2, 2 };
		// byValue cmp =new byValue();
		Map<Integer, Integer> map = new HashMap<>();
		for (int t : x) {

			if (map.containsKey(t)) {
				int a = map.get(t);
				map.put(t, a + 1);
			} else {
				map.put(t, 1);
			}

		}

		System.out.println(map);

	}

}

class byValue implements Comparator<Map.Entry<Integer, Integer>> {

	@Override
	public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) {
		// TODO Auto-generated method stub
		return o1.getValue() - o2.getValue();
	}

}