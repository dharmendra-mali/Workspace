
public class Example extends hello {

	public Example() {
		System.out.println("in example class");

	}

	public static void main(String[] args) {

		Example e = new Example();
		System.out.println(e.sum(new Integer(1), new Integer(1)));

	}

	public int sum(int a, int b) {
		System.out.println("int method");
		return a + b;
	}

	public int sum(Integer a, Integer b) {
		return a + b;
	}

}

abstract class hello {
	int x;

	public hello() {
//		x=10;
		System.out.println("in Abstract class " + x);
	}
}