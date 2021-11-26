package data_structure.TCS_NQT;

import java.util.Scanner;

public class ToZeroOrNotToZero {

//    Given a pair of positive integers m and n (m < n; 0 < m < 999; 1 < n < = 999), write a program to
//    smartly affix zeroes, while printing the numbers from m to n.
//    Example-1
//    Input
//      5 10
//    Expected output
//      05 06 07 08 09 10
//    Input
//      1 9
//    Expected output
//      1 2 3 4 5 6 7 8 9

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        for (int i = m; i <= n; i++) {
            if (n >= 100)
                System.out.printf("%03d ",i);
            else if (n >= 10)
                System.out.printf("%02d ",i);
            else
                System.out.printf("%d ",i);
        }
    }
}
