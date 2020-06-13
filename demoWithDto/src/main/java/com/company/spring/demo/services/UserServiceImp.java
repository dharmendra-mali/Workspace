package com.company.spring.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.spring.demo.doa.UserRepositories;
import com.company.spring.demo.models.User;

@Service
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepositories userRepositories;

	public List<User> getAllUser() {
		return userRepositories.findAll();
	}

	public void createUser(User user) {
		userRepositories.save(user);
	}

	public User getUserById(long userId) {

		return userRepositories.findById(userId).get();

	}

	public void deleteUser(long userId) {
		userRepositories.deleteById(userId);

	}

	public void updateUser(User user, long userId) {
		user.setUserId(userId);
		userRepositories.save(user);

	}
}
