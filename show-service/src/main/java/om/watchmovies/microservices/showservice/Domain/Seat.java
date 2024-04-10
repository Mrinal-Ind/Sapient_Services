package om.watchmovies.microservices.showservice.Domain;

public class Seat {
	
	private String seatNumber;
	private String typeOfSeat;
	private String seatPrice;
	private String status;
	
	public String getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(String seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getTypeOfSeat() {
		return typeOfSeat;
	}
	public void setTypeOfSeat(String typeOfSeat) {
		this.typeOfSeat = typeOfSeat;
	}
	public String getSeatPrice() {
		return seatPrice;
	}
	public void setSeatPrice(String seatPrice) {
		this.seatPrice = seatPrice;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
