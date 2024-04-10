package om.watchmovies.microservices.showservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import om.watchmovies.microservices.showservice.Domain.ShowDetails;
import om.watchmovies.microservices.showservice.service.ShowServiceImpl;

@RestController
public class ShowResource {
	
	@Autowired
	ShowServiceImpl showService;
	
	
	@GetMapping("/showdetails")
	public ShowDetails getShowDetailsOfMovies(String movieName){
		return showService.fetchShowDetailsOfMovies(movieName);
	}
	
	@DeleteMapping("/showdetails")
	public ResponseEntity<Void> deleteShow( @RequestParam(required = false) List<String> showId, @RequestParam(required = false)  List<String> theatreId  ){
		boolean isDeleted = showService.deleteShow(showId,theatreId);
		if (isDeleted) {
            // Return a 204 and no Content response if deletion was successful
            return ResponseEntity.noContent().build();
        } else {
            // Return a 404 Not Found response if not successful
            return ResponseEntity.notFound().build();
        }
	}	
	
	
	

}
