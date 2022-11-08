package vitaly.learning.dataStructures;

public class Stack {
    private int[] stack;      //список
    private final int maxElems;     //размер
    private int top;          //последний элемент(индекс)

    public Stack(int maxElems) {
        stack = new int[(this.maxElems = maxElems)];
        top = -1;
    }

    public void push(int el) {
        if (!isFull()) stack[++top] = el;
        else System.out.println("стэк переполнен");
    }

    public int pop() {
        if (!isEmpty()) return stack[top--];
        else System.out.println("стэк пуст");
        return -1;
    }

    public int peek() {
        if (!isEmpty()) return stack[top];
        else return -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top >= maxElems - 1;
    }
}
