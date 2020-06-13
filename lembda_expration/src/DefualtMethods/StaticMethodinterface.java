package DefualtMethods;

public class StaticMethodinterface implements interf {

	public static void main(String[] args) {
		// we can't call interface static method with class object
		// StaticMethodinterface methodinterface=new StaticMethodinterface();
		// methodinterface.methodOne();
		interft.methodOne();
	}

}

interface interft {

	public static void methodOne() {
		System.out.println("interface static methods");
	}
}