package com.watchmovies.microservices.offerservice.Service;

import com.watchmovies.microservices.offerservice.domain.OfferInfo;
import com.watchmovies.microservices.offerservice.domain.OfferResponse;

public interface OfferService {
	
	public OfferResponse fetchOfferOnPrice(OfferInfo offerInfo);
	
	

}
