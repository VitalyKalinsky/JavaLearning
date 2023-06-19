package Composite;

public class Main {
    public static void main(String[] args) {
        Composite composite = new Composite(new RaceCar(), new DriftCar(), new RaceCar());
        composite.drive();
    }
}
