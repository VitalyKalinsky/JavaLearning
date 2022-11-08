package vitaly.learning.dataStructures;

public class Array {
    private final int[] array;
    private int nElems = 0;

    // constructor
    public Array(int length) {
        this.array = new int[length];
    }

    public Array(int length, boolean isSorted) {
        this.array = new int[length];
        for (int i = 0; i < array.length; i++) {
            insert((int) Math.round(Math.random() * 100), i);
        }
        if (isSorted)
            this.quickSort();
    }

    // help-functions
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

    // delete
    public void del(int el) {
        int index = binarySearch(el);
        array[index] = 0;
        try {
            for (int i = index; i < array.length; i++) {
                array[i] = array[i + 1];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
        }
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

    // add
    public void insert(int el) {
        array[nElems++] = el;
    }

    public void insert(int el, int index) {
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = el;
        nElems++;
    }

    // get
    public int get(int index) {
        return array[index];
    }

    public int getMax() {
        int max = 0;
        for (int i : array) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    private void recQuickSort(int left, int right) {
        if ((right - left + 1) <= 3)
            manualSort(left, right);
        else {
            int el = array[right];
            int partition = partition(left, right, el);

            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    private int partition(int left, int right, int el) {
        int leftPtr = left,
                rightPtr = right - 1;
        while (true) {
            while (array[++leftPtr] < el) ;
            while (array[--rightPtr] > el) ;

            if (leftPtr >= rightPtr)
                break;
            else
                swap(leftPtr, rightPtr);
        }
        swap(right - 1, leftPtr);
        return leftPtr;
    }

    private int medianOf3(int left, int right) {
        int mid = (right + left) / 2;

        if (array[left] > array[mid])
            swap(left, mid);
        if (array[left] > array[right])
            swap(left, right);
        if (array[mid] > array[right])
            swap(mid, right);

        swap(mid, right - 1);
        return array[right - 1];
    }

    public void manualSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 1)
            return;
        else if (size == 2) {
            if (array[left] > array[right])
                swap(left, right);
            return;
        } else {
            if (array[left] > array[right - 1])
                swap(left, right - 1);
            if (array[left] > array[right])
                swap(left, right);
            if (array[right - 1] > array[right])
                swap(right - 1, right);
        }
    }
}