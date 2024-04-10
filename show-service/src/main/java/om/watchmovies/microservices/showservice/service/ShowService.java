package om.watchmovies.microservices.showservice.service;

import java.util.List;

import om.watchmovies.microservices.showservice.Domain.ShowDetails;

public interface ShowService {
	
	public ShowDetails fetchShowDetailsOfMovies(String movieName);
	public boolean deleteShow( List<String> showId,  List<String> theatreId);
	

}
