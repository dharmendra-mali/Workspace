package main;

public class Emp {
	private String name;
	private String email;
    private EmpCode empCode;
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public void hello() {

		System.out.println("hello my "+name+"your email is "+email+" "+empCode.getEmpCode());
	}



	public EmpCode getEmpCode() {
		return empCode;
	}



	public void setEmpCode(EmpCode empCode) {
		this.empCode = empCode;
	}

}
