package com.watchmovies.microservices.bookingservice.Domain;

import java.math.BigDecimal;

public class BookingOffer {
	
	private BigDecimal totalDisount;
	private String message;
	
	
	public BigDecimal getTotalDisount() {
		return totalDisount;
	}
	public void setTotalDisount(BigDecimal totalDisount) {
		this.totalDisount = totalDisount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

}
