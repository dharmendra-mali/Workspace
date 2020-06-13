package predicates;

import java.util.function.Predicate;

public class TestToPredicate {

	public static void main(String[] args) {

		PredicateJoined joined = new PredicateJoined();

		// predicate always check some condition and return a boolean value
		Predicate<Integer> predicate = i -> i > 10;
		Predicate<String> sp = s -> s.length() > 3;
		System.out.println(predicate.test(11));
		System.out.println(predicate.test(1));
		System.out.println(sp.test("ssws"));
		System.out.println("=====================================================================================");
		joined.MethodOne();
	}

}

// use predicate join
class PredicateJoined {

	public void MethodOne() {

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 10;
		System.out.println("no is greate than 10 " + p2.test(14));
		System.out.println("no is even " + p1.test(4));
		System.out.println(p1.or(p2).negate().test(1));

	}
}