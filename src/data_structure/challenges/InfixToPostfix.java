package data_structure.challenges;


import java.util.Scanner;

class Stack {

    char[] arr = new char[100]; //len is 100;
    int top = -1;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isOverflow() {
        return top == 100;
    }

    public char pop() {
        return arr[top--];
    }

    public char peek() {
        return arr[top];
    }

    public void push(char c) {
        if (isOverflow())
            throw new StackOverflowError();
        arr[++top] = c;
    }


}

public class InfixToPostfix {
    // Infix Expression : Infix expressions are those expressions in which the operator is written
    // in-between the two or more operands. Usually, we use infix expression.
    // EX =  a+b, a-b^(c*d)*e

    // Postfix Expression : Postfix expressions are those expressions in which the operator is written after their operands.
    // EX = ab+, //TODO : write postfix.
    // Prerequisite : Learn operator precedence and Associativity, and rules for infix to postfix using Stack :>

    // let's start
    // we can use Stack build in class but we gonna create our own now.


    public static void main(String[] args) {

        String infix;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter infix expression : ");
        infix = sc.nextLine();

        System.out.println("Postfix expression : " + toPostfix(infix));
        String prefixReverse = toPostfix(new StringBuilder(infix).reverse().toString());
        String prefix = new StringBuilder(prefixReverse).reverse().toString();
        System.out.println("Prefix expression : "+prefix);
    }

    private static String toPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack stack = new Stack();
        char symbol;
        for (int i = 0; i < infix.length(); i++) {
            symbol = infix.charAt(i);

            if (Character.isLetter(symbol) || Character.isDigit(symbol))
                postfix.append(symbol);

            else if (symbol == '(')
                stack.push(symbol);

            else if (symbol == ')') {
                while (stack.peek() != '(')
                    postfix.append(stack.pop());
                stack.pop();
            } else {
                while (!stack.isEmpty() && !(stack.peek() == '(') && prec(symbol) <= prec(stack.peek()))
                    postfix.append(stack.pop());
                stack.push(symbol);
            }
        }

        while (!stack.isEmpty())
            postfix.append(stack.pop());
        return postfix.toString();
    }

    private static int prec(char symbol) {
        if (symbol == '+' || symbol == '-')
            return 1;
        if (symbol == '*' || symbol == '/' || symbol == '%')
            return 2;
        if (symbol == '^')
            return 3;

        return 0;
    }

}
