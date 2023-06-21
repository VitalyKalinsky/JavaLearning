package vitaly.learning.designPatterns.abstractFactory;

public class UaFactory implements AbstractFactory{
    @Override
    public UaLada getLada() {
        return new UaLada();
    }

    @Override
    public UaPorche getPorche() {
        return new UaPorche();
    }
}
