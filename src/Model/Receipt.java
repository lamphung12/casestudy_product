package Model;

public class Receipt {
    private int startTime;
    private int endTime;
    private String rentalAgentName;
    private Room room;
    private int totalRent;

    public Receipt() {
    }

    public Receipt(int startTime, int endTime, String rentalAgentName, Room room, int totalRent) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.rentalAgentName = rentalAgentName;
        this.room = room;
        this.totalRent = totalRent;
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
        return "Receipt: " +
                "," + startTime +
                "," + endTime +
                "," + rentalAgentName +
                "," + room.getId() +
                "," + totalRent;
    }
}
