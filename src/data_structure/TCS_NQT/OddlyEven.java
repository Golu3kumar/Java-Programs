package data_structure.TCS_NQT;

import javax.swing.*;
import java.util.Scanner;

public class OddlyEven {

//    Given a maximum of 100 digit numbers as input, find the difference between the sum of odd and
//    even position digits.
//    Input 1: 4567
//    Expected output: 2
//    Explanation : Sum of odd position digits 4 and 6 is 10. Sum of even position digits 5 and 7 is 12.
//    The difference is 12-10=2.
//    Input #2: 9834698765123
//    Expected output: 1
//    Input 3: 5476
//    Expected output: 2

    public static void main(String[] args) {

        //System.out.println(0%2);
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < input.length(); i++) {
            int num = Integer.parseInt(String.valueOf(input.charAt(i)));
            if (i % 2==0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Difference = "+Math.abs(evenSum-oddSum));
    }

}
