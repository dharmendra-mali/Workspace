package withoutnewkeyword;

public class Example {

	public static void main(String[] args)
			throws ClassNotFoundException, InstantiationException, IllegalAccessException, CloneNotSupportedException {

		MeClass a = new MeClass(20);
		Myclass myclass = new Myclass(1, a);

		Myclass m2 = (Myclass) myclass.clone();

		m2.setMyId(2);
		m2.getMeClass().setId(11);
//		System.out.println(myclass.getMyId() + " / " + myclass.getMeClass().getId());
//		System.out.println(m2.getMyId() + " / " + m2.getMeClass().getId());
		System.out.println("kk"+10+10);

	}

}
