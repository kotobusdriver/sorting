package app;

import java.util.Arrays;
import java.util.Random;

import static app.ArrayUtils.binarySearch;
import static app.ArrayUtils.mergeSort;

public class Main {
    public static void main(String[] args) {
        // array with random numbers
        int size = 10;
        int[] arr = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100);
        }
        System.out.println("Original unsorted array: " + Arrays.toString(arr));

        mergeSort(arr);
        System.out.println("Sorted array using mergeSort: " + Arrays.toString(arr));

        // search in sorted
        int target = arr[random.nextInt(size)];
        System.out.println("Searching for: " + target);
        int index = binarySearch(arr, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index: " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
