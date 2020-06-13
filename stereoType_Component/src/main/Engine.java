package main;

import org.springframework.stereotype.Component;

@Component
public class Engine {

	private String modleNo;

	

	public void setModleNo(String modleNo) {
		this.modleNo = modleNo;
	}

	public String getModleNo() {
		
		return modleNo;
	}
	
	
	
}
