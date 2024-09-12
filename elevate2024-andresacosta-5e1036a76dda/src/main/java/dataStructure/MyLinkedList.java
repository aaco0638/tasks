package dataStructure;

import java.util.Objects;

class MyLinkedList<T> implements MyList<T> {

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private int size;

    public MyLinkedList() {
        this.head = null;
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void add(T element) {
        Node<T> newNode = new Node<>(element);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    @Override
    public void remove(Object o) {
        if (head == null) {
            return;
        }

        if (Objects.equals(head.data, o)) {
            head = head.next;
            size--;
            return;
        }

        Node<T> current = head;
        Node<T> previous = null;
        while (current != null && !Objects.equals(current.data, o)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
            size--;
        }
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if (index == 0) {
            head = head.next;
        } else {
            Node<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    @Override
    public int at(Object o) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (Objects.equals(current.data, o)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}
