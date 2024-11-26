package vehicleTask;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Car car2 = new Car();
        Vehicle electricCar = new ElectricCar();
        car.startEngine();
        car.stopEngine();
        bike.startEngine();
        bike.stopEngine();
        electricCar.startEngine();
        electricCar.stopEngine();
        System.out.println(car.getFuelType());
        System.out.println(bike.getFuelType());
        System.out.println(electricCar.getFuelType());
        car2.startCar();
    }
}
