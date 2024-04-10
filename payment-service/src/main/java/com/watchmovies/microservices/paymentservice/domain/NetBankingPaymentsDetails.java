package com.watchmovies.microservices.paymentservice.domain;

public class NetBankingPaymentsDetails extends PaymentDetails {
	
	private String issuerBankname;

	public String getIssuerBankname() {
		return issuerBankname;
	}

	public void setIssuerBankname(String issuerBankname) {
		this.issuerBankname = issuerBankname;
	}
	
	

}
