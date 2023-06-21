package vitaly.learning.designPatterns.proxy;

public class CarProxy implements InterfaceCar {
    Car origCar;
    public CarProxy(Car origCar){
        this.origCar = origCar;
    }
    @Override
    public void drive() {
        origCar.drive();
        System.out.println("that's wonderful - i am going to my grandfather!");
    }
}
