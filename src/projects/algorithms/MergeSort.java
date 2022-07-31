package projects.algorithms;

public class MergeSort {
    private final int[] array;
    private int nElems = 0;

    public MergeSort (int length) {
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

    public void mergeSort() {
        int[] workingArray = new int[nElems];
        recMergeSort(workingArray, 0, nElems - 1);
    }

    private void recMergeSort(int[] workingArray, int lowerBound, int upperBound) {
        if (upperBound - lowerBound <= 0)
            return;
        else {
            int middle = (upperBound + lowerBound) / 2;

            recMergeSort(workingArray, lowerBound, middle);
            recMergeSort(workingArray, middle + 1, upperBound);

            merge(workingArray, lowerBound, middle + 1, upperBound);
        }
    }

    private void merge(int[] workingArray, int lowPtr, int highPtr, int upperBound) {
        int i = 0,
                lowerBound = lowPtr,
                mid = highPtr - 1,
                n = upperBound - lowerBound + 1;

        while (lowPtr <= mid && highPtr <= upperBound) {
            if (array[lowPtr] < array[highPtr])
                workingArray[i++] = array[lowPtr++];
            else
                workingArray[i++] = array[highPtr++];
        }

        while (lowPtr <= mid)
            workingArray[i++] = array[lowPtr++];
        while (highPtr <= upperBound)
            workingArray[i++] = array[highPtr++];

        for (i = 0; i < n; i++)
            array[lowerBound + i] = workingArray[i];
    }
}
