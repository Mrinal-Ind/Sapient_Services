package com.watchmovies.microservices.bookingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;

import com.watchmovies.microservices.bookingservice.Domain.BookingOffer;
import com.watchmovies.microservices.bookingservice.Domain.OfferInfo;


//Note: No naming server/discovery server is being used

@FeignClient(name="offer-service", url="localhost:8083")
public interface OfferProxy {
	
	public BookingOffer getOfferOnPrice(@RequestBody OfferInfo offerInfo);
	

}
