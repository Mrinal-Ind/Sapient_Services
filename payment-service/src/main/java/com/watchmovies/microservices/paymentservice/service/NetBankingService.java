package com.watchmovies.microservices.paymentservice.service;

import com.watchmovies.microservices.paymentservice.domain.CreditCardPaymentDetails;
import com.watchmovies.microservices.paymentservice.domain.NetBankingPaymentsDetails;

public interface NetBankingService {
	public NetBankingPaymentsDetails  connectToPaymenGateway(NetBankingPaymentsDetails details);


}
