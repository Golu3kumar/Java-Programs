package data_structure.challenges;

import java.util.Random;
import java.util.Stack;

// hard to understand
public class SortStack {
    Stack<Integer> s;

    public SortStack() {
        this.s = new Stack<>();
    }

    // add some data into the stack
    void add() {
        Random rand = new Random();
        int data;
        for (int i = 0; i < 10; i++) {
            data = rand.nextInt(100);
            s.add(data);
        }
    }

    void sort(Stack<Integer> stack) {
        Stack<Integer> res = new Stack<>();
        while (!stack.isEmpty()) {
            int temp = stack.pop();
            while (!res.isEmpty() && res.peek() > temp) {
                stack.push(res.pop());
            }
            res.push(temp);
        }
        while (!res.isEmpty())
            stack.push(res.pop());
    }

    public static void main(String[] args) {

        SortStack sortStack = new SortStack();
        sortStack.add();
        for (Integer data : sortStack.s) {
            System.out.print(data + " ");
        }
        sortStack.sort(sortStack.s);
        System.out.println();
        for (Integer data : sortStack.s) {
            System.out.print(data + " ");
        }
    }
}
