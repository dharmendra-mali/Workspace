package com.tavant.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
  
@JsonIgnoreProperties(ignoreUnknown=true)
public class Driver {

	public static void main(String[] args) {

		try{
			
			ObjectMapper mapper =new ObjectMapper();
			
			Student student = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println("First name: "+student.getFirstName());
			System.out.println("Last name: "+student.getLastName());
			
			Address address =student.getAddress();
			
			System.out.println("street :"+address.getStreet());
			System.out.println("city :"+address.getCity());
			
			for(String lag:student.getLanguages() ){
				
				System.out.println("language :"+lag);
				
			}
			
		}catch (Exception exc) {
			
			exc.printStackTrace();
			
		}
		
		
		
		
		
		
	}

}
