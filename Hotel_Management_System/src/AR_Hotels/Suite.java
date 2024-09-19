package AR_Hotels;

class Suite extends Room {
    public Suite(int roomNumber) {
        super(roomNumber, 6, List.of("TV", "Wi-Fi", "Minibar", "Jacuzzi"));
    }
}
