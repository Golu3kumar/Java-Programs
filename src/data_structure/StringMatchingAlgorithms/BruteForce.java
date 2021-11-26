package data_structure.StringMatchingAlgorithms;

public class BruteForce {

    // String Matching Algorithm : In String Matching there are two Strings.
    // Text and Pattern, We need to check weather the text matches to the pattern or not.
    // Text : T[i = 0..n-1]
    // Pattern : P[j = 0..m-1]
    // there are many algorithms for string matching, but for now we only looking for Brute Force approach.
    // Let's crack it!

    public static void main(String[] args) {

        String text = "ABCDABBCABCDBCD";
        String pattern = "ABCD";

        bruteForceStringMatching(text,pattern);
    }

    private static void bruteForceStringMatching(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n-m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (text.charAt(i+j) != pattern.charAt(j))
                    break;
            }
            if (j == m)  // pattern matched
                System.out.println("Pattern is found at "+i);
        }
    }
}
