package om.watchmovies.microservices.showservice.Repository;

import java.util.List;

import om.watchmovies.microservices.showservice.Domain.ShowDetails;

public interface ShowRepository {
	
	public ShowDetails fetchShowDetailsOfMovies(String movieName);
	public boolean deleteShow(List<String> showId, List<String> theatreId);

}
