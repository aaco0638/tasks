package genericsLab;

import java.util.EmptyStackException;



public class GenericStack<T> {
    private Node<T> top;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T item = top.data;
        top = top.next;
        size--;
        return item;
    }

    public T top() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
    public int size(){
        return size;
    }


}
