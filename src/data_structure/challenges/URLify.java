package data_structure.challenges;

import java.util.Scanner;

public class URLify {
    // Write a method to replace all spaces in a string with "%20".
    // You may assume that the string has sufficient space at the end to hold the additional characters.
    // and that your are given the true length of the string.
    // Input : "Mr Nikhil Kumar", 15
    // Output : "Mr%20Nikhil%20Kumar"
    // let's go
    public static void main(String[] args) {


        String result = urlify("Mr Nikhil Kumar    ", 15);
        System.out.println(result.trim()); // trim is for removing end spaces.
    }

    private static String urlify(String str, int trueLen) {
        // In java Strings are Immutable so we have to worked on it's character array.
        // first we count the number of space in the string for extended array of characters.
        char[] c = str.toCharArray();
        int spaceCount = 0, index = 0;
        for (int i = 0; i < trueLen; i++) {
            if (c[i] == ' ')
                spaceCount++;
        }
        // calculating index for array
        // removing 1 space adding 3 chars, so total increment is 2.
        index = trueLen + 2 * spaceCount; //(as adding string for 1 space takes 2 index space)
        //if (trueLen > c.length) c[trueLen] = '\0';
        // now starting from end
        for (int i = trueLen - 1; i >= 0; i--) {
            if (c[i] == ' ') {
                c[index - 1] = '0';
                c[index - 2] = '2';
                c[index - 3] = '%';
                index -= 3;

            } else {
                c[index - 1] = c[i];
                index--;
            }
        }

        return new String(c);
    }
}
