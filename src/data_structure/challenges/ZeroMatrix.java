package data_structure.challenges;

public class ZeroMatrix {

    // Welcome again!
    // Problem : Find the 0 in the matrix and replace it's entire row and column with zero.
    // Input : A Matrix with MxN size.
    // Output : A matrix with MxN size with solved above problem.
    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {3, 0, 5},
                {5, 4, 9}
        };
        // calling function
        setZeros(matrix);

        // now printing our matrix
        for (int[] eachMat : matrix) {
            for (int eachVal : eachMat) {
                System.out.print(eachVal + " ");
            }
            System.out.println();
        }
    }

    private static void setZeros(int[][] matrix) {
        if (matrix.length <= 0)
            return;

        // creating two boolean arrays
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        // store the row and column index with 0 value
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        // Nullify rows
        for (int i = 0; i < row.length; i++) {
            if (row[i]) nullifyRow(matrix, i);
        }

        // Nullify columns
        for (int i = 0; i < col.length; i++) {
            if (col[i]) nullifyColumn(matrix, i);
        }

    }

    private static void nullifyColumn(int[][] matrix, int column) {
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][column] = 0;
        }
    }

    private static void nullifyRow(int[][] matrix, int row) {
        for (int j = 0; j < matrix[0].length; j++) {
            matrix[row][j] = 0;
        }
    }
}
