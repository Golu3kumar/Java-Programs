package data_structure.challenges;

public class Palindrome {

    public static void main(String[] args) {

        int num = 151;

        int rev = rev(num);
        System.out.println("Reverse = "+rev);
        if (rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    private static int rev(int num) {
        int rev = 0, rem = 0;

        while (num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }
    
}
