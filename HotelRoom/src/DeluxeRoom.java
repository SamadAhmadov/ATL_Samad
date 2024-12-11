public class DeluxeRoom extends Room{

    private boolean hasBalcony;

    public DeluxeRoom(int roomNumber, double price, RoomType roomType) {
        super(roomNumber, price, roomType);
        this.hasBalcony=true;
    }

    @Override
    public void displayInfo() {
        System.out.println("Room number: " + getRoomNumber() + ", room price: " + getPrice() + ", balcony availability: " + (hasBalcony?" Balcony is present":" Balcony is absent"));
    }
}
