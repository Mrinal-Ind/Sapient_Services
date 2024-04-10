package com.watchmovies.microservices.theatreservice.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.watchmovies.microservices.theatreservice.domain.Theatre;
import com.watchmovies.microservices.theatreservice.service.TheatreServiceImpl;

public class TheatreResource {

	
	TheatreServiceImpl theatreService;

	@PostMapping("/theatre")
	public ResponseEntity<Theatre> addTheatre(@RequestBody Theatre theatre) {
		Theatre theatreCreated = theatreService.saveTheatre(theatre);
		// URI path below will give path to get the ticket booking in header
		URI path = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(theatreCreated.getTheatreId()).toUri();
		return ResponseEntity.created(path).build();
	}

	@GetMapping("/theatre/{id}")
	public Theatre getTheatre(@PathVariable String id) {
		return null;
	}

	@DeleteMapping("/theatre")
	public ResponseEntity<Void> removeTheatre(@PathVariable String theatreId) {
		boolean isDeleted = theatreService.deleteTheatre(theatreId);
		if (isDeleted) {
			// Return a 204 and no Content response if deletion was successful
			return ResponseEntity.noContent().build();
		} else {
			// Return a 404 Not Found response if not successful
			return ResponseEntity.notFound().build();
		}
	}

	@GetMapping("/theatre")
	public List<Theatre> getTheatres(@RequestBody Theatre theatre) {
		return null;
	}

}
