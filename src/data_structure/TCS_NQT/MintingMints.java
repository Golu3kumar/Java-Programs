package data_structure.TCS_NQT;

import java.util.Scanner;

public class MintingMints {

//    Given the number of first kid’s mints (n) and the length (len) of queue as input, write a program to
//    display the total number of mints with all the kids.
//    Example-1
//    Input
//      4 2
//    Expected output:
//      7
//    Example-2
//    Input
//      14 4
//    Expected output
//      105

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = sc.nextInt();
        int[] arr = new int[len];
        int totalNumberOfMints = n;
        arr[0] = n;
        for (int i = 1; i < len; i++) {
            arr[i] = totalNumberOfMints-1;
            totalNumberOfMints += arr[i];
        }

        System.out.println(totalNumberOfMints);
    }
}
