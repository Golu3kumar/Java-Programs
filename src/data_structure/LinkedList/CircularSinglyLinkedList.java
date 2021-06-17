package data_structure.LinkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {

    private CircularList lastNode;
    private int length;

    private class CircularList {
        private CircularList next;
        private int data;

        public CircularList(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CircularSinglyLinkedList() {
        this.length = 0;
        this.lastNode = null;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    public void insertAtEnd(int val) {
        CircularList newNode = new CircularList(val);
        if (isEmpty()) {
            lastNode = newNode;
            lastNode.next = lastNode;
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
            lastNode = newNode;
        }
        length++;
    }

    public void insertAtBeginning(int val) {
        CircularList newNode = new CircularList(val);
        if (isEmpty())
            lastNode = newNode;
        else
            newNode.next = lastNode.next;
        lastNode.next = newNode;
        length++;
    }

    public CircularList deleteFirst() {
        if (isEmpty())
            throw new NoSuchElementException("Empty list");
        CircularList head = lastNode.next;
        if (lastNode.next == lastNode)
            lastNode = null;
        else
            lastNode.next = head.next;
        head.next = null;
        length--;
        return head;
    }

    public CircularList deleteLast() {
        if (isEmpty())
            throw new NoSuchElementException("Empty list.");

        CircularList tempLast = lastNode;
        CircularList head = lastNode.next;
        if (lastNode.next == lastNode) {
            lastNode = null;
        } else {
            while (head.next != lastNode) {
                head = head.next;
            }

            head.next = lastNode.next;
            lastNode = head;
        }
        length--;
        return tempLast;
    }

    public void printNode() {
        if (lastNode == null)
            return;

        CircularList head = lastNode.next;
        while (head != lastNode) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.print(head.data+" -> ");
        System.out.println(lastNode.next.data);
    }


    public static void main(String[] args) {

        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();

        csll.insertAtEnd(5);
        csll.insertAtBeginning(2);
        csll.insertAtEnd(90);
        csll.insertAtBeginning(45);
        csll.insertAtEnd(87);

        csll.printNode();
        System.out.println("Length : " + csll.getLength());

        csll.deleteFirst();
        System.out.println("After deleting first node : ");
        csll.printNode();

        csll.deleteLast();
        System.out.println("After deleting last node : ");
        csll.printNode();
        System.out.println("Now! Length is : "+csll.getLength());
    }


}
