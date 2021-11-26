package data_structure.challenges;


import java.util.ArrayList;
import java.util.EmptyStackException;

class Plate {
    Plate above;
    Plate below;
    int data;

    public Plate(int data) {
        this.data = data;
        above = below = null;
    }

}

class SetOfPlates {  // a single stack
    private final int capacity;
    public Plate top, bottom;
    public int size = 0;

    public SetOfPlates(int capacity) {
        this.capacity = capacity;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void join(Plate above, Plate below) {
        if (below != null) below.above = above;
        if (above != null) above.below = below;
    }

    public boolean push(int data) {
        if (size >= capacity)
            return false;
        size++;
        Plate newPlate = new Plate(data);
        if (size == 1) bottom = newPlate;
        join(newPlate, top);
        top = newPlate;
        return true;
    }

    public int pop() {
        Plate tp = top;
        top = top.below;
        size--;
        return tp.data;
    }

    public int removeBottom() {
        Plate btm = bottom;
        bottom = bottom.above;
        if (bottom != null) bottom.below = null;
        size--;
        return btm.data;
    }
}

public class SetOfStacks {
    // welcome back
    // I don't know how I write comments for this question because it's too hard!.
    // But remember I am not one....

    // Let's go, so imagine a stack of plates. If the stack gets too high, it might topple.
    // Therefore in real life, we would likely start a new stack when the previous stack
    // exceeds some threshold. Implement a data structure SetOfStacks that mimics this.
    // SetOfStack.push() and .pop() should behave identically to a single stack.
    // FOLLOW UP :
    // implement a function popAt(int index) which perform a pop operation on a specific sub-stack
    // Oh.... It's too much.
    // firstly we create a SetOfPlates class that has some special feature for this problem
    // Plates class is just like Doubly Linked List

    // Now we have ArrayList of SetOfPlates
    ArrayList<SetOfPlates> stacks = new ArrayList<>();
    int capacity;

    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public void push(int data) {
        SetOfPlates lastSet = getLastSet();
        if (lastSet != null && !lastSet.isFull()) {
            lastSet.push(data);
        } else {
            SetOfPlates newSet = new SetOfPlates(capacity);
            newSet.push(data);
            stacks.add(newSet);
        }
    }

    public int pop() {
        SetOfPlates lastSet = getLastSet();
        if (lastSet == null) throw new EmptyStackException();
        int poppedPlate = lastSet.pop();
        if (lastSet.size == 0) stacks.remove(stacks.size() - 1);
        return poppedPlate;
    }

    private SetOfPlates getLastSet() {
        if (stacks.size() != 0) {
            return stacks.get(stacks.size() - 1);
        }
        return null;
    }

    // the main issue implement popAt() method
    public int popAt(int index) throws Exception {
        if (index > stacks.size() - 1)
            throw new Exception("Set of Plates is empty");
        return popHelper(index, true);
    }

    private int popHelper(int index, boolean removeTop) {
        SetOfPlates setOfPlates = stacks.get(index);
        int item_removed;
        if (removeTop) item_removed = setOfPlates.pop();
        else item_removed = setOfPlates.removeBottom();
        if (setOfPlates.isEmpty())
            stacks.remove(index);
        else if (stacks.size() > index + 1) {
            int v = popHelper(index + 1, false);
            setOfPlates.push(v);
        }
        return item_removed;
    }

    public static void main(String[] args) throws Exception {

        SetOfStacks sos = new SetOfStacks(10);
        for (int i = 1; i <= 25; i++) {
            sos.push(i);
        }

        // now popping one plate from set
        sos.popAt(1);
        // now printing the SetOfStack
        int count = sos.stacks.size();
        for (int i = count - 1; i >= 0; i--) {
            SetOfPlates setOfPlates = sos.stacks.get(i);
            Plate curr = setOfPlates.top;
            System.out.println("Set No. : " + count);
            while (curr != null) {
                System.out.println("Plate No. : " + curr.data);
                curr = curr.below;
            }
            count -= 1;
        }


    }

}
