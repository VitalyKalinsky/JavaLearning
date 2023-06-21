package vitaly.learning.designPatterns.adapter;

public class ABank {
    int getCost(){
        System.out.println("ABank.getCost()");
        return 100;
    }
}
