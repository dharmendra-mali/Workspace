package com.tavant.bhawan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tavant.bhawan.models.User;
import com.tavant.bhawan.repositories.UserRepositories;

@Service
public class UserService {

	@Autowired
	private UserRepositories userRepositories;

	public List<User> getAllUser() {
		return userRepositories.findAll();
	}

}
