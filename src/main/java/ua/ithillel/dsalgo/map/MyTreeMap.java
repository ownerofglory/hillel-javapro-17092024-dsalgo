package ua.ithillel.dsalgo.map;


import com.sun.source.tree.Tree;

import java.util.Comparator;

public class MyTreeMap<K, V> implements MyMap<K, V> {
    private TreeNode root;
    private int size;
    private Comparator<? super K> comparator;

    // natural order
    public MyTreeMap() {
    }

    // with compare strategy
    public MyTreeMap(Comparator<? super K> comparator) {
        this.comparator = comparator;
    }


    /*
                13
             /
            8
     */

    @Override
    public void put(K key, V value) {
        Entry entry = new Entry(key, value);
        TreeNode node = new TreeNode(entry);

        if (root == null) {
            root = node;
            return;
        }

        TreeNode curNode = root;
        TreeNode parent = null;
        int cmp = 0;
        while (curNode != null) {
            parent = curNode;
            if (comparator != null) {
                cmp = comparator.compare(curNode.entry.key, node.entry.key);
                if (cmp < 0) {
                    curNode = curNode.left;
                }  else if (cmp > 0) {
                    curNode = curNode.right;
                } else {
                    // keys are equal
                    curNode.entry.value = node.entry.value;
                    return;
                }

            } else {
                Comparable<? super K> comparableKey = (Comparable) curNode.entry.key;
                cmp = comparableKey.compareTo(node.entry.key);
                if (cmp < 0) {
                    curNode = curNode.left;
                }  else if (cmp > 0) {
                    curNode = curNode.right;
                } else {
                    // keys are equal
                    curNode.entry.value = node.entry.value;
                    return;
                }
            }
        }

        if (cmp <= 0) {
            parent.left = node;
        } else {
            parent.right = node;
        }

        size++;
    }

    @Override
    public V get(K key) {
        TreeNode curNode = root;
        TreeNode parent = null;
        int cmp = 0;

        while (curNode != null) {
            if (comparator != null) {
                cmp = comparator.compare(curNode.entry.key, key);
                if (cmp < 0) {
                    curNode = curNode.left;
                } else if (cmp > 0) {
                    curNode = curNode.right;
                } else {
                    return curNode.entry.value;
                }

            } else {
                Comparable<? super K> comparableKey = (Comparable) curNode.entry.key;
                cmp = comparableKey.compareTo(key);

                if (cmp < 0) {
                    curNode = curNode.left;
                } else if (cmp > 0) {
                    curNode = curNode.right;
                } else {
                    return curNode.entry.value;
                }
            }
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
        return root == null;
    }

    private class TreeNode {
        Entry entry;
        TreeNode left;
        TreeNode right;

        public TreeNode(Entry entry) {
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
