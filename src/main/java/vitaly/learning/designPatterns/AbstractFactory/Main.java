package AbstractFactory;

public class Main {
    public static enum Nation{
        RU,
        UA
    }
    public static void main(String[] args) {
        Nation nation = Nation.UA;
        AbstractFactory factory = null;
        switch (nation){
            case RU:
                factory = new RuFactory();
                break;
            case UA:
                factory = new UaFactory();
                break;
        }
        System.out.println(factory.getLada().getModel());
        System.out.println(factory.getPorche().getModel());
    }
}
