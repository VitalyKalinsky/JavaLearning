package vitaly.learning.designPatterns.mediator;

public class Programmer extends Colleague{
    public Programmer(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Programmer received: " + msg);
    }
}
