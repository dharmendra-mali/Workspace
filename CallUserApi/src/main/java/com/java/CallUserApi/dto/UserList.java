package com.java.CallUserApi.dto;

import java.util.ArrayList;
import java.util.List;

public class UserList {

	private List<UserDto> users;

	public UserList() {
		users = new ArrayList<>();

	}

	public UserList(List<UserDto> users) {
		this.users = users;
	}

	public List<UserDto> getUsers() {
		return users;
	}

	public void setUsers(List<UserDto> users) {
		this.users = users;
	}

}
