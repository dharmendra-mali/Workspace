package functionpredicat;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		Function<String, String> function = str -> str.replaceAll(" ", "");
        Function<String, Integer> f1=str->str.length()-str.replaceAll(" ", "").length();
		String s = "dhar me dra";
		String str;
		str = function.apply(s);
		System.out.println(str);
        System.out.println("===========================");
        System.out.println(f1.apply(s));
	}

}
