package main;

import org.springframework.stereotype.Component;

@Component("myCricketCoach")
public class CricketCoach implements Coach {

	@Override
	public String getWorkOut() {
		// TODO Auto-generated method stub
		return "140 kmp boling";
	}

}
