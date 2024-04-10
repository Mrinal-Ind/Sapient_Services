package com.watchmovies.microservices.bookingservice.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import com.watchmovies.microservices.bookingservice.Domain.CreditCardPaymentDetails;
import com.watchmovies.microservices.bookingservice.Domain.NetBankingPaymentsDetails;
import com.watchmovies.microservices.bookingservice.Domain.PaymentDetail;

@FeignClient(name="payment-service", url="lochost:8081")
public interface PaymentProxy {
	
	  public PaymentDetail makePayment(@RequestBody CreditCardPaymentDetails cardPaymentDet);
	  public PaymentDetail makePayment(@RequestBody NetBankingPaymentsDetails netbankingPaymentsDet);
	 
}
