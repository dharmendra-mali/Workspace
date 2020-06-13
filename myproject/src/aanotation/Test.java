package aanotation;

import java.lang.annotation.Annotation;

public class Test {

	public static void main(String[] args)throws Exception {
		
		
		Student sVal=new Student("s001", "dev");
		sVal.getStudentDetails();
		
		Class classVal =sVal.getClass();
       Annotation ann=classVal.getAnnotation(Course.class);
       Course cr=(Course)ann;
       System.out.println("Student course details ");
       System.out.println("-----------------------");
       System.out.println("Student course id   "+ cr.cId());
       System.out.println("Student course Name "+cr.cName());
       System.out.println("Student course cost "+cr.cCost());

	}

}
