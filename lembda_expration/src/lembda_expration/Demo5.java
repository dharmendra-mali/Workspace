package lembda_expration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

abstract class h {

	public static void m() {

		System.out.println("Abstact fun");
	}
}

class Helper extends h {

	public static void m() {

		System.out.println("concted class");
	}

}

public class Demo5 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		Set<Integer> s = new HashSet<>();
		s.add(10);
		list.add(10);

		int i = list.get(1);

		System.out.println(i);

		h.m();

	}

}
