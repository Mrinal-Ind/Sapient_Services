package com.watchmovies.microservices.movieservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.watchmovies.microservices.movieservice.domain.Movie;

@Repository
public class MovieRepositoryImpl implements MovieRepository {

	@Override
	public Movie fetchMovieDetails(String movieDetails) {
		Movie movie = new Movie();
		return movie;
	}

	@Override
	public List<Movie> fetchMovie() {
		List<Movie> movieList = new ArrayList<>();
		Movie movie = new Movie();
		movieList.add(movie);
		return movieList;
	}

}
