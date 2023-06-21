package vitaly.learning.designPatterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Composite implements Car{
    ArrayList<Car> cars;

    public Composite(Car ... car) {
        cars = Arrays.stream(car).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    public void drive() {
        cars.forEach(car -> car.drive());
    }
}
