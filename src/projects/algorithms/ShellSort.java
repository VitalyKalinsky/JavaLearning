package projects.algorithms;

public class ShellSort {
    private final int[] array;
    private int nElems = 0;

    public ShellSort(int length) {
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

    public void shellSort() {
        int out, in;
        int temp;
        int h = 1;
        while (h < nElems / 3)
            h = h * 3 + 1;
        while (h > 0) {
            for (out = 0; out < nElems; out++) {
                temp = array[out];
                in = out;
                while (in > h - 1 && array[in - h] >= temp) {
                    array[in] = array[in - h];
                    in -= h;
                }
                array[in] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
