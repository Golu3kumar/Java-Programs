package data_structure.TCS_NQT;

import java.util.Scanner;

public class OddEvenSeries {

//    Consider the below series: 0,0,2,1,4,2,6,3,8,4,10,5,12,6,14,7,16,8
//    Write a program to find the nth term in this series.

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        int result = getResult(n);
        System.out.println(result);
    }

    private static int getResult(int n) {
        if (n == 1 || n == 2)
            return 0;
        int result = 0;
        if (n % 2 != 0){
            for (int i = 2; i < n; i+=2) {
                result = i;
            }
        }
        else {
            for (int i = 2; i < n; i+=2) {
                result++;
            }
        }
        return result;
    }
}
