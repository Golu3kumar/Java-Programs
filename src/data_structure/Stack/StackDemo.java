package data_structure.Stack;

import java.util.Scanner;

public class StackDemo {

    public static final int MAX_SIZE = 50;
    private int top = -1;
    private static int counter;
    private String[] text = new String[MAX_SIZE];

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top;
    }

    public boolean isOverflow() {
        return top == MAX_SIZE;
    }

    public void undo() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        top--;
        counter++;

    }

    public void redo() {
        if (isOverflow()) {
            System.out.println("Stack Overflow");
            return;
        }
        if (counter > 0) {
            top++;
            counter--;
        } else
            System.out.println("Sorry!, you don't have redo");
    }

    public void add() {
        if (isOverflow()) {
            System.out.println("Stack Overflow!");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print(":>");
        String newText = sc.nextLine();
        text[++top] = newText;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(text[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        StackDemo stackDemo = new StackDemo();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the notepad !");
        while (true) {
            System.out.println("1. Add new text");
            System.out.println("2. Undo");
            System.out.println("3. Redo");
            System.out.println("4. Print");
            System.out.println("5. Exit");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    stackDemo.add();
                    break;
                case 2:
                    stackDemo.undo();
                    break;
                case 3:
                    stackDemo.redo();
                    break;
                case 4:
                    stackDemo.print();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
        }
    }
}
