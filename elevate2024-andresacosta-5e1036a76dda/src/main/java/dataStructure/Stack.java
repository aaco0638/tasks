package dataStructure;



import java.util.EmptyStackException;


    class Stack<T> implements MyQueue<T> {
        private dataStructure.Stack.Node<T> top;
        private int size;

        @Override
        public void put(T element) {
            push(element);

        }

        @Override
        public T get() {
            return top();
        }

        @Override
        public T poll() {
            return pop();
        }

        private static class Node<T> {
            T data;
            dataStructure.Stack.Node<T> next;

            Node(T data) {
                this.data = data;
            }
        }

        public void push(T item) {
            dataStructure.Stack.Node<T> newNode = new dataStructure.Stack.Node<>(item);
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

        @Override
        public int getSize() {
            return 0;
        }

        public boolean isEmpty() {
            return top == null;
        }
        public int size(){
            return size;
        }


    }


