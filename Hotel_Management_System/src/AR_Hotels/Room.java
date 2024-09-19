package AR_Hotels;

import java.util.List;

public class Room {

	private int roomNumber;
	private int capacity ;
	private List<String> facilities ;
	protected boolean isAvailable ;
	public Room(int roomNumber, int capacity, List<String> facilities, boolean isAvailable) {
		//super();
		this.roomNumber = roomNumber;
		this.capacity = capacity;
		this.facilities = facilities;
		this.isAvailable = isAvailable;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public List<String> getFacilities() {
		return facilities;
	}
	public void setFacilities(List<String> facilities) {
		this.facilities = facilities;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public void bookRoom() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
