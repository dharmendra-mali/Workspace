package com.company.spring.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.spring.demo.dto.UserDto;
import com.company.spring.demo.exception.AddressNotFoundException;
import com.company.spring.demo.exception.UserNotFoundException;
import com.company.spring.demo.models.Address;
import com.company.spring.demo.models.User;
import com.company.spring.demo.services.AddressService;
import com.company.spring.demo.services.UserService;

@RestController
@RequestMapping(value = "/api/v1/user")
public class UserRestController {

	@Autowired
	private UserService userService;

	@Autowired
	private AddressService addressService;

	@GetMapping
	public List<UserDto> getAllUser() {
		return userService.getAllUser();
	}

	@PostMapping
	public ResponseEntity<UserDto> createUsers(@RequestBody User user) {
		UserDto tempUser = userService.createUser(user);
		return new ResponseEntity<>(tempUser, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public UserDto getUserId(@PathVariable("id") long id) {
		return userService.getUserById(id);
	}

	@PutMapping("/{id}")
	public UserDto updateUser(@RequestBody User user, @PathVariable("id") long id) {

		User tempUser = userService.findOne(id);
		if (tempUser == null) {
			throw new UserNotFoundException("user id " + id + " is not found");
		}
		return userService.updateUser(user, tempUser.getUserId());
	}

	@DeleteMapping("/{id}")
	public UserDto deleteRecipe(@PathVariable("id") int id) {
		UserDto userTemp = userService.getUserById(id);
		userService.deleteUser(userTemp.getUserId());
		return userTemp;

	}

	@PostMapping("/{id}")
	public UserDto addAddress(@RequestBody Address address, @PathVariable("id") long id) {
		User tempUser = userService.findOne(id);
		if (tempUser == null) {
			throw new UserNotFoundException("user id " + id + " is not found");
		}
		tempUser.getAddressList().add(address);
		return userService.updateUser(tempUser, id);
	}

	@PutMapping("/{id}/{addId}")
	public UserDto updateAddress(@RequestBody Address address, @PathVariable("id") long id,
			@PathVariable("addId") long addId) {
		Address tempAdd;
		User tempUser = userService.findOne(id);
		if (tempUser == null) {
			throw new UserNotFoundException("user id " + id + " is not found");
		}
		List<Address> addressList = tempUser.getAddressList();

		try {
			tempAdd = addressList.stream().filter(add -> add.getAddId() == addId).findFirst().get();
		} catch (NoSuchElementException e) {
			tempAdd = null;
		}

		if (tempAdd == null) {
			throw new AddressNotFoundException("Address id " + addId + " not found");
		}
		addressList.remove(tempAdd);
		address.setAddId(tempAdd.getAddId());
		addressList.add(address);
		return userService.updateUser(tempUser, id);
	}

	@DeleteMapping("/{id}/{addId}")
	public UserDto deleteAddress(@PathVariable("id") long id, @PathVariable("addId") long addId) {
		Address tempAdd;
		User tempUser = userService.findOne(id);
		if (tempUser == null) {
			throw new UserNotFoundException("user id " + id + " is not found");
		}
		List<Address> addressList = tempUser.getAddressList();

		try {
			tempAdd = addressList.stream().filter(add -> add.getAddId() == addId).findFirst().get();
		} catch (NoSuchElementException e) {
			tempAdd = null;
		}
		if (tempAdd == null) {
			throw new AddressNotFoundException("Address id " + addId + " not found");
		}
		addressList.remove(tempAdd);
		addressService.deleteAddress(addId);
		return userService.updateUser(tempUser, id);
	}

//	@GetMapping("/{name}")
//	public User getUserByName(@PathVariable("name") String name) {
//
//		return userService.findByName(name);
//	}

}
