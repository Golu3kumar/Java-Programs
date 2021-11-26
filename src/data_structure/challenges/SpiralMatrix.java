package data_structure.challenges;

public class SpiralMatrix {

    // Welcome again!
    // Input : A Matrix with Spiral Increment
    //  1   2  3 4
    //  12 13 14 5
    //  11 16 15 6
    //  10  9  8 7

    // Output : 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16
    // let's begin

    public static void main(String[] args) {

        int[][] spiralMatrix = {
                {1, 2, 3, 4},
                {12, 13, 14, 5},
                {11, 16, 15, 6},
                {10, 9, 8, 7}
        };

        printSpiralMatrix(spiralMatrix, spiralMatrix.length, spiralMatrix[0].length);
        // mission successful.
    }

    private static void printSpiralMatrix(int[][] spiralMatrix, int rows, int cols) {
        // here our approach is to first print top, right, bottom and then left
        int top = 0, left = 0;
        int bottom = rows - 1, right = cols - 1;

        while (true) {

            if (left > right)
                break;
            // printing top side
            for (int i = left; i <= right; i++) {
                System.out.print(spiralMatrix[top][i] + " ");
            }
            top++;

            if (top > bottom)
                break;
            //printing right side
            for (int i = top; i <= bottom; i++) {
                System.out.print(spiralMatrix[i][right] + " ");
            }
            right--;

            if (left > right)
                break;
            // printing bottom side
            for (int i = right; i >= left; i--) {
                System.out.print(spiralMatrix[bottom][i] + " ");
            }
            bottom--;

            if (top>bottom)
                break;
            // printing left side
            for (int i = bottom; i >= top; i--) {
                System.out.print(spiralMatrix[i][left]+" ");
            }
            left++;
        }
    }
}
