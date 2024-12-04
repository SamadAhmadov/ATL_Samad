package Enums;

public class MainTrafficLights {
    public static void main(String[] args) {
        for (TrafficLights light : TrafficLights.values()) {
            System.out.println(light + ": " + light.getAction());
        }
    }
}
