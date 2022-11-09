package Generics;

public class Queue<T> {
    private Element<T> first;

    public void push(T value) {
        Element<T> newElement = new Element(value);
        if (first == null) {
            first = newElement;
        } else {
            Element<T> next = first;
            while (next.getNext() != null) {
                next = next.getNext();
            }
            next.setNext(newElement);
        }
    }

    public T pop() {
        if (first == null) {
            System.out.println("no elements");
        }
        T value = first.getValue();
        first = first.getNext();
        return value;
    }
}

