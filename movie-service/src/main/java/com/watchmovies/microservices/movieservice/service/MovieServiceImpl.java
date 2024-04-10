package com.watchmovies.microservices.movieservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.watchmovies.microservices.movieservice.domain.Movie;
import com.watchmovies.microservices.movieservice.repository.MovieRepositoryImpl;

@Service
public class MovieServiceImpl implements MovieService{
	
	@Autowired
	MovieRepositoryImpl movieRepo;
	
	

	@Override
	public Movie fetchMovieDetails(String movieId) {
		//here a service call can also be made or a DB call could be done
		return movieRepo.fetchMovieDetails(movieId);
	}

	@Override
	public List<Movie> fetchMovie() {
		// here a service call can also be made or a DB call could be done 
		return movieRepo.fetchMovie();
	}

}
