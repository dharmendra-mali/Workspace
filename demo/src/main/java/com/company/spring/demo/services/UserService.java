package com.company.spring.demo.services;

import java.util.List;

import com.company.spring.demo.dto.UserDto;
import com.company.spring.demo.models.User;

public interface UserService {

	public List<UserDto> getAllUser();

	public UserDto createUser(User user);

	public UserDto getUserById(long userId);

	public void deleteUser(long userId);

	public UserDto updateUser(User user, long userId);

	public User findOne(long id);
	
	public User findByName(String name);
}
