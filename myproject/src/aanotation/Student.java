package aanotation;
@Course(cId ="j100",cName="java", cCost=300000)
public class Student {

	String sId;
	String sName;
	
	
	public Student(String sId,String sName) { 
	
		this.sId=sId;
		this.sName=sName;
		
	}
	public void getStudentDetails(){
		System.out.println();
		System.out.println("Student details");
		System.out.println("-----------------------");
		System.out.println("Student Id   "+   this.sId);
		System.out.println("Student Name "+  this.sName);
		
	}
	
}
