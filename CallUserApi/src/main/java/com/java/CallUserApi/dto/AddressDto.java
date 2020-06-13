package com.java.CallUserApi.dto;

public class AddressDto {

	private long addId;
	private String nameOfAddress;
	private String streetAddress;
	private String city;
	private String state;
	private String zipCode;

	public AddressDto() {
		// TODO Auto-generated constructor stub
	}

	public AddressDto(long addId, String nameOfAddress, String streetAddress, String city, String state,
			String zipCode) {
		this.addId = addId;
		this.nameOfAddress = nameOfAddress;
		this.streetAddress = streetAddress;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public long getAddId() {
		return addId;
	}

	public void setAddId(long addId) {
		this.addId = addId;
	}

	public String getNameOfAddress() {
		return nameOfAddress;
	}

	public void setNameOfAddress(String nameOfAddress) {
		this.nameOfAddress = nameOfAddress;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

}
