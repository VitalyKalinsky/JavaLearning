package vitaly.learning.designPatterns.composite;

public class DriftCar implements Car{
    @Override
    public void drive() {
        System.out.println("Drift car is drifting");
    }
}
