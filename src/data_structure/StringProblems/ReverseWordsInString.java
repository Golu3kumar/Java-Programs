package data_structure.StringProblems;

import java.util.regex.Pattern;

public class ReverseWordsInString {


    public static void main(String[] args) {

        System.out.println(reverseWords("i.like.this.program.very.much"));
        System.out.println(reverseString("I.like.program"));

    }

    // Time complexity = O(n)
    static String reverseWords(String S)
    {
        // code here
        String[] splits = S.split("\\.",0);
        StringBuilder result = new StringBuilder("");
        for(int i = splits.length-1;i>=0;i--){
            result.append(splits[i]);
            if(i != 0)
                result.append(".");
        }
        return result.toString();

    }

    static String reverseString(String S){
        String pattern = "\\.";

        String[] splits = S.split(pattern);
        String result = "";

        for (int i = 0; i < splits.length; i++) {
            if (i == splits.length -1)
                result = splits[i] + result;
            else
                result = "." + splits[i] + result;
        }

        return result;


    }
}
