package data_structure.challenges;

public class StringPalindrome {


    static boolean isPalindrome(String text) {

        if (text.isEmpty())
            return false;
        StringBuilder tempResult = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            char tempChar = text.charAt(i);
            tempResult.append(tempChar);
        }

        return tempResult.toString().equals(text);
    }

    public static void main(String[] args) {


        String original = "GaaG";
        System.out.println(original+" is palindrome ? : "+isPalindrome(original));
        System.out.println("golu is palindrome ? : "+isPalindrome("golu"));
        System.out.println("madam is palindrome ? : "+isPalindrome("madam"));

    }
}
