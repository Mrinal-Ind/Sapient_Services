package com.watchmovies.microservices.bookingservice.Domain;

import java.math.BigDecimal;

public class Seat {
	
	private String seatID;
	private BigDecimal  price;
	
	public String getSeatID() {
		return seatID;
	}
	public void setSeatID(String seatID) {
		this.seatID = seatID;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	
	

}
