package functional_interface;

public class CustomFunctionalInterface {

	
	
	public static void main(String[] args) {
		CustomInterface i,j ;
		CustomInterface1 o;
		i=(a,b)->{
			System.out.println("sum of two number "+(a+b));
		};
		j=(a,b)->{
			System.out.println("product of two number "+(a*b));
		};
		o=(a,b)->{
			return a+b;
			
		};
		i.methodOne(3,8);
		j.methodOne(2, 6);
	    System.out.println("next sum of two number "+o.methodOne(1, 3));
	}	
}
@FunctionalInterface
interface CustomInterface{
	public abstract void methodOne(int a ,int b);
}
@FunctionalInterface
interface CustomInterface1{
	public abstract int methodOne(int a ,int b);
}