package projects.dataStructures;

public class Main {
    public static void main(String[] args) {
        ArrayLN array = new ArrayLN(10, false);
        array.printArray();
        array.selectionSort();
        array.printArray();
    }
}
