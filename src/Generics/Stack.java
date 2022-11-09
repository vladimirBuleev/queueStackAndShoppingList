package Generics;

public class Stack<T> {
    private Element<T> head;

    public void push(T value) {
        Element<T> last = head;
        head = new Element<>(value);
        head.setNext(last);

    }

    public T pop() {
        if (head == null) {
            System.out.println("no element");
        }
        T value = head.getValue();
        head = head.getNext();
        return value;
    }

    public T peek() {
        if (head == null) {
            System.out.println("no element");
        }
        return head.getValue();
    }
}
