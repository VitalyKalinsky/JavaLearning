package AbstractFactory;

public class RuFactory implements AbstractFactory{
    @Override
    public RuLada getLada() {
        return new RuLada();
    }

    @Override
    public RuPorche getPorche() {
        return new RuPorche();
    }
}
