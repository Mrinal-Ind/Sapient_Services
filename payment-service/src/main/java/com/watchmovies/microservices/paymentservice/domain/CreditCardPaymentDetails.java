package com.watchmovies.microservices.paymentservice.domain;

public class CreditCardPaymentDetails extends PaymentDetails {
	
	private String issuerCardBank;

	public String getIssuerCardBank() {
		return issuerCardBank;
	}

	public void setIssuerCardBank(String issuerCardBank) {
		this.issuerCardBank = issuerCardBank;
	}

}
