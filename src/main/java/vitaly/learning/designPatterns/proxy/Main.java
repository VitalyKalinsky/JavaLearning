package vitaly.learning.designPatterns.proxy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarProxy proxy = new CarProxy(car);
        car.drive();
        proxy.drive();
    }
}
