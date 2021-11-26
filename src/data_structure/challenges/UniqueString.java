package data_structure.challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueString {

    public static void main(String[] args) {

        //Input : "Golu kumar" // output : false
        //Input : "This" // output : true

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String input = scanner.next();
        System.out.println();
        System.out.println("Is " + input + " unique : " + isUnique(input));
        System.out.println("Is " + input + " unique : " + isUniqueBySorting(input));
    }

    // time complexity : O(n)
    // space complexity : O(n)
    private static boolean isUnique(String input) {
        if (input.isEmpty())
            return false;

        Map<Character, Boolean> map = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
                return false;
            } else {
                map.put(c, true);
            }
        }
        return true;

    }

    // Time complexity : O(nlogn) (For sorting)
    // Space Complexity : O(1)
    private static boolean isUniqueBySorting(String input){
        char[] arr = input.toCharArray();
        Arrays.sort(arr);

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1])
                return false;
        }

        return true;
    }
}
