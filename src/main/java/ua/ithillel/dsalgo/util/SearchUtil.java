package ua.ithillel.dsalgo.util;

import java.util.Comparator;

public class SearchUtil {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1;
        }

        // 0 ... 10
        // (10 - 0 ) /2 = 5
        // 5 ... 10
        // 5 + (10 - 5) /2
        int mid = low + (high - low) / 2;

        int midValue = arr[mid];

        // recursive case 1
        if (target < midValue) {
            // go left
            return binarySearch(arr, target, low, mid - 1);

        } // recursive case 1
        else if (target > midValue) {
            // go right
            return binarySearch(arr, target, mid + 1, high);

        } else {
            // base case
            return mid;
        }

    }

    public static <T extends Comparable<T>> int binarySearchGen(T[] arr, T target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        T midValue = arr[mid];


        int cmp = target.compareTo(midValue);
        // recursive case 1
        if (cmp < 0) {
            // go left
            return binarySearchGen(arr, target, low, mid - 1);

        } // recursive case 1
        else if (cmp > 0) {
            // go right
            return binarySearchGen(arr, target, mid + 1, high);

        } else {
            // base case
            return mid;
        }

    }

    public static <T> int binarySearchGen(Comparator<T> comparator, T[] arr, T target, int low, int high) {
        if (low > high) {
            return -1;
        }

        int mid = low + (high - low) / 2;

        T midValue = arr[mid];


        int cmp = comparator.compare(target, midValue);
        // recursive case 1
        if (cmp < 0) {
            // go left
            return binarySearchGen(comparator, arr, target, low, mid - 1);

        } // recursive case 1
        else if (cmp > 0) {
            // go right
            return binarySearchGen(comparator, arr, target, mid + 1, high);

        } else {
            // base case
            return mid;
        }

    }

}
