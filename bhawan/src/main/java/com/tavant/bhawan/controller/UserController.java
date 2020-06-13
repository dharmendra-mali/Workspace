package com.tavant.bhawan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tavant.bhawan.models.User;
import com.tavant.bhawan.service.UserService;

@RestController
@RequestMapping("/user_api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUser() {
		return userService.getAllUser();

	}

}
