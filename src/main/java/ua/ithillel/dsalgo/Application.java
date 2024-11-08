package ua.ithillel.dsalgo;

import ua.ithillel.dsalgo.list.MyArrayList;
import ua.ithillel.dsalgo.list.MyList;
import ua.ithillel.dsalgo.list.MySinglyLinkedList;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // FIFO - first in first out
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Hello");
        stringQueue.add("World");
        stringQueue.add("Hillel");

        int size1 = stringQueue.size();
        stringQueue.offer("Hillel");

        if (!stringQueue.isEmpty()) {
            String first = stringQueue.remove();
        }

        String poll = stringQueue.poll();
        if (poll != null) {
            System.out.println(poll);
        }

        // LIFO - last in first out
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(10);
        stack.push(12);
        stack.push(5);

        Integer last = stack.pop();
        Integer semiLast = stack.pop();


        //
        List<String> linkedList = new LinkedList<>();

//        List<String> list = new LinkedList<>();
        MyList<String> list = new MySinglyLinkedList<>();
        list.add("a");
        list.add("b");
        list.add("hello");
        list.add("world");

        String s = list.get(2);

        String remove = list.remove(2);

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String str: list) {
            System.out.println(str);
        }


        MyList<Integer> integerMyList = new MyArrayList<>();

        integerMyList.add(12);
        integerMyList.add(23);
        integerMyList.add(12);
        integerMyList.add(-100);
        integerMyList.add(-34);
        integerMyList.add(2355);
        integerMyList.add(256);


        integerMyList.remove(1);
        integerMyList.remove(5);

        for (Integer myInt: integerMyList) {
            System.out.println(myInt);
        }

        Integer i1 = integerMyList.get(2);


        List<Integer> intList = new ArrayList<>(200);

        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(50);

        Integer i = intList.get(3);

        int size = intList.size();

        intList.set(2, 100);

        intList.remove(3);

        for (int j = 0; j < 100; j++) {
            intList.add(j);
        }

        // for each
        for (Integer it: intList) {
            System.out.println(it);
        }

        System.out.println();

        // array of ints
//        int[] intArr = null;
//        intArr = new int[10];
//
//        int length = intArr.length;
//
//        intArr[3] = 23; // random access
//        intArr[8] = 22;
//
//
//        int[][] twoDimensionalArray = new int[4][];
//        twoDimensionalArray[0] = new int[]{1, 2};
//        twoDimensionalArray[1] = new int[10];
//        twoDimensionalArray[3] = new int[]{};
//
//        twoDimensionalArray = new int[10][10];


        System.out.println();
    }
}
