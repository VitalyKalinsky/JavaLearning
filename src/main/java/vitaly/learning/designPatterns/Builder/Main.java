package Builder;

public class Main {
    public static void main(String[] args) {
        Car car = new Car().setHorsePower(200).setWheel().setWheel().setWheel();
        System.out.println(car.horsePower);
    }
}
