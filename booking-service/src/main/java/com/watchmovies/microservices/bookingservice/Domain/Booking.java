package com.watchmovies.microservices.bookingservice.Domain;

import java.util.List;

public class Booking {
	
	
	private User user;
	private Theatre theatre;
	private Show show;
	private String bookingId;
	private String paymentId;
	private String paymentType; 
	private String cardIssuerBank;
	private String bankName;
	
	public String getCardIssuerBank() {
		return cardIssuerBank;
	}
	public void setCardIssuerBank(String cardIssuerBank) {
		this.cardIssuerBank = cardIssuerBank;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	private String showType;
	private List<Seat> seat;
	
	public String getShowType() {
		return showType;
	}
	public void setShowType(String showType) {
		this.showType = showType;
	}
	public String getBookingId() {
		return bookingId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public Show getShow() {
		return show;
	}
	public void setShow(Show show) {
		this.show = show;
	}
	public List<Seat> getSeat() {
		return seat;
	}
	public void setSeat(List<Seat> seat) {
		this.seat = seat;
	}

}
