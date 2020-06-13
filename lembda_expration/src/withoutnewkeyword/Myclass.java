package withoutnewkeyword;

public class Myclass implements Cloneable{
	
	private int MyId;
	private MeClass meClass;
	
	
	public Myclass(int myId, MeClass meClass) {
		MyId = myId;
		this.meClass = meClass;
	}

	public MeClass getMeClass() {
		return meClass;
	}

	public void setMeClass(MeClass meClass) {
		this.meClass = meClass;
	}

	public int getMyId() {
		return MyId;
	}

	public void setMyId(int myId) {
		MyId = myId;
	}

	public Myclass() {
		System.out.println("constructor is called");
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
}
