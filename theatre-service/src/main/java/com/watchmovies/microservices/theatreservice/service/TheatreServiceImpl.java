package com.watchmovies.microservices.theatreservice.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchmovies.microservices.theatreservice.Repositrory.TheatreRepositoryImpl;
import com.watchmovies.microservices.theatreservice.domain.Theatre;

@Service
public class TheatreServiceImpl implements TheatreService {
	
	@Autowired
	TheatreRepositoryImpl theatreRepository;


	@Override
	public boolean deleteTheatre(String theatreId) {
		theatreRepository.deleteTheatre(theatreId);
		return false;
	}

	public Theatre saveTheatre(Theatre theatre) {
		// TODO Auto-generated method stub
		return null;
	}

}
