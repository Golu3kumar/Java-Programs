package com.arrays;

public class InsertionSort {
    static int[] insertionSort(int[] input){
        int len = input.length;
        int temp;
        for (int i = 1; i < len; i++) {
            for (int j = i; j >0 ; j--) {
                if (input[j]<input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;

                }
            }
        }
        return input;
    }

    public static void main(String[] args) {
        System.out.println("Sorted array : ");

        int[] sortedArray = insertionSort(new int[]{5,4,3,6,7,8});
        for (int each:sortedArray) {
            System.out.print(each+" ");
        }
        System.out.println();
        int a = 0xF3;
        System.out.println(a);
    }
}
