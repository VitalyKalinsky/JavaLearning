package vitaly.learning.designPatterns.mediator;

public class Analysis extends Colleague{
    public Analysis(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String msg) {
        System.out.println("Analysis received: " + msg);
    }
}
