package projects.dataStructures;

import java.util.Arrays;

public class ArrayLN {
    private static int[] array;

    public static void main(String[] args) {
        ArrayLN arrayLN = new ArrayLN(10, false);
        arrayLN.insertSort();
        printArray(array);
    }

    // constructor
    public ArrayLN(int length, boolean isSorted) {
        array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
        }
        if (isSorted)
            this.bubbleSort();
    }

    // help-functions
    void swap(int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    // search
    int search(int el) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == el)
                return i;
        }
        return -1;
    }

    // delete
    void del(int el) {
        int index = search(el);
        array[index] = 0;
        try {
            for (int i = index; i < array.length; i++) {
                array[i] = array[i + 1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
    }

    // add
    void addIn(int el, int index) {
        for (int i = array.length - 1; i > index; i--) {
            System.out.println(Arrays.toString(array));
            System.out.println("yes");
            array[i] = array[i - 1];
        }
        array[index] = el;
    }

    // get
    int get(int index) {
        return array[index];
    }

    int getMax() {
        int max = 0;
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    // search
    int binarySearch(int el) {
        int curIndex = 0;
        int down = 0;
        int up = array.length - 1;

        while (true) {
            curIndex = (down + up) / 2;
            if (array[curIndex] == el)
                return curIndex;
            else if (down > up)
                return -1;
            else {
                if (array[curIndex] < el)
                    down = curIndex + 1;
                else
                    up = curIndex - 1;
            }
        }
    }

    // sort
    void bubbleSort() {
        for (int out = array.length - 1; out > 0; out--) {
            for (int in = 0; in < out; in++) {
                if (array[in] > array[in + 1]) {
                    swap(in, in + 1);
                }
            }
        }
    }

    void selectionSort() {
        int min;
        for (int out = 0; out < array.length - 1; out++) {
            min = out;
            for (int in = out + 1; in < array.length; in++) {
                if (array[in] < array[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    void insertSort() {
        int temp, in;
        for (int out = 1; out < array.length; out++) {
            temp = array[out];
            in=out;
            while(in > 0 && array[in - 1] >= temp){
                array[in] = array[in-1];
                in--;
            }
            array[in] = temp;
        }
    }
}
