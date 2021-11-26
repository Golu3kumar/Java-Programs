package data_structure.StringProblems;

import java.util.ArrayList;
import java.util.List;


public class StringPermutations {

    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        String str = "ABC";
        findAllPermutation(str,0,str.length()-1);

        for (String permutation : result) {
            System.out.print(permutation + " ");
        }
    }

    // time complexity = O(n*n!) very high
    public static void findAllPermutation(String str, int l, int r) {

        if (l == r)
            result.add(str);
        else {


            for (int i = l; i <= r ; i++) {
                str = swap(str,l,i);
                findAllPermutation(str,l+1,r);
                str = swap(str,l,i);
            }
        }
    }

    private static String swap(String str,int i, int j){
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
