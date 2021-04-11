package com.arrays;

import java.util.Arrays;

public class OneDArray {
    public static void main(String[] args) {
        //Array : It is a Linear data structure used to store more than one element in a contiguous manner.
        // it is a collection of homogeneous data type means integer array can store only integer elements

        int[] arr = new int[5]; //by default elements of array are 0
        // the above line creates the arr reference of hashCode into the Stack memory which pointing to the data
        // stored into Heap memory in contiguous manner.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
        arr[4] = 88;
        System.out.println(arr[4]);

        // initializing array
        int[] countryPopulation = new int[]{500, 333, 556, 333, 2345, 334};
        System.out.println();
        // for each loop or enhanced loop
        for (int each : countryPopulation) {
            System.out.print(each+" ");
        }
        System.out.println();
        System.out.println("Max population : " +Arrays.stream(countryPopulation).max());
        System.out.println("Min population : " +Arrays.stream(countryPopulation).min());
    }
}
