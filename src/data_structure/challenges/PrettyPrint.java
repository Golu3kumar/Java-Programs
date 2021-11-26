package data_structure.challenges;

public class PrettyPrint {

    public static void main(String[] args) {

        int A = 4;
        int n = 2*A-1;
        int[][] pattern = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n-i; j++) {
                pattern[i][j] = pattern[n-1-i][j] = A - i;
                pattern[j][i] = pattern[j][n-1-i] = A - i;
            }
        }

        for (int[] ints : pattern) {
            for (int anInt : ints) {
                System.out.print(anInt+" ");
            }
            System.out.println();
        }
    }
}
