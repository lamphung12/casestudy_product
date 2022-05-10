package manager;

import filecsv.FileRoom;
import model.Room;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class managerRoom implements General<Room> {
    private List<Room> roomList = new ArrayList<>();

    public managerRoom() throws FileNotFoundException {
        roomList = FileRoom.readFromFile();
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    @Override
    public void add(Room room) {
        roomList.add(room);

    }

    @Override
    public void edit(int id, Room room) {
        roomList.set(findIndexById(id), room);
    }

    @Override
    public void delete(int id) {
        roomList.remove(findIndexById(id));
    }

    @Override
    public Room findById(int id) {
        return roomList.get(findIndexById(id));
    }

    @Override
    public void display() {
        for (int i = 0; i < roomList.size() ; i++) {
            System.out.println(roomList.get(i));
        }
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < roomList.size(); i++) {
            if (roomList.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

     public void displayPrice(int price){
         for (int i = 0; i <roomList.size() ; i++) {
             if (roomList.get(i).getPriceRoom()==price){
                 System.out.println(roomList.get(i));
             }
         }
     }

     public void displayNumberBedRoom(int number){
         for (int i = 0; i <roomList.size() ; i++) {
             if (roomList.get(i).getNumberOfBedRoom()==number){
                 System.out.println(roomList.get(i));
             }
         }
     }

     public void status(int id){
        int index= findIndexById(id);
        if(index==-1){
            System.out.println("Ko co ");
        }else{
            roomList.get(index).setStatus("Het phong");
        }
     }

     public void printRoomCon(String  c){
         for (int i = 0; i <roomList.size() ; i++) {
             if (roomList.get(i).getStatus().contains("c")){
                 System.out.println(roomList.get(i));
             }
         }
     }

}
