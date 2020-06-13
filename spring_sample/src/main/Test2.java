package main;

public class Test2 {
	private final int num=10;
	
	private Test2()
	{
		
		System.out.println(num);
		System.out.println("private const....");
	}
	
	public void getNum()
	{
		System.out.println(this.num);
	}

}
