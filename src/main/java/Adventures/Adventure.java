package Adventures;

import Rooms.Room;

import java.util.ArrayList;

public class Adventure {
    private ArrayList<Room> adventureRooms;

    public Adventure(){
        this.adventureRooms = new ArrayList<>();
    }

    public int countRooms() {
       return this.adventureRooms.size();
    }

    public void addRoom(Room roomToAdd) {
        this.adventureRooms.add(roomToAdd);
    }
}
