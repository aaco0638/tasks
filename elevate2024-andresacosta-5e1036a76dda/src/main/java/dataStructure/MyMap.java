package dataStructure;

 interface MyMap<K,V> {

    void insert(K key, V value);

    V get(K key);

    MyList<K> getKeys();

    MyList<V> getValues();


}
