package lembda_expration;

public class Demo4 {

	public static void main(String[] args) {

		/*
		 * Comparator<Integer> com=(a,b)->{ int x=Integer.valueOf(a); int
		 * y=Integer.valueOf(b);
		 * 
		 * if(x>y) return -1; else{ if(y<x) return 1; } return 0; };
		 */

		// exmaple of Tree maps
		/*
		 * TreeMap<Integer,String> map=new
		 * TreeMap<>((a,b)->(a>b)?-1:(a<b)?-1:0);
		 * 
		 * map.put(1, "aa"); map.put(2, "aa"); map.put(3, "aa"); map.put(4,
		 * "aa"); map.put(5, "aa"); map.put(6, "aa");
		 * 
		 * System.out.println(map);
		 */

	}
}
