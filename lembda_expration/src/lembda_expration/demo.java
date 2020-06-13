package lembda_expration;

import java.util.ArrayList;
import java.util.Collections;

public class demo {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<>();
		i.add(1);
		i.add(6);
		i.add(4);
		i.add(8);
		System.out.println(i);
		 Collections.sort(i);
        System.out.println("defult sorting prder "+i);
		Collections.sort(i, (a, b) -> a > b ? -1 : a < b ? -1 : 0);

		System.out.println("customize sorting order"+i);

		ArrayList<String>s=new ArrayList<String>();
		
		s.add("a");
		s.add("c");
		Collections.sort(s, (s1,s2)->-s1.compareTo(s2));
        System.out.println(s);  		
		
		ArrayList<Student> student =new ArrayList <Student>(); 
		student.add(new Student(1,"d"));
		student.add(new Student(2,"r"));
		student.add(new Student(5,"u"));
		student.add(new Student(8,"s"));
		student.add(new Student(4,"p"));
		System.out.println(student);
		Collections.sort(student,(s1,s2)->(s1.getEno()>s2.getEno())?1:(s1.getEno()<s2.getEno())?-1:0);
		System.out.println(student);
		
		
	}

}
class Student{
	
	private int eno;
	private String name;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public Student(int eno,String name){
		 this.setEno(eno);
		 this.name=name;
	}
	@Override
	public String toString() {
		return getEno()+" "+name;
		
		
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	
}