package data_structure.StringProblems;

import java.util.Arrays;

public class KAnagramProblem {

    // Anagram : The two strings are called Anagram to each other if they satisfy the condition.
    // Cond1. : Both strings have the same number of characters
    // Cond2. : Strings are allowed to change characters up to K numbers.

    // Demo : String1 = "ford", String2 = "wolf"  , k = 2
    // Output : true, because in both strings there are 2 editAway(rd change with wl), it doesn't matter sequence of characters.

    public static void main(String[] args) {

        String str1 = "ford";
        String str2 = "wolf";
        int k = 2;
        boolean isAnagram = isAnagram(str1, str2, k);
        if (isAnagram)
            System.out.println(str1 + " and " + str2 + " both are anagram.");
        else
            System.out.println(str1 + " and " + str2 + " both are not anagram.");
    }

    private static boolean isAnagram(String str1, String str2, int k) {
        // edge case
        if (str1.length() != str2.length())
            return false;
        // create hash table for counting the number of occurrence of characters.
        int[] table = new int[26];
        Arrays.fill(table, 0);
        for (int i = 0; i < str1.length(); i++)
            table[str1.charAt(i) - 'a']++;

        for (int i = 0; i < str2.length(); i++) {
            if (table[str2.charAt(i) - 'a'] > 0)
                table[str2.charAt(i) - 'a']--;
            else
                k--;
            if (k < 0)
                return false;
        }
        return true;
    }
}
