package data_structure.StringProblems;

public class LongestPalindrome {

    static int resultLength = 0;
    static int resultStart = 0;
    public static void main(String[] args) {

        String str = "aaaabbaa";
        String longest = longestPalindrome(str);
        System.out.println(longest);
    }

    static String longestPalindrome(String str) {

        if (str.length() < 2)
            return str;

        for (int i = 0; i < str.length(); i++) {
            expand(str,i,i);
            expand(str,i,i+1);
        }

        return str.substring(resultStart, resultStart + resultLength);
    }

    private static void expand(String str, int begin, int end){
        while (begin >= 0 && end < str.length() && str.charAt(begin) == str.charAt(end)){
            begin--;
            end++;
        }
        if (resultLength < end - begin - 1){
            resultStart = begin + 1;
            resultLength = end - begin -1;
        }
    }
}
