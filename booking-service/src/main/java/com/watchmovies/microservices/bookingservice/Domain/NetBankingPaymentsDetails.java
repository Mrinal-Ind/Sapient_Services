package com.watchmovies.microservices.bookingservice.Domain;

public class NetBankingPaymentsDetails extends PaymentDetail{
	
	private String issuerBankname;

	public String getIssuerBankname() {
		return issuerBankname;
	}

	public void setIssuerBankname(String issuerBankname) {
		this.issuerBankname = issuerBankname;
	}


}
