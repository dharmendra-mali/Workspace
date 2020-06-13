package com.company.spring.demo.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.company.spring.demo.dto.UserDto;
import com.company.spring.demo.models.User;

@Component
public class ConverterService {

	@Autowired
	private ModelMapper modelMapper;

	public UserDto convertToDto(User userObject) {

		return modelMapper.map(userObject, UserDto.class);
	}

	public User convertToUser(UserDto userObject) {

		return modelMapper.map(userObject, User.class);
	}
}
