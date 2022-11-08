package vitaly.learning.algorithms;

public class QuickSort {
    private final int[] array;
    private int nElems = 0;

    public QuickSort(int length) {
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

    public void quickSort() {
        recQuickSort(0, nElems - 1);
    }

    private void recQuickSort(int left, int right) {
        if ((right - left + 1) <= 5)
            insertSort(left,right);
        else {
            int pivot = medianOf3(left, right);
            int partition = partition(left, right, pivot);

            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    private int partition(int left, int right, int pivot) {
        int leftPtr = left,
                rightPtr = right - 1;
        while (true) {
            while (array[++leftPtr] < pivot) ;
            while (array[--rightPtr] > pivot) ;

            if(leftPtr >= rightPtr)
                break;
            swap(leftPtr, rightPtr);
        }
        swap(leftPtr, right - 1);
        return leftPtr;
    }
    private int medianOf3(int left, int right) {
        int middle = (right + left) / 2;

        if (array[left] > array[right])
            swap(left, right);
        if (array[left] > array[middle])
            swap(left, middle);
        if (array[middle] > array[right])
            swap(middle, right);

        swap(middle, right - 1);
        return array[right - 1];
    }

    public void insertSort(int left, int right) {
        int out, in, temp;
        for (out = left + 1; out <= right; out++) {
            temp = array[out];
            in = out;
            while (in > left && array[in - 1] >= temp){
                array[in] = array[--in];
            }
            array[in] = temp;
        }
    }
}
