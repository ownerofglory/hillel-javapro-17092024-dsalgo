package ua.ithillel.dsalgo.util;

import java.util.Arrays;
import java.util.Comparator;

public class ArithmeticUtil {
    public static int max(int ... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }

        int max = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }

        return max;
    }

    public static <T> T maxRecGen(Comparator<T> comparator, T ... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }

        // base case
        if (values.length == 1) {
            return values[0];
        }

        // recursive case
        T max = values[0];
        T[] remaining = Arrays.copyOfRange(values, 1, values.length);

        // compare
        int compare = comparator.compare(max, maxRecGen(comparator, remaining));
        if (compare > 0) {
            return max;
        }


        return maxRecGen(comparator, remaining);
    }

    public static <T extends Comparable<T>> T maxRecGen(T ... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }

        // base case
        if (values.length == 1) {
            return values[0];
        }

        // recursive case
        T max = values[0];
        T[] remaining = Arrays.copyOfRange(values, 1, values.length);

        // compare
        if (max.compareTo(maxRecGen(remaining)) > 0) {
            return max;
        }


        return maxRecGen(remaining);
    }

    // [0] > max(values[0:leng-1])
    public static int maxRec(int ... values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException();
        }

        // base case
        if (values.length == 1) {
            return values[0];
        }

        // recursive case
        int max = values[0];
        int[] remaining = Arrays.copyOfRange(values, 1, values.length);

        if (max > maxRec(remaining)) {
            return max;
        }
        return maxRec(remaining);
    }

    public static int fib(int n) {
        // base case
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
