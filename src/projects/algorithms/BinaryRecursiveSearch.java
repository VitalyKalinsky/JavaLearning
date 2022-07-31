package projects.algorithms;

public class BinaryRecursiveSearch {
    private final int[] array;
    private int nElems = 0;

    public BinaryRecursiveSearch (int length) {
        this.array = new int[length];
    }

    public void swap(int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public void printArray() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int size() {
        return nElems;
    }

    public void insert(int el) {
        array[nElems++] = el;
    }

    public int binRecSearch(int el) {
        return binRecSearch(el, 0, array.length - 1);
    }

    private int binRecSearch(int el, int lowerBound, int upperBound) {
        int curIndex = curIndex = (lowerBound + upperBound) / 2;
        if (array[curIndex] == el)
            return curIndex;
        else if (lowerBound > upperBound)
            return -1;
        else {
            if (array[curIndex] < el)
                return binRecSearch(el, ++lowerBound, upperBound);
            else
                return binRecSearch(el, lowerBound, --upperBound);
        }
    }
}
