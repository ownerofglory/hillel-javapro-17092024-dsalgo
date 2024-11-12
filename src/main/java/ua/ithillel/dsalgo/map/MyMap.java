package ua.ithillel.dsalgo.map;

public interface MyMap<K, V> {
    void put(K key, V value);
    V get(K key);
    V remove(K key);
    int size();
    boolean isEmpty();
}
