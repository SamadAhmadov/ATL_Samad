package vehicleTask;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle electricCar = new ElectricCar();
        Car car2 = new Car();
        car.startEngine();
        car.stopEngine();
        bike.startEngine();
        bike.stopEngine();
        electricCar.startEngine();
        electricCar.stopEngine();
        car2.startCar();
        System.out.println(car.getFuelType());
        System.out.println(bike.getFuelType());
        System.out.println(electricCar.getFuelType());

    }
}