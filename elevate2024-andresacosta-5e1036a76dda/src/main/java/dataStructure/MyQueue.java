package dataStructure;

 interface MyQueue<T> extends MyCollection<T> {

    void put(T element);

    T get();

    T poll();


}
