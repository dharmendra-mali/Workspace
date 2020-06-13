package com.tavant.scrum_board.models;

import javax.persistence.Embeddable;

@Embeddable
public class ToDoHelper {

	private String story;
	private String status;

	public String getStory() {
		return story;
	}

	public void setStory(String story) {
		this.story = story;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
