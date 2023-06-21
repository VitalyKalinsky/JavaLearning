package vitaly.learning.designPatterns.adapter;

public class Main {
    public static void main(String[] args) {
        ABank aBank = new ABank();
        BBank bBank = new BBank();
        BBankAdapter adapter = new BBankAdapter(aBank);
        System.out.println(aBank.getCost());
        System.out.println(adapter.getPrice());
    }
}
