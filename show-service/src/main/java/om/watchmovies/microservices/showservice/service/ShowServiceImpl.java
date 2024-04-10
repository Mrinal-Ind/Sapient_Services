package om.watchmovies.microservices.showservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import om.watchmovies.microservices.showservice.Domain.ShowDetails;
import om.watchmovies.microservices.showservice.Repository.ShowRepositoryImpl;
import java.util.List;
@Service
public class ShowServiceImpl implements ShowService{
 
	@Autowired
	ShowRepositoryImpl showRepo;
	
	public ShowDetails fetchShowDetailsOfMovies(String movieName) {
		ShowDetails showDetails = showRepo.fetchShowDetailsOfMovies(movieName);
		return showDetails;
	}

	public boolean deleteShow(List<String> showId,  List<String> theatreId) {
		return showRepo.deleteShow(showId,theatreId);
	}

}
