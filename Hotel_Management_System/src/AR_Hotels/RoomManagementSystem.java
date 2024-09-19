package AR_Hotels;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class RoomManagementSystem {
    private List<Room> rooms;
    private List<Guest> guests;
    private Map<Integer, Reservation> reservations;

    public RoomManagementSystem() {
        rooms = new ArrayList<>();
        guests = new ArrayList<>();
        reservations = new HashMap<>();
        initializeRooms();
    }

    private void initializeRooms() {
        rooms.add(new StandardRoom(101));
        rooms.add(new DeluxeRoom(201));
        rooms.add(new Suite(301));
    }

    public boolean checkRoomAvailability(int roomNumber) throws RoomNotFoundException {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room.isAvailable();
            }
        }
        throw new RoomNotFoundException("Room " + roomNumber + " not found.");
    }

    public String makeReservation(String guestName, int roomNumber, String reservationType)
            throws InvalidReservationException, RoomNotFoundException {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                if (room.isAvailable()) {
                    Reservation reservation = new Reservation(reservationType);
                    room.bookRoom();
                    
                    reservations.put(roomNumber, reservation);
                    guests.add(new Guest(guestName, reservation));
                    return "Reservation successful for " + guestName + ".";
                } else {
                    throw new InvalidReservationException("Room is already booked.");
                }
            }
        }
        throw new RoomNotFoundException("Room " + roomNumber + " not found.");
    }
}


