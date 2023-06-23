import TimSort.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int n = arr.length;
        Random random = new Random();
        int[] sortedArr;

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(4000) - 2000;
        }

        System.out.println("Not sorted array:");
        printArray(arr,100);

        TimSort.timSort(arr, n);
        System.out.println("Sorted array:");
        printArray(arr,100);
    }

    public static void printArray(int[] arr, int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n");
    }
}
