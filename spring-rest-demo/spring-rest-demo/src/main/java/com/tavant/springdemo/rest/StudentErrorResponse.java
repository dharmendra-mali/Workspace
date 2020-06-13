package com.tavant.springdemo.rest;

public class StudentErrorResponse {

	private int stasus;
	private String message;
	private long timeStamp;

	public int getStasus() {
		return stasus;
	}

	public void setStasus(int stasus) {
		this.stasus = stasus;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
