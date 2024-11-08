package ua.ithillel.dsalgo.list;

public interface MyList<T> extends Iterable<T> {
    int size();
    boolean isEmpty();
    T get(int index);
    T set(int index, T value);
    void add(T value);
    T remove(int index);
}
