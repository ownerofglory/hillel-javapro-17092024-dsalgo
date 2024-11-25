package ua.ithillel.dsalgo.util;

public class SortUtil {
    // val > 0
    public static void printSleepSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int val = arr[i];
            new Thread(() -> {
               try {
                   Thread.sleep(val * 1000);
                   System.out.println(val);
               } catch (InterruptedException e) {
                   throw new RuntimeException(e);
               }
            }).start();
        }
    }
}
