package ua.ithillel.dsalgo.map;

import java.lang.reflect.Array;

public class MyHashMap<K, V> implements MyMap<K, V> {
    private static final int DEFAULT_INITIAL_CAPACITY = 10;
    private static final double DEFAULT_LOAD_FACTOR = 0.75;
    private static final double DEFAULT_SCALE_FACTOR = 1.5;

    private Node[] hashTable;
    private int size;

    public MyHashMap() {
        hashTable = (Node[]) Array.newInstance(Node.class, DEFAULT_INITIAL_CAPACITY);
    }

    @Override
    public void put(K key, V value) {
        ensureCapacity();

        Entry entry = new Entry(key, value);

        // idx = hash(key)
        Node node = new Node(entry);

        putNode(node);
        size++;
//        int idx = hash(key);
//
//        Node existingNode = hashTable[idx];
//        if (existingNode == null) {
//            hashTable[idx] = new Node(entry);
//            size++;
//            return;
//        }
//
//        Node curNode = existingNode;
//        Node prevNode = null;
//        while (curNode != null) {
//            prevNode = curNode;
//
//            if (curNode.entry.key.equals(key)) {
//                curNode.entry.value = value;
//                return;
//            }
//
//            curNode = curNode.next;
//        }
//
//        prevNode.next = new Node(entry);
//        size++;
    }

    private void putNode(Node node) {
        int idx = hash(node.entry.key);

        Node existingNode = hashTable[idx];
        if (existingNode == null) {
            hashTable[idx] = node;
//            size++;
            return;
        }

        Node curNode = existingNode;
        Node prevNode = null;
        while (curNode != null) {
            prevNode = curNode;

            if (curNode.entry.key.equals(node.entry.key)) {
                curNode.entry.value = node.entry.value;
                return;
            }

            curNode = curNode.next;
        }

        prevNode.next = node;
//        size++;
    }

    @Override
    public V get(K key) {
        int idx = hash(key);

        Node curNode = hashTable[idx];
        Node prevNode = null;
        while (curNode != null) {
            prevNode = curNode;

            if (curNode.entry.key.equals(key)) {
                return curNode.entry.value;
            }

            curNode = curNode.next;
        }


        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    private int hash(K key) {
        int hashCode = key.hashCode();

        return Math.abs(hashCode) % (hashTable.length - 1); // 0 ... array.length - 1
        // hashCode & (hashTable.length - 1)
    }

    private void ensureCapacity() {
        if (size >= hashTable.length * DEFAULT_LOAD_FACTOR) {
            scale();
        }
    }

    private void scale() {
        Node[] oldTable = hashTable;
        int newCapacity = (int) (oldTable.length * DEFAULT_SCALE_FACTOR);

        hashTable = (Node[]) Array.newInstance(Node.class, newCapacity);

        for (Node oldNode: oldTable) {
            Node curNode = oldNode;
            while (curNode != null) {
                Node newNode = new Node(curNode.entry);
                putNode(newNode);

                curNode = curNode.next;
            }
        }
    }

    private class Node {
        Entry entry;
        Node next;

        public Node(Entry entry) {
            this.entry = entry;
        }

        @Override
        public String toString() {
            return "[" + entry.toString() + "]";
        }
    }

    private class Entry {
        K key;
        V value;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "(" + key + ", " + value + ")";
        }
    }
}
