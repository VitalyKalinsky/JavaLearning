package vitaly.learning.reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws ReflectiveOperationException{
        Car car = new Car(100, "AA180A1");
        Class<? extends Car> carClass = car.getClass();
        Method method = carClass.getMethod("logAndReturn", Object.class);
        System.out.println(method.isSynthetic());
        System.out.println(method.isBridge());
    }
}
