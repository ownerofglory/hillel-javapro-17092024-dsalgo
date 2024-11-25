package ua.ithillel.dsalgo.tree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class TreeNode<T> implements Iterable<T> {
    private T value;

    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + value + ")";
    }

    @Override
    public Iterator<T> iterator() {
        return new BreadthFirstIterator();
    }

    private class BreadthFirstIterator implements Iterator<T> {
        private Queue<TreeNode<T>> queue = new LinkedList<>();

        private BreadthFirstIterator() {
            queue.add(TreeNode.this);
        }

        @Override
        public boolean hasNext() {
            return !queue.isEmpty();
        }

        @Override
        public T next() {
            TreeNode<T> poll = queue.poll();

            if (poll.getLeft() != null) {
                queue.add(poll.getLeft());
            }

            if (poll.getRight() != null) {
                queue.add(poll.getRight());
            }

            return poll.value;
        }
    }
}
