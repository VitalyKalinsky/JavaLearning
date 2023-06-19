package Mediator;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Analysis analysis = new Analysis(mediator);
        Programmer programmer = new Programmer(mediator);
        Tester tester = new Tester(mediator);
        mediator.analysis = analysis;
        mediator.programmer = programmer;
        mediator.tester = tester;
        analysis.send("Need to make an application");
        programmer.send("Need to test an application");
        tester.send("Application tested: everything is OK");
    }
}
