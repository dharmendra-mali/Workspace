package com.java.CallUserApi.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.java.CallUserApi.dto.UserDto;
import com.java.CallUserApi.service.UserServiceProxy;

@RestController
@RequestMapping("/api/v1/uservice")
public class CallUserService {

	@Autowired
	private UserServiceProxy userServiceProxy;

	@GetMapping
	public List<UserDto> getUser() {

		ResponseEntity<UserDto[]> obj = new RestTemplate().getForEntity("http://localhost:8080//api/v1/user",
				UserDto[].class);

		UserDto[] users = obj.getBody();
		List<UserDto> usersList = Arrays.asList(users);

		return usersList;
		
	}

	@GetMapping("/feign")
	public List<UserDto> getUserFeign() {

		
		List<UserDto> usersList = userServiceProxy.getAllUser();

		return usersList;
	}

}
