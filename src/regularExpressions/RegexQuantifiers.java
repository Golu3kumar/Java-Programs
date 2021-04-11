package regularExpressions;

import java.util.regex.Pattern;

public class RegexQuantifiers {
    public static void main(String[] args) {
        //Regex Quantifies : It specify how many times the character sequence occur
        /*
        * x? : x occurs only once
        * x+ : x occurs more than one times
        * x* : x occurs zero or more times
        * x{n} : x occurs n times only
        * x{n,} : x occurs n or more times only
        * x{n,k} : x occurs at least n times but less than k times
        * */

        System.out.println(Pattern.matches("[xyz]?","x"));//true
        System.out.println(Pattern.matches("[xyz]?","w"));//false
        System.out.println(Pattern.matches("[xyz]?","xyz"));//false

        System.out.println(Pattern.matches("[xyz]+","xyzxyz"));//true
        System.out.println(Pattern.matches("[xyz]+","yy"));//true
        System.out.println(Pattern.matches("[xyz]+","yz"));//true
        System.out.println(Pattern.matches("[xyz]+","yzkdk"));//false

        System.out.println(Pattern.matches("[xyz]*","xyxyxyxy"));//true
        System.out.println(Pattern.matches("[xyz]*","zxy"));//true
        System.out.println(Pattern.matches("[xyz]*","abc"));//false

        System.out.println(Pattern.matches("[xyz]{3,}","xxxxyyyyyyyyyy"));//true
        System.out.println(Pattern.matches("[xyz]{3,4}","xyz"));//true
        System.out.println(Pattern.matches("[xyz]{3}","xyzx"));//false
    }
}
