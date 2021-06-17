package data_structure.challenges;


import java.util.EmptyStackException;

public class StackUsingLinkedList {

    private ListNode top;
    private int length;
    private static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop(){
        if (isEmpty())
            throw new EmptyStackException();

        int data = top.data;
        top = top.next;
        length--;
        return data;
    }

    public void print(){
        if (isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        ListNode curr = top;
        System.out.println("top -> ");
        while (curr!=null){
            System.out.println(curr.data+" -> ");
            curr = curr.next;
        }
    }

    public int peek() throws Exception {
        if (isEmpty())
            throw new Exception("Stack Empty");

        return top.data;
    }

    public static void main(String[] args) {

        StackUsingLinkedList sll = new StackUsingLinkedList();
        sll.push(8);
        sll.push(3);
        sll.push(4);

        sll.print();

        System.out.println("Popping item : "+sll.pop());
        System.out.println("After popping : ");
        sll.print();

        try {
            System.out.println("Top element : "+sll.peek());
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
