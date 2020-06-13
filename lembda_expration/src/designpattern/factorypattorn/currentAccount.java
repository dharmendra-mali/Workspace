package designpattern.factorypattorn;

public class currentAccount implements Account {

	@Override
	public void deposite() {
		System.out.println("current Account deposite");

	}

	@Override
	public void credit() {
		System.out.println("current Account credit");

	}

}
