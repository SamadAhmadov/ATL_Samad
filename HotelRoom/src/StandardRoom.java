public class StandardRoom extends Room {

    private boolean isSingleBed;

    public StandardRoom(int roomNumber, double price, RoomType roomType) {
        super(roomNumber, price, roomType);
        this.isSingleBed=true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Room number: " + getRoomNumber() + ", room price: " + getPrice() + ", number of beds: " + (isSingleBed?"Single bed":" Double bed"));
    }
}
