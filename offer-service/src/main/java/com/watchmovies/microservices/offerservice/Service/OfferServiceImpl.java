package com.watchmovies.microservices.offerservice.Service;

import com.watchmovies.microservices.offerservice.Domian.OfferConstants;
import com.watchmovies.microservices.offerservice.domain.OfferInfo;
import com.watchmovies.microservices.offerservice.domain.OfferResponse;
import com.watchmovies.microservices.offerservice.domain.ShowType;

public class OfferServiceImpl implements OfferService {


	// It is better to use a rule engine or a BPM for such scenarios
	public OfferResponse fetchOfferOnPrice(OfferInfo offerInfo) {
		OfferResponse offerResponse = new OfferResponse();
		int discountOnNumber = applyDiscountOnTotalTickets(offerInfo.getTotalPriceTickets(), offerInfo.getNumberOfTickets());
		int discoutOnShowType = appDiscoutOnShowType(offerInfo.getShowtype(), offerInfo.getTotalPriceTickets());
		int totalDiscount = discountOnNumber+ discoutOnShowType;
		offerResponse.setTotalDisount(totalDiscount);
		if(totalDiscount>0) {
		  offerResponse.setMessage(OfferConstants.DISCOUNT_MESSAGE);
		}
		return offerResponse;
	}

	private int applyDiscountOnTotalTickets(int totalPrice, int ticketCount) {
		if (ticketCount < 3) {
			return 0;
		} else {
			int eligibleTicketForDiscount = ticketCount / 3;
			int finalDiscount = (eligibleTicketForDiscount * totalPrice) * 50 / 100;
			return finalDiscount;
		}
	}

	private int appDiscoutOnShowType(String showType, int totalPrice) {
		int discountOnShow = 0;
		if (ShowType.AFTERNOON_SHOW.name().equals(showType)) {
			discountOnShow = (totalPrice * 20) / 100;
		}
		return discountOnShow;
	}

}
