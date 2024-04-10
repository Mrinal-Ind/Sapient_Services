package com.watchmovies.microservices.bookingservice.Domain;

import java.math.BigDecimal;

public class OfferInfo {
	
	private int numberOfTickets;
	private BigDecimal totalPriceTickets;
	private String showtype;
	
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	
	public BigDecimal getTotalPriceTickets() {
		return totalPriceTickets;
	}
	public void setTotalPriceTickets(BigDecimal totalPriceTickets) {
		this.totalPriceTickets = totalPriceTickets;
	}
	public String getShowtype() {
		return showtype;
	}
	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}
	

}
