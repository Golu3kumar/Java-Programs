package data_structure.Arrays;

import java.util.Arrays;

public class PrintMaxMin {

    public static void main(String[] args) {

        int[] arr = {5,6,8,2,4,9};

        Arrays.sort(arr);
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        int i = 0;
        int j = arr.length-1;

        while(i <= j){

            System.out.println(arr[j] + " " +arr[i]);
//            System.out.print(arr[i]);
            j--;
            i++;
        }
    }
}
