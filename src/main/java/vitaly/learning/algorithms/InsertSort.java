package vitaly.learning.algorithms;

public class InsertSort {
    private final int[] array;
    private int nElems = 0;

    public InsertSort(int length) {
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

    public void insertSort() {
        int temp, in, out;

        for (out = 1; out < array.length; out++) {
            temp = array[out];
            in = out;
            while (in > 0 && array[in - 1] >= temp) {
                array[in] = array[--in];
            }
            array[in] = temp;
        }
    }
}
