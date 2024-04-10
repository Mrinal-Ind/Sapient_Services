package com.watchmovies.microservices.offerservice.domain;

public class OfferResponse {
	
	private int totalDisount;
	private String message;
	
	public int getTotalDisount() {
		return totalDisount;
	}
	public void setTotalDisount(int totalDisount) {
		this.totalDisount = totalDisount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
