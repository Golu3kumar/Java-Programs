package com.arrays;

public class SelectionSort {
    static int[] selectionSort(int[] input) {
        System.out.println("Unsorted array : ");
        for (int i : input) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < input.length - 1; i++) {
            int max_index = i;

            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[max_index])
                    max_index = j;
            }
            int temp = input[i];
            input[i] = input[max_index];
            input[max_index] = temp;
        }

        return input;
    }

    public static void main(String[] args) {
        //Selection Sort : It also short an array but it select the minimum element and swap with first element

        int[] a = {5, 4, 3, 2, 8};
        a = selectionSort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }
}
