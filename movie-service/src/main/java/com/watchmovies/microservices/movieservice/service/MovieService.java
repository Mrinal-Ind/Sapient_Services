package com.watchmovies.microservices.movieservice.service;

import java.util.List;

import com.watchmovies.microservices.movieservice.domain.Movie;

public interface MovieService {
	
	public Movie fetchMovieDetails(String movieDetails);
	public List<Movie> fetchMovie();
}
