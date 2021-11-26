package data_structure.StringProblems;

public class LongestCommonSubsequence {

    public static void main(String[] args) {

        String x = "vowelpunish";
        String y = "english";

        int i = x.length();
        int j = y.length();
        String result = lcsV(x, y, i, j);
        System.out.println(result);
    }

    private static String lcsV(String x, String y, int m, int n) {

        int[][] mat = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (i == 0 || j == 0)
                    mat[i][j] = 0;
                else if ((x.charAt(i - 1) == y.charAt(j - 1)))
                    mat[i][j] = mat[i - 1][j - 1] + 1;
                else
                    mat[i][j] = Math.max(mat[i - 1][j], mat[i][j - 1]);
            }
        }
        int index =  mat[m][n];
        int tmp = index;
        char[] lcs = new char[index+1];
        lcs[index] = '\0';
        int i = m, j = n;
        while (i > 0 && j > 0)
        {
            // If current character in X[] and Y are same, then
            // current character is part of LCS
            if (x.charAt(i-1) == y.charAt(j-1))
            {
                // Put current character in result
                lcs[index-1] = x.charAt(i-1);

                // reduce values of i, j and index
                i--;
                j--;
                index--;
            }

            // If not same, then find the larger of two and
            // go in the direction of larger value
            else if (mat[i-1][j] > mat[i][j-1])
                i--;
            else
                j--;
        }
        return String.valueOf(lcs);

    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
