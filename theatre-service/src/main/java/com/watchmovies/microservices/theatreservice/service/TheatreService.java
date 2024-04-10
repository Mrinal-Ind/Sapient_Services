package com.watchmovies.microservices.theatreservice.service;

import com.watchmovies.microservices.theatreservice.domain.Theatre;

public interface TheatreService {

	public boolean deleteTheatre(String theatreId);
	public Theatre saveTheatre(Theatre theatre);
}
