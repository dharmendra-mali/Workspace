package AnonamusInnerClass;

public class MyClass {

	public static void main(String[] args) {
    String s = new String("java india");
    
   String s1= s.substring(0, 4);
   String s2="java" ;
		
		
		System.out.println(s1==s2);
	}

}

class st {
	private int i;
	private String n;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public st(int i, String n) {
		this.i = i;
		this.n = n;
	}
 
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i;
		result = prime * result + ((n == null) ? 0 : n.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		st other = (st) obj;
		if (i != other.i)
			return false;
		if (n == null) {
			if (other.n != null)
				return false;
		} else if (!n.equals(other.n))
			return false;
		return true;
	}

	st() {

	}

}