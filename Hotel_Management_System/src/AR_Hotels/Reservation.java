package AR_Hotels;

public class Reservation {
	private String reservation_type ;
	
	Reservation(String reservation_type){
		this.reservation_type = reservation_type ;
		
	}

	public String getReservation_type() {
		return reservation_type;
	}

	public void setReservation_type(String reservation_type) {
		this.reservation_type = reservation_type;
	}
	
	
}
