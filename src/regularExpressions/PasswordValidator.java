package regularExpressions;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {
    public static boolean isPasswordValid(String input){
        String passPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^*+=])(?=\\S+$).{8,20}$";
        return Pattern.compile(passPattern).matcher(input).matches();
    }
    public static void main(String[] args) {
        System.out.println("Welcome to PasswordValidator : ");

        System.out.println("Enter a Password(length of 8 or above) that contains : \n" +
                "at least one digit\nat least one special character\nat least one capital letter");

        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();

        if (isPasswordValid(password)) {
            System.out.println("Password is valid and strong");
            System.exit(1);
        }
        else{
            System.out.println("Password is not valid ");
        }

    }
}
