package DefualtMethods;

public class TestDefualtMethod implements interf {

	public static void main(String[] args) {
		TestDefualtMethod t = new TestDefualtMethod();
		t.methodOne();
		demo d = new demo();
		d.m1();

	}

}

interface interf {

	default void methodOne() {
		System.out.println("defualt methods");
	}
}

interface left {
	default void m1() {

		System.out.println("left defualt methos");
	}
}

interface right {
	default void m1() {

		System.out.println("right defualt methos");
	}
}

class demo implements left, right {

	@Override
	public void m1() {

		left.super.m1();
	}

}