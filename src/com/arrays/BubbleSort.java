package com.arrays;


public class BubbleSort {
    public static void main(String[] args) {
        // Bubble Sort : it is technique to sort the array by comparing each element with their adjacent elements
        int[] arr = {4, 3, 1, 7, 0};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array : ");
        for (int each : arr) {
            System.out.print(each+" ");
        }

    }
}
