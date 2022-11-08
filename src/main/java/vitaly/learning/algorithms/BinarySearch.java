package vitaly.learning.algorithms;

public class BinarySearch {
    private final int[] array;
    private int nElems = 0;

    public BinarySearch (int length) {
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

    public int binarySearch(int el) {
        int curIndex = 0;
        int lowerBound = 0;
        int upperBound = array.length - 1;

        while (true) {
            curIndex = (lowerBound + upperBound) / 2;
            if (array[curIndex] == el)
                return curIndex;
            else if (lowerBound > upperBound)
                return -1;
            else {
                if (array[curIndex] < el)
                    lowerBound = curIndex + 1;
                else
                    upperBound = curIndex - 1;
            }
        }
    }
}
