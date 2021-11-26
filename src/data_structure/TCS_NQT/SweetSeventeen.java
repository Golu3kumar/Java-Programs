package data_structure.TCS_NQT;

import java.util.HashMap;
import java.util.Scanner;

public class SweetSeventeen {

    // Given a maximum of four digit to the base 17
    // (10 – A, 11 – B, 12 – C, 13 – D … 16 – G} as input, output its decimal value.

//    Case 1
//    Input – 1A
//    Expected Output – 27
//    Case 2
//    Input – 23GF
//    Expected Output – 10980

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        long decimal = getDecimal(input);
        System.out.println(decimal);
    }

    private static long getDecimal(String input) {
        if (input.length() <= 0)
            return 0;

        long result = 0;
        int k = 0;
        for (int i = input.length()-1; i >=0 ; i--) {
            if(input.charAt(i) >= 'A' && input.charAt(i) <= 'G'){
                result += (input.charAt(i) - 'A' + 10)*(int)(Math.pow(17,k));
            }else if(input.charAt(i) >= 'a' && input.charAt(i) <= 'g'){
                result += (input.charAt(i) - 'a' + 10) * ((int)Math.pow(17,k));
            }else {
                result += (input.charAt(i) - '0') * (int)(Math.pow(17,k));
            }
            k++;
        }
        return result;
    }
}
