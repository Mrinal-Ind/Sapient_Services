package com.watchmovies.microservices.paymentservice.service;

import org.springframework.stereotype.Service;

import com.watchmovies.microservices.paymentservice.domain.CreditCardPaymentDetails;

@Service
public class CardPaymentServiceImpl implements CardPaymentService {

	@Override
	public CreditCardPaymentDetails connectToPaymenGateway(CreditCardPaymentDetails details) {
		// code to connect to gateway
		CreditCardPaymentDetails creditCardPaymentDetails = new CreditCardPaymentDetails();
		creditCardPaymentDetails.setPaymentId("aqsss");
		return creditCardPaymentDetails;
	}

}
