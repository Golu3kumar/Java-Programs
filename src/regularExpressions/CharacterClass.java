package regularExpressions;

import java.awt.*;
import java.util.regex.Pattern;

public class CharacterClass {
    public static void main(String[] args) {
        // Characters class are the Patterns classes
        // ^[a-z0-9_-]{2,9}$
        /* where ^ : starting of pattern(negation : not included)
        *  [a-z0-9_-] : letters,numbers,underscores,hyphens
        * {2-9}:2 to 9 character length
        * $ : end of the line
        * */

        //[abc] : either a or b or c (length should be one)
        System.out.println(Pattern.matches("[abc]","a")); //true
        System.out.println(Pattern.matches("[abc]","")); //false
        System.out.println(Pattern.matches("[abc]","bc")); //false
        System.out.println(Pattern.matches("[abc]","b")); //true
        System.out.println(Pattern.matches("[abc]","abc")); //false

        //[^abc] : anything except a or b or c(negation)(Length should be one)

        System.out.println(Pattern.matches("[^abc]","a"));//false
        System.out.println(Pattern.matches("[^abc]","d"));//true
        System.out.println(Pattern.matches("[^abc]","de"));//false
        System.out.println(Pattern.matches("[^abc]","abc"));//false

        //[a-zA-Z] : a through z or A through (Length should be one)

        System.out.println(Pattern.matches("[a-zA-Z]","a"));//true
        System.out.println(Pattern.matches("[a-zA-Z]","aA"));//false
        System.out.println(Pattern.matches("[a-zA-Z]","A"));//true
        System.out.println(Pattern.matches("[a-zA-Z]*","Za"));//true

        //[a-z&&[def]] : d,e or f(intersection)
        System.out.println(Pattern.matches("[a-z&&def]","a"));//false
        System.out.println(Pattern.matches("[a-z&&def]","d"));//true
        System.out.println(Pattern.matches("[a-e&&def]","f"));//false
        System.out.println(Pattern.matches("[a-z&&def]","e"));//true


    }
}
