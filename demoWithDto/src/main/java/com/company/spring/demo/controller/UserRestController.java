package com.company.spring.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.spring.demo.models.User;
import com.company.spring.demo.services.UserService;

@RestController
@RequestMapping("/api/v1/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAllUser() {
		List<User> userList = userService.getAllUser();
		return userList;
	}

	@PostMapping
	public ResponseEntity<Object> createUsers(@RequestBody User user) {
		System.out.println("in post method");
		userService.createUser(user);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

}
