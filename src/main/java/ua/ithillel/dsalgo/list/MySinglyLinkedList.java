package ua.ithillel.dsalgo.list;

import java.util.Iterator;

public class MySinglyLinkedList<T> implements MyList<T> {
    private Node head;
    private int size;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public T get(int index) {
        // check size

        int curIdx = 0;

        Node curNode = head;
        while (curNode != null) {
            if (curIdx == index) {
                return curNode.val;
            }
            curNode = curNode.next;
            curIdx++;
        }

        return null;
    }

    // a -> b -> c -> d -> *
    // z:2
    //            z
    //         /    \
    // a -> b       c -> d -> *
    @Override
    public T set(int index, T value) {
        return null;
    }

    // head -> a -> *

    // add to begin 1)
    //       b \
    // head -> a -> *

    // add to begin 2)
    //        b \
    // head /     a -> *

    // add to end 1)
    //
    // head -> a -> b -> *

    // head -> a -> b -> c
    //                    \ d -> *
    @Override
    public void add(T value) {
        Node node = new Node(value);
        size++;

        // adding 1st element
        if (head == null) {
            this.head = node;
            return;
        }

        // add to end
        Node curNode = head;
        Node prevNode = curNode;
        while (curNode != null) {
            prevNode = curNode;

            curNode = curNode.next;
        }

        prevNode.next = node;
    }

    // a -> b -> c -> d -> *
    //
    // a -> b     -> d  -> *
    // c -> *
    @Override
    public T remove(int index) {
        T val = null;

        int curIdx = 0;
        Node curNode = head;
        Node prevNode = curNode;
        while (curNode != null) {
            if (curIdx == index) {
                val = curNode.val;
                prevNode.next = curNode.next;
                curNode.next = null;
                size--;
                return val;
            }

            prevNode = curNode;

            curNode = curNode.next;
            curIdx++;
        }

        return null;
    }

    @Override
    public Iterator<T> iterator() {
        return new MySinglyLinkedListIterator();
    }

    private class MySinglyLinkedListIterator implements Iterator<T> {
        private Node curNode = head;

        @Override
        public boolean hasNext() {
            return curNode != null;
        }

        @Override
        public T next() {
            T val = curNode.val;

            curNode = curNode.next;

            return val;
        }
    }

    private class Node {
        T val;
        Node next;

        public Node(T val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return "(" + val + ")";
        }
    }
}
