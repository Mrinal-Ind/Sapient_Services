package com.watchmovies.microservices.bookingservice.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchmovies.microservices.bookingservice.OfferProxy;
import com.watchmovies.microservices.bookingservice.Domain.Booking;
import com.watchmovies.microservices.bookingservice.Domain.BookingOffer;
import com.watchmovies.microservices.bookingservice.Domain.CreditCardPaymentDetails;
import com.watchmovies.microservices.bookingservice.Domain.NetBankingPaymentsDetails;
import com.watchmovies.microservices.bookingservice.Domain.OfferInfo;
import com.watchmovies.microservices.bookingservice.Domain.PaymentDetail;
import com.watchmovies.microservices.bookingservice.Domain.PaymentType;
import com.watchmovies.microservices.bookingservice.Domain.Seat;

//@Transactional
@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private OfferProxy offerProxy;
	@Autowired
	private PaymentProxy paymentProxy;

	@Override
	public Booking saveBooking(Booking booking) {
        OfferInfo offerInfo =  transformRequest(booking);
        Booking bookingResponse = booking;
        BookingOffer offerOnBooking = offerProxy.getOfferOnPrice(offerInfo);
        //changes to be included
	//Changes to test
        //changes to be decided
		//local changes to be included
		//local changes not to be included
	//Remote changes included
	//Remote changes not ro be included
        BigDecimal discount = offerOnBooking.getTotalDisount();
        BigDecimal totalPrice = totalPrice(booking);
        BigDecimal finalPricePostDiscount = totalPrice.subtract(discount);
        PaymentDetail paymentDetail = new PaymentDetail();
        paymentDetail.setAmount(finalPricePostDiscount);
        if(booking.getPaymentType().equals(PaymentType.CREDITCARD.name())) {
        	CreditCardPaymentDetails card = new CreditCardPaymentDetails();
        	card.setIssuerCardBank(booking.getCardIssuerBank());
        	PaymentDetail paymentResponse = callPaymentService(card);
        	if(paymentResponse.getStatus().equals("success")) {
        		//persist Booking to DB probably via Repository class and set bookingId received after persisting Booking to DB in bookingResponse
        		//bookingResponse.setBookingId();
        	}
        }
        if(booking.getPaymentType().equals(PaymentType.NETBANKING.name())) {
        	NetBankingPaymentsDetails banking = new NetBankingPaymentsDetails();
        	banking.setIssuerBankname(booking.getBankName());
        	PaymentDetail paymentResponse = callPaymentService(banking);
        	if(paymentResponse.getStatus().equals("success")) {
        		// persist Booking to DB probably via Repository class and set bookingId to Booking
        	}
        }
		return bookingResponse;
	}

	@Override
	public Booking getBookingDetails(String bookingId) {
		//call to DB with to fetch Details of BookingID 
		Booking bookingDetails = new Booking();
		return bookingDetails;
	}

	@Override
	public void deleteBooking(String bookingId) {
		//call to DB with to delete Details of Booking of BookingID 
	}

	private OfferInfo transformRequest(Booking booking) {
		OfferInfo offerIn = new OfferInfo();
		offerIn.setNumberOfTickets(booking.getSeat().size());
		offerIn.setShowtype(booking.getShowType());
		BigDecimal price = totalPrice(booking);
		offerIn.setTotalPriceTickets(price);
		return offerIn;
	}

	private BigDecimal totalPrice(Booking booking) {
		BigDecimal price = new BigDecimal("0");
		for (Seat seat : booking.getSeat()) {
			price = price.add(seat.getPrice());
		}
		return price;
	}

	private PaymentDetail callPaymentService(CreditCardPaymentDetails paymentDetails) {
		PaymentDetail paymentResult = paymentProxy.makePayment(paymentDetails);
		return paymentResult;
	}

	private PaymentDetail callPaymentService(NetBankingPaymentsDetails paymentDetails) {
		PaymentDetail paymentResult = paymentProxy.makePayment(paymentDetails);
		return paymentResult;
	}

}
