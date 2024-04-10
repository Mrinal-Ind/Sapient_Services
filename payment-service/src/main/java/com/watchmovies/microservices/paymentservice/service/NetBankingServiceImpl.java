package com.watchmovies.microservices.paymentservice.service;

import com.watchmovies.microservices.paymentservice.domain.NetBankingPaymentsDetails;

public class NetBankingServiceImpl implements NetBankingService {

	@Override
	public NetBankingPaymentsDetails connectToPaymenGateway(NetBankingPaymentsDetails details) {
		// TODO Auto-generated method stub
		NetBankingPaymentsDetails NetBankingPaymentDet = new NetBankingPaymentsDetails();
		NetBankingPaymentDet.setPaymentId("aqsss");
		return NetBankingPaymentDet;
	}

}
