package data_structure.challenges;

import java.util.EmptyStackException;

public class OneArrayMultipleStack {
    // No Comments! (Sorry)

    int numOfStack;
    int stackCapacity;
    int[] sizes;
    int[] values;

    public OneArrayMultipleStack() {
        this(3, 4);  // default calling.
    }

    public OneArrayMultipleStack(int numOfStack, int stackSize) {
        this.numOfStack = numOfStack;
        this.stackCapacity = stackSize;
        sizes = new int[numOfStack];
        values = new int[numOfStack * stackSize];
    }

    public void push(int stackNum, int value) throws Exception {
        if (isFull(stackNum)) throw new Exception("Stack Overflow: " + stackNum);

        // increase the top of stackNum
        sizes[stackNum]++;
        // pushing value on the top of the stackNum
        values[indexOfTop(stackNum)] = value;
    }

    public int pop(int stackNum) {
        if (isEmpty(stackNum)) throw new EmptyStackException();
        int topIndex = indexOfTop(stackNum);
        int value = values[topIndex];
        values[topIndex] = 0;
        sizes[stackNum]--;
        return value;
    }

    public int peek(int stackNum) {
        if (isEmpty(stackNum)) throw new EmptyStackException();
        return values[indexOfTop(stackNum)];
    }

    private int indexOfTop(int stackNum) {
        int offset = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offset + size - 1;
    }

    private boolean isFull(int stackNum) {
        return sizes[stackNum] == stackCapacity;
    }

    private boolean isEmpty(int stackNum) {
        return sizes[stackNum] == 0;
    }


    public static void main(String[] args) throws Exception {

        OneArrayMultipleStack oats = new OneArrayMultipleStack(2,4);
        oats.push(0,5);
        oats.push(1,4);
        oats.push(0,1);
        oats.push(1,1);
        oats.push(0,9);

        System.out.println("Stack top of 0: "+oats.peek(0)); // Expected : 9
        System.out.println("Stack top of 1: "+oats.peek(1)); // Expected : 1

        oats.push(0,6);
        // oats.push(0,8); creates overflow
        System.out.println(oats.peek(0));
        oats.pop(0);
        System.out.println(oats.peek(0));
    }
}
