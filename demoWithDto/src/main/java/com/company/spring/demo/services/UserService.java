package com.company.spring.demo.services;

import java.util.List;

import com.company.spring.demo.models.User;

public interface UserService {

	public List<User> getAllUser();

	public void createUser(User user);

	public User getUserById(long userId);

	public void deleteUser(long userId);

	public void updateUser(User user, long userId);
}
