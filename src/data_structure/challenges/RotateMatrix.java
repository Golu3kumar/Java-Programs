package data_structure.challenges;

public class RotateMatrix {
    // Rotate a matrix NxN by 90 degrees in clockwise
    // Demo
    //  1 2 3                       7 4 1
    //  4 5 6   after 90 degrees    8 5 2
    //  7 8 9                       9 6 3

    // 1 4 7
    // 2 5 8
    // 3 6 9

    //4 1 2
    //7 5 3
    //8 9 6


    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;
        int m = matrix[0].length;

        // calling the function
        rotateBy90(matrix, n, m);

        for (int[] arr : matrix) {
            for (int a : arr) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        System.out.println();
        rotateBy90UsingTranspose(matrix2, n, m);
    }

    private static void rotateBy90UsingTranspose(int[][] matrix, int n, int m) {
        if (n != m)
            return;

        // first we transpose the matrix
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < m; j++) {
                if (i < j) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }

    private static void rotateBy90(int[][] matrix, int n, int m) {
        if (n != m) // edge case : Not a Square.
            return;

        // swap by index (Hard to understand?)
        // But trust me this is a good example
        // This is how an image rotates.
        for (int layer = 0; layer < n / 2; layer++) { // repeating on layers
            int first = layer;
            int last = n - 1 - layer;
            for (int i = first; i < last; i++) {
                int offset = i - first;
                // store top first
                int top = matrix[first][i];

                // left -> top (top = left)
                matrix[first][i] = matrix[last - offset][first];

                // bottom -> left (left = bottom)
                matrix[last - offset][first] = matrix[last][last - offset];

                // right -> bottom (bottom = right)
                matrix[last][last - offset] = matrix[i][last];

                // top -> right (right = top)
                matrix[i][last] = top;
            }
        }
    }


}
