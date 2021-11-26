package data_structure.challenges;


public class Sort_012 {
    // read comments
    // Welcome back after a long time!
    // I don't know why I keep distance from programming, but I know the feeling that I felt since a month ago.
    // It's really hurt me.  :(
    // But It's time to back at the laptop and do my profession.
    // Bad english!

    // Let's discussed about the problem
    // you have given an array with only elements 0,1 and 2.
    // and your task is to sort that array. Pretty simple, hold on
    // there is a condition. This work needs to perform in O(n) time with constant space
    // and try to do in single scan.
    // Demo
    // input - [2,0,1,0,1,2,1,0]
    // output - [0,0,0,1,1,1,2]
    // Your time starts now! Tik Tok Tik Tok....
    // Hint : Datch National Flag Problem.

    public static void main(String[] args) {

        int[] array = {2,0,1,0,1,2,1,0};
        System.out.println("Before sorting");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        sort_012(array);

        System.out.println("After soring by method 1 : ");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] array2 = {2,0,1,0,1,2,1,0};
        sort_012_SecondMethod(array2);
        System.out.println("After soring by method 2 : ");
        for (int i : array2) {
            System.out.print(i + " ");
        }


    }

    private static void sort_012_SecondMethod(int[] array2) {
        // we have three pointers
        int low = 0;
        int mid = 0;
        int high = array2.length - 1;

        while (mid <= high) {
            if (array2[mid] == 0) {
                int temp = array2[mid];
                array2[mid] = array2[low];
                array2[low++] = temp;
            }
//            else if (array2[mid] == 1)
//                mid++;

            else if (array2[mid] == 2){
                int temp = array2[mid];
                array2[mid] = array2[high];
                array2[high--] = temp;
                continue;
            }
            mid++;
        }
    }

    // approach 1 : It's simple solution but not in single scan
    private static void sort_012(int[] array) {
        int zeros, ones, twos;
        zeros = ones = twos = 0;
        for (int j : array) {
            if (j == 0) zeros++;
            if (j == 1) ones++;
            if (j == 2) twos++;
        }
        int i = 0;
        while (zeros-- != 0) {
            array[i] = 0;
            i++;
        }
        while (ones-- != 0) {
            array[i] = 1;
            i++;
        }
        while (twos-- != 0) {
            array[i] = 2;
            i++;
        }

    }
}
