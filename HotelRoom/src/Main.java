public class Main {
    public static void main(String[] args) {

//        StandardRoom standartRoom = new StandardRoom(44, 150, RoomType.STANDARD);
//        SuiteRoom suiteRoom = new SuiteRoom( 75, 300, RoomType.SUITE);
//        DeluxeRoom deluxeRoom = new DeluxeRoom(100, 600, RoomType.DELUXE);
//
//        Room[] rooms = new Room[3];
//        rooms [0] = standartRoom;
//        rooms [1] = suiteRoom;
//        rooms [2] = deluxeRoom;
//
//        standartRoom.reserve();
//        standartRoom.cancelReserve();
//
//        suiteRoom.reserve();
//        suiteRoom.cancelReserve();
//
//        deluxeRoom.reserve();
//        deluxeRoom.cancelReserve();
//
//        for (Room room : rooms){
//            if(room.isBooked()){
//                room.displayInfo();
//            }
//        }
        Room room1 = new Room(1, 150, RoomType.STANDARD);
        Room room2 = new Room(2, 300,RoomType.SUITE);
        Room room3 = new Room(3, 600, RoomType.DELUXE);

        Room[] rooms = new Room[3];
        rooms [0] = room1;
        rooms [1] = room2;
        rooms [2] = room3;

        for (Room room : rooms){
            if(room.isBooked()){
                room.displayInfo();
            }
        }
    }
}