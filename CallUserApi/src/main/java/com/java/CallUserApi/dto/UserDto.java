package com.java.CallUserApi.dto;

import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
@JsonDeserialize
public class UserDto {

	private long userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private List<AddressDto> addressList;

	public UserDto() {
		// TODO Auto-generated constructor stub
	}

	public UserDto(long userId, String userFirstName, String userLastName, String userEmail,
			List<AddressDto> addressList) {
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.addressList = addressList;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<AddressDto> getAddressList() {
		return addressList;
	}

	public void setAddressList(List<AddressDto> addressList) {
		this.addressList = addressList;
	}
}
