package vitaly.learning.designPatterns.adapter;

public class BBankAdapter {
    ABank aBank;

    public BBankAdapter(ABank aBank) {
        this.aBank = aBank;
    }

    public int getPrice(){
        return aBank.getCost();
    }
}
