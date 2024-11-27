package ua.ithillel.dsalgo.util;

import java.util.*;

public class GraphUtil {
    public static <T> List<T> depthFirstTraversal(Map<T, List<T>> graph, T start) {
        List<T> result = new ArrayList<>();
        Stack<T> stack = new Stack<>();
        Set<T> visited = new HashSet<>();

        if (!graph.containsKey(start)) {
            throw new RuntimeException("Graph doesn't contain start node");
        }

        stack.push(start);

        while (!stack.isEmpty()) {
            T node = stack.pop();
            if (visited.contains(node)) {
                continue;
            }

            result.add(node);
            visited.add(node);

            List<T> neighbours = graph.get(node);

            for (T neighbour : neighbours) {
                stack.push(neighbour);
            }
        }


        return result;
    }

    public static <T> List<T> breadthFirstTraversal(Map<T, List<T>> graph, T start) {
        List<T> result = new ArrayList<>();
        Queue<T> queue = new LinkedList<>();
        Set<T> visited = new HashSet<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            T val = queue.remove();
            if (visited.contains(val)) {
                continue;
            }

            visited.add(val);
            result.add(val);

            List<T> neighbours = graph.get(val);
            for (T neighbour : neighbours) {
                queue.add(neighbour);
            }

        }


        return result;
    }

    public static <T> boolean breadthFirstSearch(Map<T, List<T>> graph, T start, T finish) {
        if (!graph.containsKey(start)) {
            throw new RuntimeException("Graph doesn't contain start node");
        }

        if (!graph.containsKey(finish)) {
            throw new RuntimeException("Graph doesn't contain finish node");
        }

        List<T> path = new ArrayList<>();
        Queue<T> queue = new LinkedList<>();
        Set<T> visited = new HashSet<>();

        queue.add(start);

        while (!queue.isEmpty()) {
            T val = queue.remove();
            if (visited.contains(val)) {
                continue;
            }

            path.add(val);
            visited.add(val);
            if (finish.equals(val)) {
                return true;
            }

            List<T> neighbours = graph.get(val);
            for (T neighbour : neighbours) {
                queue.add(neighbour);
            }
        }


        return false;
    }

    public static <T> Map<T, List<T>> edgeListToAdjacency(T[][] edgeList) {
        Map<T, List<T>> graph = new HashMap<>();

        for (T[] edge : edgeList) {
            T begin = edge[0];
            T end = edge[1];

            if (!graph.containsKey(begin)) {
                graph.put(begin, new ArrayList<>());
            }

            if (!graph.containsKey(end)) {
                graph.put(end, new ArrayList<>());
            }

            List<T> neighboursOfBegin = graph.get(begin);
            neighboursOfBegin.add(end);

            List<T> neighboursOfEnd = graph.get(end);
            neighboursOfEnd.add(begin);
        }

        return graph;
    }
}
