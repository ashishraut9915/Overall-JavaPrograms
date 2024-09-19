package AR_Hotels;

public class Guest {

	private String name ;
	private Reservation reservition ;
	public Guest(String name, Reservation reservition) {
		//super();
		this.name = name;
		this.reservition = reservition;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getReservition() {
		return reservition;
	}
	public void setReservition(Reservation reservition) {
		this.reservition = reservition;
	}

	
	
	
	
}
