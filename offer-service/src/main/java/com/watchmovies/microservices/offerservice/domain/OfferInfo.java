package com.watchmovies.microservices.offerservice.domain;

public class OfferInfo {
	
	private int numberOfTickets;
	private int totalPriceTickets;
	private String showtype;
	
	public int getNumberOfTickets() {
		return numberOfTickets;
	}
	public void setNumberOfTickets(int numberOfTickets) {
		this.numberOfTickets = numberOfTickets;
	}
	public int getTotalPriceTickets() {
		return totalPriceTickets;
	}
	public void setTotalPriceTickets(int totalPriceTickets) {
		this.totalPriceTickets = totalPriceTickets;
	}
	public String getShowtype() {
		return showtype;
	}
	public void setShowtype(String showtype) {
		this.showtype = showtype;
	}
	
	
	

}
