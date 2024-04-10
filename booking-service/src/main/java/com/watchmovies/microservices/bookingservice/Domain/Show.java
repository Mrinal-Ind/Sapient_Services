package com.watchmovies.microservices.bookingservice.Domain;

import java.util.Date;

public class Show {
	
	private int ShowId;
	private Movie movie;
	private Date movieStartTime;
	private Date movieEndTime;
	private Theatre theatre;
	private Seat seat[][];

	
	public int getShowId() {
		return ShowId;
	}
	public void setShowId(int showId) {
		ShowId = showId;
	}
	public Movie getMovie() {
		return movie;
	}
	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	public Date getMovieStartTime() {
		return movieStartTime;
	}
	public void setMovieStartTime(Date movieStartTime) {
		this.movieStartTime = movieStartTime;
	}
	public Date getMovieEndTime() {
		return movieEndTime;
	}
	public void setMovieEndTime(Date movieEndTime) {
		this.movieEndTime = movieEndTime;
	}
	public Theatre getTheatre() {
		return theatre;
	}
	public void setTheatre(Theatre theatre) {
		this.theatre = theatre;
	}
	public Seat[][] getSeat() {
		return seat;
	}
	public void setSeat(Seat[][] seat) {
		this.seat = seat;
	}

}
