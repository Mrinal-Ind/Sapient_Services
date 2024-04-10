package om.watchmovies.microservices.showservice.Domain;

import java.util.List;

public class ShowDetails {
	
	private String theatreID;
	private List<Show> shows;
	private String message;
	
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getTheatreID() {
		return theatreID;
	}
	public void setTheatreID(String theatreID) {
		this.theatreID = theatreID;
	}
	public List<Show> getShows() {
		return shows;
	}
	public void setShows(List<Show> shows) {
		this.shows = shows;
	}
	
}
