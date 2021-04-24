package data_structure.challenges;

import java.util.Scanner;
import java.util.Stack;

public class ParenthesisValidator {
    // Parenthesis : The special Character which has opening and closing tag
    // Like -> { curly braces } , ( parenthesis braces ), [ big bracket ], < Angular Bracket >

    // So this program checks whether the string contains complete pairs of the parenthesis or not.
    // Sample Input :
    // 2 // no. of inputs
    // {[]()} // valid
    // {{{]}}} // invalid

    // Sample Output :
    // valid
    // invalid

    // let's crack it.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no. of string : ");
        int n = scanner.nextInt();

        while (n-- != 0) {
            String data = scanner.next();
            Stack<Character> stack = new Stack<>();

            boolean isBalanced = true;
            for (int i = 0; i < data.length(); i++) {
                char c = data.charAt(i);

                if (c == '{' || c == '(' || c == '[' || c == '<') {
                    stack.push(c);
                    continue;
                }
                if (stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                if (c == '}') {
                    if (stack.peek() == '{')
                        stack.pop();
                    else {
                        isBalanced = false;
                        break;
                    }
                }
                if (c == ']'){
                    if (stack.peek() == '[')
                        stack.pop();
                    else {
                        isBalanced = false;
                        break;
                    }
                }
                if (c == ')') {
                    if (stack.peek() == '(')
                        stack.pop();
                    else {
                        isBalanced = false;
                        break;
                    }
                }
                if (c == '>'){
                    if (stack.peek() == '<')
                        stack.pop();
                    else {
                        isBalanced = false;
                        break;
                    }
                }


            }

            if (isBalanced)
                System.out.println("Balanced");
            else
                System.out.println("Not balanced");

        }
    }
}
