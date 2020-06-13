package predicates;

import java.util.function.Predicate;

//write a program to display name start with 'K'
public class Test1 {

	public static void main(String[] args) {

		String[] str = { "ss", "aa", "khhh", "kaaaa" };
		Predicate<String> p = s -> s.charAt(0) == 'k';

		methodOne(p.negate(), str);
	}

	public static void methodOne(Predicate<String> p, String[] x) {

		for (String temp : x) {
			if (p.test(temp))
				System.out.println(temp);
		}
	}

}
