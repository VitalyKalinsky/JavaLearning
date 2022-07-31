package projects.dataStructures;

public class LinkedList {
    protected Link first;

    public int size = 0;

    public LinkedList() {
        this.first = null;
    }

    public LinkedList(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            insertFirst(arr[i]);
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(int iData) {
        Link el = new Link(iData);
        el.next = first;
        this.first = el;
        size++;
    }

    public void insert(int iData, int index) {
        Link el = new Link(iData),
                current = first,
                prev = first;
        if (isEmpty()) {
            el.next = first;
            first = el;
            size++;
        } else {
            for (int i = 0; i < index; i++) {
                prev = current;
                current = current.next;
            }
            prev.next = el;
        }
    }

    public Link get (int index) {
        Link current = first;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    public Link deleteFirst() {
        if (!isEmpty()) {
            Link temp = first;
            first = first.next;
            size--;
            return temp;
        } else return null;
    }

    public Link delete(int el) {
        Link current = first;
        Link prev = first;
        while (current.iData != el) {
            if (current.next == null)
                return null;
            else {
                prev = current;
                current = current.next;
            }
            if (current == first)
                first = first.next;
            else
                prev.next = current.next;
        }
        size--;
        return current;
    }

    public Link find(int index) {
        Link current = first;
        while (current.iData != index) {
            if (current.next == null)
                return null;
            else
                current = current.next;
        }
        return current;
    }

    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println();
    }
}
