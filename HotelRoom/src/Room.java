public class Room {
    private int roomNumber;
    private double price;
    private boolean isBooked;
    private RoomType roomType;

    public Room(int roomNumber, double price, RoomType roomType) {
        this.roomNumber = roomNumber;
        this.price = price;
        this.isBooked = true;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public void displayInfo() {

    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", price=" + price +
                ", isBooked=" + isBooked +
                '}';
    }

    public void reserve (){
        if(!isBooked){
            System.out.println("Room has already reserved");
        }else{
            isBooked=true;
            System.out.println(getRoomNumber() + " room is reserved");
        }
    }
    public void cancelReserve(){
        if(isBooked){
            System.out.println("Room is not reserved");
        }else {
            isBooked=true;
            System.out.println(getRoomNumber() + " room cancelation is done");
        }
    }
}