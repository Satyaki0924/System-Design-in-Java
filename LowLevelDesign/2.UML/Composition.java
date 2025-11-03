import java.util.ArrayList;
import java.util.List;

class Hotel {
    private String name;
    private String address;
    private List<Room> rooms;
    private int roomCount;
    Hotel(String name, String address) {
        this.name = name;
        this.address = address;
        rooms = new ArrayList<Room>();
        roomCount = 0;
    }

    public int addRoom() {
        Room room = new Room(++roomCount);
        rooms.add(room);
        return room.getRoomNumber();
    }

    public void showRooms() {
        System.err.println("Showing Rooms");
        for(Room room : rooms) {
            System.err.println("Room number: " + room.getRoomNumber());
        }
    }

    public void demolishRoom(int roomNumber) {
        for(Room room: rooms) {
            if (room.getRoomNumber() == roomNumber) {
                System.err.println("Demolished roomNumber: " + room.getRoomNumber());
                rooms.remove(room);
                break;
            }
        }
    }
    
    private class Room {
        private int number;
        Room(int number){
            this.number = number;
        }
        protected int getRoomNumber() {
            return this.number;
        }
    }
}

public class Composition {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Grand Oberoi", "15, Lindsay Road");
        hotel.addRoom();
        hotel.addRoom();
        int roomToDemolish = hotel.addRoom();
        hotel.addRoom();
        hotel.addRoom();
        hotel.addRoom();
        hotel.addRoom();

        hotel.demolishRoom(roomToDemolish);

        hotel.showRooms();
    }
}
