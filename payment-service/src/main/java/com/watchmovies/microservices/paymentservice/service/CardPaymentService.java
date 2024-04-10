package com.watchmovies.microservices.paymentservice.service;

import com.watchmovies.microservices.paymentservice.domain.CreditCardPaymentDetails;

public interface CardPaymentService {
	
	 public CreditCardPaymentDetails  connectToPaymenGateway(CreditCardPaymentDetails details);

}
