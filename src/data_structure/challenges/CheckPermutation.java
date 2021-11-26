package data_structure.challenges;

import java.util.Arrays;
import java.util.Scanner;

public class CheckPermutation {

    // Given two string decide one is permutation of another or not
    // Permutation : A String is permutation of another String if all character from one String must
    // appears in another String but order not mattered.
    // Input : 1. "Nikhil" 2. "khiliN"
    // Output : true(yes 1 is permutation of 2)
    // Discuss with your interviewer that ,Is Permutation case sensitive ?. OR WhiteSpaces matters or not?
    // for simplicity take string as case sensitive.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Strings : ");
        String str1 = scanner.next();
        String str2 = scanner.next();

        System.out.println("1 is Permutation of 2 or not : "+isPermutation(str1,str2));
        System.out.println("1 is Permutation of 2 or not : "+isPermutationMethod2(str1,str2));
    }

    // We can perform sorting on both string then compare them to check they are equal ot not.
    // Time comp. : O(nlogn) (Sorting BottleNeck)
    // Space comp. : O(1)
    private static boolean isPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) //edge case
            return false;

        return sort(str1).equals(sort(str2));
    }

    // Sorting method for permutation
    private static String sort(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    //Permutation : Permutation is also counting of occurrence of characters.
    // Time comp. : O(n)
    // Space comp : O(n)
    private static boolean isPermutationMethod2(String str1, String str2){
        if (str1.length() != str2.length()) // edge case
            return false;
        int[] len = new int[128]; // ASCII values up to 128(Latest is 256)
        for (char c:str1.toCharArray()) {
            len[c]++; // counting occurrence of character
        }

        for (int i = 0; i < str2.length(); i++) {
            int c = str2.charAt(i);
            len[c]--;
            if (len[c]<0)
                return false;
        }
        return true;
    }


}
