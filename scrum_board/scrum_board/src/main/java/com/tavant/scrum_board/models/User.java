package com.tavant.scrum_board.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity

@JsonIgnoreProperties({ "hibernateLazyIntitializer", "handler" })
public class User {

	@Id
	private String userId;
	private String userFirstName;
	private String userLastName;
	private String userEmail;
	private String password;
	private String userDesignation;
	private String userTeamName;

	

	public User() {

	}
	
	
	public User(String userId, String userFirstName, String userLastName, String userEmail, String password,
			String userDesignation, String userTeamName) {
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userEmail = userEmail;
		this.password = password;
		this.userDesignation = userDesignation;
		this.userTeamName = userTeamName;
	}


	public User(String designation) {
		this.userDesignation = designation;
	}

	public String getUserTeamName() {
		return userTeamName;
	}

	public void setUserTeamName(String userTeamName) {
		this.userTeamName = userTeamName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserDesignation() {
		return userDesignation;
	}

	public void setUserDesignation(String userDesignation) {
		this.userDesignation = userDesignation;
	}

}
