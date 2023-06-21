package vitaly.learning.designPatterns.mediator;

public abstract class Colleague {
    Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String msg){
        mediator.send(msg, this);
    }
    public abstract void receive(String msg);
}
