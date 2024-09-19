package AR_Hotels;

import java.util.List;

public class DeluxeRoom extends Room {
    public DeluxeRoom(int roomNumber) {
        super(roomNumber, 4, List.of("TV", "Wi-Fi", "Minibar"), isAvailable);
    }
}
