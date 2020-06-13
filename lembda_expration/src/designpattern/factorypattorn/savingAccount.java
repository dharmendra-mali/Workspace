package designpattern.factorypattorn;

public class savingAccount implements Account {

	@Override
	public void deposite() {
		System.out.println("saving Account deposite");

	}

	@Override
	public void credit() {
		System.out.println("saving Account creadit");

	}

}
