package data_structure.challenges;

import java.util.Arrays;
import java.util.Collections;

public class Rev {
    public static void main(String[] args) {
        String s = "my name is kuldeep";
        String[] v = s.split(" ");
       // System.out.println(v[0]);
        String rev = "";
        for (int i = 0; i < v.length; i++) {
            String str = v[i];
            //
            v[i] = reverseString(v[i]);

        }
        for (String e: v) {
            System.out.print(e+" ");
        }

    }

    private static String reverseString(String s) {

        return null;
    }
}
