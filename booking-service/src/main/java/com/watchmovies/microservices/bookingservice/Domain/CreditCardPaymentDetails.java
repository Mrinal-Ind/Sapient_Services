package com.watchmovies.microservices.bookingservice.Domain;


public class CreditCardPaymentDetails extends PaymentDetail {
	
	private String issuerCardBank;

	public String getIssuerCardBank() {
		return issuerCardBank;
	}

	public void setIssuerCardBank(String issuerCardBank) {
		this.issuerCardBank = issuerCardBank;
	}
	

}
