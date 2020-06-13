package com.company.spring.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.spring.demo.models.Address;
import com.company.spring.demo.repositories.AddressRepositories;

@Service
public class AddressService {

	@Autowired
	private AddressRepositories addressRepositories;

	public Address findOne(long id) {
		return addressRepositories.findById(id).orElse(null);
	}
	
	public void deleteAddress(long id){
		addressRepositories.deleteById(id);
	}
}
