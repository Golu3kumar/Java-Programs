package data_structure.PatternPrinting;

import java.util.Scanner;

public class PyramidPattern {

//            *
//           * *
//          * * *
//         * * * *
//        * * * * *
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPyramid(n);
        sc.close();

    }

    static void printPyramid(int n){
        for(int i = 0;i<n;i++){
            // for spacing
            for(int j = 0;j<n-i-1;j++){
                System.out.print(" ");
            }

            for(int j = 0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
