package com.watchmovies.microservices.paymentservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.watchmovies.microservices.paymentservice.domain.CreditCardPaymentDetails;
import com.watchmovies.microservices.paymentservice.domain.NetBankingPaymentsDetails;
import com.watchmovies.microservices.paymentservice.domain.PaymentDetails;

import com.watchmovies.microservices.paymentservice.service.CardPaymentServiceImpl;
import com.watchmovies.microservices.paymentservice.service.NetBankingServiceImpl;

@RestController
public class Payment {
	
	@Autowired
	CardPaymentServiceImpl cardService;
	@Autowired
	NetBankingServiceImpl netBankingService;

	@PostMapping("/payment/creditcard")
	public PaymentDetails makePayment(@RequestBody CreditCardPaymentDetails cardPaymentDet) {
	     // Payment gateway call logic
	  CreditCardPaymentDetails cardDet = cardService.connectToPaymenGateway(cardPaymentDet);
	  return cardDet;
	}

	@PostMapping("payment/netbanking")
	public PaymentDetails makePayment(@RequestBody NetBankingPaymentsDetails netbankingPaymentsDet) {
		// Payment gateway call logic 
		NetBankingPaymentsDetails netBankDet = netBankingService.connectToPaymenGateway(netbankingPaymentsDet);
		return netBankDet;
	}
	

}
