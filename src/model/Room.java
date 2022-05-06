package model;

public class Room {
    private int id;
    private String nameRoom;
    private String status;
    private int priceRoom;
    private int numberOfBedRoom;

    public Room() {
    }

    public Room(int id, String nameRoom, String status, int priceRoom, int numberOfBedRoom) {
        this.id = id;
        this.nameRoom = nameRoom;
        this.status = status;
        this.priceRoom = priceRoom;
        this.numberOfBedRoom = numberOfBedRoom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPriceRoom() {
        return priceRoom;
    }

    public void setPriceRoom(int priceRoom) {
        this.priceRoom = priceRoom;
    }

    public int getNumberOfBedRoom() {
        return numberOfBedRoom;
    }

    public void setNumberOfBedRoom(int numberOfBedRoom) {
        this.numberOfBedRoom = numberOfBedRoom;
    }

    @Override
    public String toString() {
        return
                  id +
                "," + nameRoom +
                "," + status +
                "," + priceRoom +
                "," + numberOfBedRoom ;
    }
}
