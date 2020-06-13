import java.util.ArrayList;
import java.util.List;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="helloddddddddddd";
		String s2="devdddddddddd";
		String s3="kumarddddd";
		String s4="youddddd";
		String s5="areddd";
		String s= "grate";
		
		
		List<String >list =new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s);
		System.out.println(list.toString());

		list.remove(s1);
		System.out.println(list.toString());
	}
	
	ArrayList<Card> list;
	
	
	
	

}
