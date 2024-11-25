package ua.ithillel.dsalgo.util;

import ua.ithillel.dsalgo.tree.TreeNode;

import java.util.*;

public class TreeUtil {
    public static <T> List<T> depthFirstTraverse(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        Stack<TreeNode<T>> stack = new Stack<>();

        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode<T> node = stack.pop();

            T value = node.getValue();
            result.add(value);

            // get right
            if (node.getRight() != null) {
                stack.push(node.getRight());
            }

            // get left
            if (node.getLeft() != null) {
                stack.push(node.getLeft());
            }

        }

        return result;
    }

    public static <T> List<T> depthFirstTraverseRec(TreeNode<T> root) {
        // base case
        if (root == null) {
            return new ArrayList<>();
        }

        List<T> left = depthFirstTraverseRec(root.getLeft());
        List<T> right = depthFirstTraverseRec(root.getRight());



        return new ArrayList<>() {{
            add(root.getValue());
            addAll(left);
            addAll(right);
        }};
    }

    public static <T> List<T> breadthFirstTraverse(TreeNode<T> root) {
        List<T> result = new ArrayList<>();
        Queue<TreeNode<T>> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode<T> node = queue.poll();

            result.add(node.getValue());

            if (node.getLeft() != null) {
                queue.add(node.getLeft());
            }

            if (node.getRight() != null) {
                queue.add(node.getRight());
            }
        }


        return result;
    }
}
