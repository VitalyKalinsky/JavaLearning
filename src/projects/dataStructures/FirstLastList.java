package projects.dataStructures;

public class FirstLastList extends LinkedList {
    public Link last;

    public FirstLastList() {
        this.last = null;
        super.first = null;
    }

    public FirstLastList(int[] arr) {
        for (int el :
                arr) {
            insertLast(el);
        }
    }

    @Override
    public void insertFirst(int iData) {
        Link newLink = new Link(iData);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(int iData) {
        Link newLink = new Link(iData);
        if (isEmpty())
            first = newLink;
        else
            last.next = newLink;
        last = newLink;
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

}
