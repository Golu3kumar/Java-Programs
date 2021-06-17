package data_structure.LinkedList;

// Doubly linked list : It has three parts of node as like "previous -> data -> next"
// previous part contain address of previous node, data part contains item to be stored and
// next part contain address of next node.
// this is called two way linked list.
// we can traverse in both direction forward and also backward.\

public class DoublyLinkedList {

    private DoublyNode head;
    private DoublyNode tail;
    private int length;

    private class DoublyNode {

        int data;
        DoublyNode previous;
        DoublyNode next;

        public DoublyNode(int data) {
            this.data = data;
            previous = null;
            next = null;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int length() {
        return length;
    }

    public void printForward() {
        if (head == null)
            return;
        DoublyNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    public void printBackward() {
        if (tail == null)
            return;
        DoublyNode currNode = tail;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.previous;
        }
        System.out.println("null");
    }

    public void insertNodeAtBeginning(int val) {
        DoublyNode newNode = new DoublyNode(val);
        if (isEmpty())
            tail = newNode;
        else
            head.previous = newNode;
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertNodeAtEnd(int value) {
        DoublyNode newNode = new DoublyNode(value);
        if (isEmpty())
            head = newNode;
        else
            tail.next = newNode;

        newNode.previous = tail;
        tail = newNode;
        length++;
    }

    public DoublyNode deleteAtBeginning() throws Exception {
        if (isEmpty())
            throw new Exception("Empty list.");
        DoublyNode temp = head;

        if (head == tail)
            tail = null;
        else
            head.next.previous = null;
        head = head.next;
        temp.next = null;
        length--;
        return temp;


    }

    public DoublyNode deleteAtEnd() throws Exception{
        if (isEmpty())
            throw new Exception("List is empty.");
        DoublyNode temp = tail;
        if (head == tail)
            head = null;
        else
            tail.previous.next = null;

        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {

        DoublyLinkedList dLL = new DoublyLinkedList();
        // inserting data
        dLL.insertNodeAtEnd(5);
        dLL.insertNodeAtEnd(1);
        dLL.insertNodeAtEnd(10);
        dLL.insertNodeAtEnd(90);
        dLL.insertNodeAtEnd(3);

        // printing data forward
        System.out.println("Forward List : ");
        dLL.printForward();
        // printing data backward
        System.out.println("Backward List : ");
        dLL.printBackward();

        // inserting nodes in the beginning
        dLL.insertNodeAtBeginning(11);
        dLL.insertNodeAtBeginning(56);
        // print newly created list
        dLL.printForward();
        System.out.println("Length of list : " + dLL.length());
        try {
            System.out.println("Deleted node at beginning : " +dLL.deleteAtBeginning().data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("New list after deletion : ");
        dLL.printForward();

        try{
            System.out.println("Deleted node at end : "+dLL.deleteAtEnd().data);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("New list after deletion : ");
        dLL.printForward();


    }
}
