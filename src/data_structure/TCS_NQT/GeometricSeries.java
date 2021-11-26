package data_structure.TCS_NQT;

import java.util.Scanner;

public class GeometricSeries {
    //Consider the following series: 1,1,2,3,4,9,8,27,16,81,32,243,64,729,128,2187…
//    Sample Input – 1
//            5
//    Sample Output – 1
//            4
//    Sample Input – 2
//            10
//    Sample Output – 2
//            81

    public static void main(String[] args) {

        int n = new Scanner(System.in).nextInt();

        System.out.println((n%2==0)?(int)Math.pow(3,(n-1)/2):(int)Math.pow(2,(n-1)/2));
    }
}
