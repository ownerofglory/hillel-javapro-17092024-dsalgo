package ua.ithillel.dsalgo.list;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T> implements MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private static final double DEFAULT_SCALE_FACTOR = 1.5;

    private T[] array;
    private int size;

    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int intialCapacity) {
        T[] emptyArray = createEmptyGenericArray();
        this.array = (T[]) Array.newInstance(emptyArray.getClass().getComponentType(), intialCapacity);

    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[index];
    }

    @Override
    public T set(int index, T value) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        return this.array[index] = value;
    }

    @Override
    public void add(T value) {
        ensureCapacity();
        this.array[size++] = value;
    }

    // 1 3 6 9 4 5
    // 1 3 _ 9 4 5
    // 1 3 9 4 5 0 ; size--
    @Override
    public T remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException();
        }
        T val = this.array[index];
        this.array[index] = null;

        System.arraycopy(this.array, index + 1, this.array, index, size - index - 1);
        size--;

        return val;
    }

    // vararg
    private T[] createEmptyGenericArray(T ... args) {
        return args;
    }

    private void ensureCapacity() {
        if (this.size == this.array.length) {
            grow();
        }
    }

    private void grow() {
        int newLength = (int) (this.array.length * DEFAULT_SCALE_FACTOR);
        this.array = Arrays.copyOf(this.array, newLength);
    }

    @Override
    public Iterator<T> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<T> {
        private int curIdx;

        @Override
        public boolean hasNext() {
            return curIdx < size;
        }

        @Override
        public T next() {
            return array[curIdx++];
        }
    }
}
