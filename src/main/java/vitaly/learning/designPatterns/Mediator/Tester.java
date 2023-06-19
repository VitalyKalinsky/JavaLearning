package Mediator;

public class Tester extends Colleague{
    public Tester(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Tester received: " + msg);
    }
}
