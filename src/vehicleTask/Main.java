package vehicleTask;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        car.startEngine();
        car.stopEngine();
        bike.startEngine();
        bike.stopEngine();
    }
}
