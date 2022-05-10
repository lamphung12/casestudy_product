package model;

public class Receipt {
    private int id;
    private int startTime;
    private int endTime;
    private String rentalAgentName;
    private Room room;
    private int totalRent;


    public Receipt(int id,int startTime, int endTime, String rentalAgentName, Room room) {
        this.id=id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.rentalAgentName = rentalAgentName;
        this.room = room;
        this.totalRent=(endTime-startTime)*room.getPriceRoom();
    }

    public Receipt() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getRentalAgentName() {
        return rentalAgentName;
    }

    public void setRentalAgentName(String rentalAgentName) {
        this.rentalAgentName = rentalAgentName;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getTotalRent() {
        return totalRent;
    }

    public void setTotalRent(int totalRent) {
        this.totalRent = totalRent;
    }

    @Override
    public String toString() {
        return "Receipt: " +id+
                "," + "startTime"+ startTime +
                "," + "endTime"+endTime +
                "," + "rentalAgentName"+ rentalAgentName +
                "," + "idRoom" +room.getId() +
                "," + "totalPrice" +totalRent;
    }
}
