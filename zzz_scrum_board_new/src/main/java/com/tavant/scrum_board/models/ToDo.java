package com.tavant.scrum_board.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({ "hibernateLazyIntitializer", "handler" })
public class ToDo {

	@Id
	private String userId;
	private String[] story;
	private String[] status;

	public ToDo() {

	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String[] getStory() {
		return story;
	}

	public void setStory(String[] story) {
		this.story = story;
	}

	public String[] getStatus() {
		return status;
	}

	public void setStatus(String[] status) {
		this.status = status;
	}

}
