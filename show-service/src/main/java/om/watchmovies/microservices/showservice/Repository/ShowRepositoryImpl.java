package om.watchmovies.microservices.showservice.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import om.watchmovies.microservices.showservice.Domain.ShowDetails;

@Repository
public class ShowRepositoryImpl implements ShowRepository{

	public ShowDetails fetchShowDetailsOfMovies(String movieName) {
		ShowDetails showDetails = new ShowDetails();
		//Query to get Details/ JPA can also be used
		return showDetails;
	}

	public boolean deleteShow(List<String> showId, List<String> theatreId) {
		boolean isDeleted = false;
		if(showId==null) {
			//delete rows where theatre_id = theatreId
		}
		else if(theatreId==null) {
			//delete rows where theatre_id = theatreId. 
			
		}
		else {
		} 
		return isDeleted ;
	}

}
