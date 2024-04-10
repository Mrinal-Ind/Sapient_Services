package com.watchmovies.microservices.bookingservice.service;

import com.watchmovies.microservices.bookingservice.Domain.Booking;

public interface BookingService {
	
	public Booking saveBooking(Booking booking);
	public Booking getBookingDetails(String bookingId);
	public void deleteBooking(String bookingId);

}
