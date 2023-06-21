package vitaly.learning.designPatterns.adapter;

public class BBank {
    int getPrice(){
        System.out.println("BBank.getPrice");
        return 200;
    }
}
