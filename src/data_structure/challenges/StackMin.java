package data_structure.challenges;

import java.util.Stack;


public class StackMin extends Stack<Integer> {

    // so this problem is very simple we have an stack that has an addition method min() that return
    // the minimum element of that stack. Pretty simple Hold on!
    // The condition is we have to get this minimum value in O(1) time. Bang! this is the Question.
    // let's do it!

    // So we have an addition stack that keep the min value while push a new element into the original stack
    Stack<Integer> minStack;

    public StackMin() {
        minStack = new Stack<>();
    }

    public void push(int value){
        if (value <= min()){
            minStack.push(value);
        }
        // calling super method to push value in original stack.
        super.push(value);
    }

    public Integer pop(){
        int value = super.pop();
        if (value == min()){
            minStack.pop();
        }
        return value;
    }

    public Integer peek(){
        if (super.isEmpty()) return null;
        return super.peek();
    }

    private int min() {
        if (minStack.isEmpty()) return Integer.MAX_VALUE;
        return minStack.peek();
    }

    public static void main(String[] args) {

        StackMin stkMin = new StackMin();
        stkMin.push(5);
        stkMin.push(6);
        System.out.println(stkMin.min());  // 5
        stkMin.push(3);
        System.out.println(stkMin.min()); // 3
        stkMin.push(7);
        stkMin.pop();
        stkMin.pop();
        System.out.println(stkMin.min());  // 5
        
        // that's good!
    }
}
