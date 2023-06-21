package vitaly.learning.designPatterns.builder;

public class Car {
    int horsePower;
    public Car(){}
    public Car setHorsePower(int horsePower){
        this.horsePower = horsePower;
        return this;
    }
    public Car setWheel(){
        System.out.println("wheel has been set");
        return this;
    }
}
