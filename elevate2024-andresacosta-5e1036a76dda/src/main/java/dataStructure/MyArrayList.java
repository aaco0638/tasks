package dataStructure;

import java.util.Objects;

//import static java.lang.StringUTF16.indexOf;
import static java.util.Objects.checkIndex;

class MyArrayList<T> implements MyList<T> {
    private T[] arr;
    private static int default_capacity = 10;
    private int size;
    public MyArrayList() {
        this.arr = (T[]) new Object[default_capacity];
        this.size = 0;
    }

    @Override
    public void add(T element) {
        if(size == arr.length){
            resize(arr.length * 2);

        }
        arr[size++] = element;

    }

    private void resize(int i) {
        T[] newArr = (T[]) new Object[i];
        System.arraycopy(arr, 0, newArr, 0, size);
        arr = newArr;


    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return arr[index];
    }

    @Override
    public void remove(Object o) {
        int index = indexOf(o);
        if (index != -1) {
            remove(index);
        }
    }

    private int indexOf(Object o) {

        for (int i = 0; i < size; i++) {
            if (Objects.equals(o, arr[i])) {
                return i;
            }
        }
        return -1;
    }


    @Override
    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(arr, index + 1, arr, index, size - index - 1);
        arr[--size] = null;
    }

    @Override
    public int at(Object o) {
        return indexOf(o);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }
}

