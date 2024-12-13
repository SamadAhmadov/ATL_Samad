public enum RoomType {
    STANDARD {
        @Override
        public void displayInfo() {
            System.out.println("Standart room has single bed");
        }
    },
    SUITE {
        @Override
        public void displayInfo() {
            System.out.println("Suite room has kitchen");
        }
    },
    DELUXE {
        @Override
        public void displayInfo() {
            System.out.println("Deluxe room has balcony");
        }
    };

    public abstract void displayInfo();
}