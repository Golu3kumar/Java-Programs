package regularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidator {
    public static boolean isEmailValidate(String input){
        String emailPattern = "^[A-Z0-9+._%-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
        return Pattern.compile(emailPattern,Pattern.CASE_INSENSITIVE).matcher(input).matches();
    }
    public static void main(String[] args) {
        System.out.println("Email validator!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Email : ");
        String email = scanner.nextLine();


        if (isEmailValidate(email)) {
            System.out.println("Email is correct");
        }else System.out.println("Email is incorrect");


    }
}
