package com.arrays;

//matrix addition
public class TwoDArray {
    public static void main(String[] args) {
        // 2D - Array : It is a array of array, means it is a collection of elements into matrix form.

        // 2DArray
        int[][] m1 = {
                {4, 3, 5, 6},
                {5, 4, 3, 5},
                {4, 3, 6, 8}
        };

        System.out.println("Array m1 of size(m*n) : " + "(" + m1.length + "*" + m1[0].length + ")");

        int[][] m2 = {
                {3, 2, 4, 0},
                {4, 1, 4, 0},
                {3, 3, 3, 2}
        };
        System.out.println("Array m2 of size(m*n) : " + "(" + m2.length + "*" + m2[0].length + ")");

        // Matrix addition c = mi+m2
        int[][] c = new int[3][4];

        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                c[i][j] = m1[i][j] + m2[i][j];
            }
        }

        // printing array
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1[i].length; j++) {
                System.out.print(m1[i][j] + " ");
            }
            // formatting
            if (i == 1) System.out.print(" + ");
            else System.out.print("   ");

            for (int j = 0; j < m2[i].length; j++) {
                System.out.print(m2[i][j] + " ");
            }

            if (i == 1) System.out.print(" = ");
            else System.out.print("   ");
            for (int j = 0; j < c[i].length; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
