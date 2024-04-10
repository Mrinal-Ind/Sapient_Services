package com.watchmovies.microservices.bookingservice.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.watchmovies.microservices.bookingservice.OfferProxy;
import com.watchmovies.microservices.bookingservice.Domain.Booking;
import com.watchmovies.microservices.bookingservice.service.BookingService;

@RestController
public class BookingResource {
	
	@Autowired
	private BookingService bookingService;
	
	@PostMapping("/booking")
	public ResponseEntity<Booking> bookTicket(@RequestBody Booking bookingRequest) {
		Booking bookedTiket = bookingService.saveBooking(bookingRequest);
		//URI path below will give path for the ticket booked link in the header and if there is no path in the header then booking not successful
		URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(bookedTiket.getBookingId()).toUri();
		return ResponseEntity.created(path).build();
	}
	
	@GetMapping("/booking/{id}")
	public Booking retrieveTicket(@PathVariable String id) {
		Booking booking = bookingService.getBookingDetails(id);
		return booking; 
	}

	@DeleteMapping("/booking/{id}")
	public void cancelTicket(@PathVariable String id) {
		bookingService.deleteBooking(id);
	}

}
