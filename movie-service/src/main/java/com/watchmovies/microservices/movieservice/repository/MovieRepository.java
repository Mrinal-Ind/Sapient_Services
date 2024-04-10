package com.watchmovies.microservices.movieservice.repository;

import java.util.List;

import com.watchmovies.microservices.movieservice.domain.Movie;

public interface MovieRepository {
	
	public Movie fetchMovieDetails(String movieDetails);
	public List<Movie> fetchMovie();
	
	

}
