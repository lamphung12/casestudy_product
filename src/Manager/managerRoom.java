package Manager;

import Model.Room;

import java.util.ArrayList;
import java.util.List;

public class managerRoom implements General<Room> {
    private List<Room> roomList = new ArrayList<>();

    public managerRoom() {
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public void add(Room room) {

    }

    @Override
    public void edit(int id, Room room) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Room findById(int id) {
        return null;
    }

    @Override
    public void display() {

    }

    @Override
    public int findIndexById(int id) {
        return 0;
    }
}
