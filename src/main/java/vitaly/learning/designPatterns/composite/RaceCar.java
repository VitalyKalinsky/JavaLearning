package vitaly.learning.designPatterns.composite;

public class RaceCar implements Car{
    @Override
    public void drive() {
        System.out.println("Race car is going fast");
    }
}
