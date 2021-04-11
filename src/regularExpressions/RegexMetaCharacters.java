package regularExpressions;

import java.util.regex.Pattern;

public class RegexMetaCharacters {
    public static void main(String[] args) {
        //MetaCharacters are the shortcuts used in Regular expression
        /*
        *  . : It can be any character of length 1
        *  \\d : Represents any digits
        *  \\D : Represents any non digits
        *  \\s : Represents any white spaces
        *  \\S : Non white spaces
        *  \\w : Word character
        *  \\W : non Word character
        *  \\b : word boundary
        *  \\b : non word boundary
        * */

        System.out.println(Pattern.matches("\\d","9"));//true
        System.out.println(Pattern.matches("\\d","a"));//false
        System.out.println(Pattern.matches("\\d+","22"));//true

        System.out.println(Pattern.matches("\\D","s"));//true
        System.out.println(Pattern.matches("\\D","3"));//false
        System.out.println(Pattern.matches("\\D*","sdf"));//true
        System.out.println(Pattern.matches("\\D\\d","d9"));//true

        System.out.println(Pattern.matches("\\s"," "));//true
        System.out.println(Pattern.matches("\\s","  "));//false
        System.out.println(Pattern.matches("\\s*","    "));//true


    }
}
