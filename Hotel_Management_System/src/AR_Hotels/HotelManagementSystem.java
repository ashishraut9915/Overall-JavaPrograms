package AR_Hotels;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotelManagementSystem {
    public static void main(String[] args) {
        RoomManagementSystem hotelSystem = new RoomManagementSystem();

        // Sample usage
        try {
            boolean availability = hotelSystem.checkRoomAvailability(101);
            System.out.println("Room 101 is " + (availability ? "available" : "not available"));

            String reservationResult = hotelSystem.makeReservation("John Doe", 101, "Standard");
            System.out.println(reservationResult);
        } catch (RoomNotFoundException | InvalidReservationException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}