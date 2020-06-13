package withoutnewkeyword;

public class MeClass implements Cloneable{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MeClass(int id) {
		this.id = id;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	

}
