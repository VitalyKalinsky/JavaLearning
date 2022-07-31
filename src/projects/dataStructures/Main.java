package projects.dataStructures;


public class Main {
    public static FirstLastList items = new FirstLastList(new int[]{11, 8, 7, 6, 5});

    public static void main(String[] args) {
        BinaryTree theTree = new BinaryTree();
        theTree.insert(new int[]{50, 25, 75, 15, 40, 60, 90, 10, 20, 30, 45, 55, 70, 80, 95, 27});
        theTree.inOrder();
        theTree.delete(50);
        theTree.preOrder();
    }
}