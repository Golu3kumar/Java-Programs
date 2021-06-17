package data_structure.Sorting;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 1, 3, 2, 5, 6, 1, 2};
        int n = arr.length;

        System.out.println("Sorted Array : ");
        countSort(arr, n);
    }

    private static void countSort(int[] arr, int n) {
        int[] output = new int[n];
        int max = Arrays.stream(arr).max().getAsInt();
        int[] count = new int[max + 1];
        // initialize count with 0
        Arrays.fill(count, 0);
        // count the number of occurrence
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        // calculate cumulative sum
        for (int i = 1; i <= max; i++) {
            count[i] += count[i - 1];
        }
        // Find the index of each element of the original array in count array, and
        // place the elements in output array
        for (int i = n-1; i >= 0; i--) {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }

        for (int i : output) {
            System.out.print(i+" ");
        }
    }
}
