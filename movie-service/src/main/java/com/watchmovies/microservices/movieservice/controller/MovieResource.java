package com.watchmovies.microservices.movieservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.watchmovies.microservices.movieservice.domain.Movie;
import com.watchmovies.microservices.movieservice.service.MovieServiceImpl;

@RestController
public class MovieResource {
	
	
	@Autowired
	MovieServiceImpl movieService;
	
	
	@GetMapping("/movie")
	public Movie getMovieDetails(String movieId){
		Movie movieDetails = movieService.fetchMovieDetails(movieId);
		return movieDetails;
	}
	
	@GetMapping("/movies")
	public List<Movie> getMovies(String city){
		List<Movie> movieDetails = movieService.fetchMovie();
		return movieDetails;
	}
	
	


}
