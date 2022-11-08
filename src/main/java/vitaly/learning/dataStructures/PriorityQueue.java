package vitaly.learning.dataStructures;

import java.util.Arrays;

public class PriorityQueue {
    private final int[] queue;
    int nElems;
    int maxElems;

    public PriorityQueue(int count) {
        maxElems = count;
        this.queue = new int[maxElems];
    }

    public void print() {
        System.out.println(Arrays.toString(queue));
    }

    public int remove() {
        return queue[--nElems];
    }

    public void insert(int el) {
        int i;
        if (isEmpty()) queue[nElems++] = el;
        else {
            for (i = nElems - 1; i >= 0; i--) {
                if (el > queue[i]) {
                    queue[i + 1] = queue[i];
                } else
                    break;
            }
            queue[i + 1] = el;
            nElems++;
        }
    }

    public int peek(){
        return queue[nElems-1];
    }
    public boolean isEmpty() {
        return (nElems == 0);
    }

    public boolean isFull() {
        return (nElems >= maxElems);
    }
}
