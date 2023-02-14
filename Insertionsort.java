package sorting;

import java.util.Arrays;
import java.util.Random;

public class Insertionsort {

    public static void main(String[] args) {
        // Generate a random integer array
        int[] arr = generateRandomArray(10, 0, 100);
        System.out.println("Unsorted array: " + Arrays.toString(arr));

        // Sort the array using Insertion Sort
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(max - min) + min;
        }
        return arr;
    }
}
