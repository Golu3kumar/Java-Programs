package data_structure.TCS_NQT;

import java.util.Scanner;

public class Fibonacci {

//    Consider the series given below: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377 ,610, 987,.....
//    Write a program to find the Nth term in this series.
//    This series is formed as below:
//            1.term(1)=1
//            2.term(2)=2
//            3.term(N)=term(N-1)+term(N-2)for N>2

    //    Sample Input – 1
//            15
//    Sample Output – 1
//            987
//    Sample Input – 2
//            10
//    Sample Output – 2
//            89
    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        int fibNumber = fib(n);
        System.out.println(fibNumber);
    }

    private static int fib(int n) {
        if (n == 1 || n == 2)
            return n;

        int a = 1;
        int b = 2;
        int result = 0;
        for (int i = 3; i < n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }
}
