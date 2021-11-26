package data_structure.PatternPrinting;

//     * * * * *
//
//      * * * *
//
//       * * *
//
//        * *
//
//         *
//
//         *
//
//        * *
//
//       * * *
//
//      * * * *
//
//     * * * * *


import java.util.Scanner;

public class SandClockPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0;i<n;i++){

            // spacing
            for(int j = 0; j<i;j++){
                System.out.print(" ");
            }

            for(int j = i;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }

        PyramidPattern.printPyramid(n);
    }

}
