package Mediator;

public class Mediator {
    Analysis analysis;
    Programmer programmer;
    Tester tester;

    public void send(String msg, Colleague colleague) {
        if (colleague.equals(analysis))
            programmer.receive(msg);
        else if (colleague.equals(programmer))
            tester.receive(msg);
        else if (colleague.equals((tester)))
            analysis.receive("Application is OK");
    }
}
