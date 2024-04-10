package com.watchmovies.microservices.offerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.watchmovies.microservices.offerservice.Service.OfferServiceImpl;
import com.watchmovies.microservices.offerservice.domain.OfferInfo;
import com.watchmovies.microservices.offerservice.domain.OfferResponse;

@RestController
public class Offer {
	
	@Autowired
	OfferServiceImpl offerService;
	
	@GetMapping("/offer")
	public OfferResponse getOfferOnPrice(@RequestBody OfferInfo offerInfo) {
		OfferResponse offerResponse = offerService.fetchOfferOnPrice(offerInfo);
		return offerResponse;
	}

}
