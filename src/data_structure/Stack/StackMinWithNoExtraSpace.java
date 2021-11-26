package data_structure.Stack;

import java.util.EmptyStackException;
import java.util.Stack;


// idea is not simple as we think
public class StackMinWithNoExtraSpace extends Stack<Integer> {

    private int min = Integer.MAX_VALUE;
    public void push(int i){
        if (this.isEmpty()){
            super.push(i);
            min = i;
        }else if(i >= getMin())
            super.push(i);
        else {
            super.push(2 * i - getMin());
            min = i;
        }

    }

    public Integer newPop(){
        if (this.isEmpty()) throw new EmptyStackException();

        else if(this.peek() >= getMin())
            return this.pop();

        else {
            int temp = min;
            min = 2 * min - this.peek();
            this.pop();
            return temp;
        }

    }
    public int getMin() {
        return min;
    }

    public static void main(String[] args) {
        StackMinWithNoExtraSpace stk = new StackMinWithNoExtraSpace();

        stk.push(8);
        System.out.println(stk.getMin());
        stk.push(10);
        stk.push(6);
        System.out.println(stk.getMin());
        stk.push(3);
        stk.push(7);

        System.out.println(stk.newPop());
        System.out.println(stk.getMin());
        System.out.println(stk.newPop());
        System.out.println(stk.getMin());
        System.out.println(stk.newPop());
        System.out.println(stk.getMin());
        System.out.println(stk.newPop());
        System.out.println(stk.getMin());

    }

}
