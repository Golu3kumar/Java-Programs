package regularExpressions;

import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

    public static void main(String[] args) {
        // Pattern : A Pattern is java class that describe the pattern by which the input is to be matched.
        // it compiles the given pattern internally.
        Pattern pattern = Pattern.compile(".@."); // dot(.) is for anything before @ and after @ is valid
        // but its length should be 1
        // Matcher : A Matcher is a java class that matches the given input to the Pattern.
        Matcher matcher = pattern.matcher("g@b"); // should return true
        Matcher matcher1 = pattern.matcher("g@gk"); // should return false
        Matcher matcher2 = pattern.matcher("gg@gk"); // should return false

        System.out.println("Email is valid : "+matcher.matches());

        // the above code can also be written as
        System.out.println(Pattern.matches(".@.","g@k"));

    }
}
