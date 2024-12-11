public class SuiteRoom extends StandardRoom {

    public boolean hasKitchen;

    public SuiteRoom(int roomNumber, double price, RoomType roomType) {
        super(roomNumber, price, roomType);
        this.hasKitchen=true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Room number: " + getRoomNumber() + ", room price: " + getPrice() + ", kitchen availability: " + (hasKitchen?"Kitchen is present":"Kitchen is absent"));
    }
}
