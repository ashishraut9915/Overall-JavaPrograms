package Project;

public class Reservations extends Guests{

	String Room;
	String EventHall;
	boolean SpaServices = false ;
	
	public Reservations(String GuestsName, String GuestsLastName,int RoomNo,String Room, String EventHall,boolean SpaServices) {
		super(GuestsName,GuestsLastName,RoomNo);	
		this.Room = Room ;
		this.EventHall = EventHall ;
		this.SpaServices = SpaServices ;
	}
		
	
}
