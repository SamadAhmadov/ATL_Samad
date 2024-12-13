package InClassTasks.vehicleTask;

public class Car implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Maşının mühərriki işə düşdü.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Maşının mühərriki söndürüldü.");
    }

    @Override
    public String getFuelType() {
        return "AI95";
    }

    boolean hasFuel = true;

    public boolean checkFuel() {
        return hasFuel;
    }

    public void startCar() {
        if (checkFuel()) {
            startEngine();
        } else {
            System.out.println("Yanacaq bitib");
        }
    }
}