package vitaly.learning.designPatterns.proxy;

public class Car implements InterfaceCar {
    @Override
    public void drive(){
        System.out.println("i am driving so fast i can't");
    }
}
