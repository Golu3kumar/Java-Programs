package data_structure.LinkedList;

// Linked List : Linked List is a linear data structure that store data in the form of nodes.
// linked list is a collection of similar type of node called data node.
// It also has nodes that store address of next node, it means points to next node.
// Finally it has two types of nodes one for storing data and another for pointing to next node.

// Singly Linked List : It is a type of Linked list that is collection of nodes
// having two parts data parts and pointer parts.
// It has head node that always points to first node of the linked list.
// It's last node(Pointer part) always contain null.
// Representation : head -> 10 -> 1 -> 12 - > 4 -> null
// let's see the demo

import java.util.Scanner;

// Node class
class Node<T> {
    T data;
    Node<T> next;

    public Node(T data) {
        this.data = data;
        next = null;
    }
}

public class SinglyLinkedList<T> {
    Node<T> head;

    public int getLength() {
        int count = 0;
        Node<T> current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    public void printNode() {
        // creating temp reference of head node
        Node<T> temp = head;
        while (temp != null) {
            // printing node address with their data.
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println((Object) null);
    }

    public boolean addNodeAtBeginning(T data) {
        try {
            Node<T> newNode = new Node<T>(data);
            newNode.next = head;
            head = newNode;
            return true;
        } catch (Exception ignore) {
            return false;
        }
    }

    public boolean addNodeAtEnd(T data) {
        try {
            Node<T> newNode = new Node<T>(data);
            Node<T> temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            return true;
        } catch (Exception ignore) {
            return false;
        }
    }

    public boolean addNodeAtPosition(int position, T data) {
        try {
            int currentPos = 1;
            Node<T> current = head;
            Node<T> newNode = new Node<T>(data);
            // if position is 1
            if (position == 1) {
                newNode.next = current;
                head = newNode;
                return true;
            }
            if (position > (getLength() + 1)) {
                System.out.println("Position is greater than list");
                return false;
            }
            Node<T> temp = null;
            while (currentPos < position && current != null) {
                temp = current;
                current = current.next;
                currentPos++;
            }
            assert temp != null;
            temp.next = newNode;
            newNode.next = current;
            return true;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return false;
        }
    }

    public void reverseLinkedList() {
        Node<T> previousNode, nextNode, currentNode;
        previousNode = nextNode = null;
        currentNode = head;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;

        }
        head = previousNode;

    }

    public void deleteNodeAt(int pos) {
        Node<T> currNode = head;
        if (pos == 1)
            head = head.next;
        else {
            int count = 1;
            Node<T> temp = null;
            while (count < pos && currNode != null) {
                temp = currNode;
                currNode = currNode.next;
                count++;
            }

            temp.next = currNode.next;

        }

    }

    public Boolean searchNode(T searchData) {
        Node<T> currNode = head;

        while (currNode != null) {
            if (currNode.data == searchData)
                return true;
            currNode = currNode.next;
        }
        return false;
    }

    public Node<T> findMiddleNode(Node<T> headNode) {
        Node<T> slowPointer = headNode, fastPointer = headNode;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        return slowPointer;
    }

    //TODO : complete this function.
    public void sortTheLinkedList() {
        Node<T> currNode = head;
        int len = getLength();
        Node<T> tempNode = null;

    }

    public Node<T> getNodeFromLastAtPosition(int pos) {
        // we can also perform using HashMap.
        Node<T> refNode = head;
        Node<T> mainRef = head;
        int count = 0;
        while (count < pos) {
            refNode = refNode.next;
            count++;
        }
        while (refNode != null) {
            refNode = refNode.next;
            mainRef = mainRef.next;
        }
        return mainRef;
    }

    public boolean isListContainCycle() {
        Node<T> fastPointer = head, slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer)
                return true;
        }
        return false;
    }

    public Node<T> getStartingNodeIfTheLoop() {
        // first we check the list contain loop or not
        Node<T> fastPointer = head, slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer)
                return getStartingNode(slowPointer);

        }
        return null;
    }

    private Node<T> getStartingNode(Node<T> slowPointer) {
        Node<T> temp = head;
        while (temp != slowPointer) {
            slowPointer = slowPointer.next;
            temp = temp.next;
        }
        return temp;
    }

    public void removeLoopFromList() {
        // we again have to check whether the loop is or not
        Node<T> fastPointer = head, slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (fastPointer == slowPointer) {
                removeLoop(slowPointer);
                return;
            }
        }
    }

    private void removeLoop(Node<T> slowPointer) {
        Node<T> temp = head;
        while (temp.next != slowPointer.next) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        slowPointer.next = null;
    }



    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        // initializing head with first node
        sl1.head = new Node<>(10);
        // creating another nodes and set it's data part
        Node<Integer> second = new Node<>(1);
        Node<Integer> third = new Node<>(12);
        Node<Integer> fourth = new Node<>(4); // 10 -> 1 -> 12 -> 4 -> null
        // creating chain between nodes
        // storing address of next node in the next pointer
        sl1.head.next = second;
        second.next = third;
        third.next = fourth;
        //fourth.next = second;  // To form loop in the list.


        // getting length of Linked List
        //System.out.println("Length of Linked List = " + sl1.getLength());

        // printing all data of nodes
        System.out.println("Linked List display data : ");
        sl1.printNode();

        // adding new data at beginning of linked list
        System.out.println("Adding new data is successful ? : " + sl1.addNodeAtBeginning(50));
        System.out.println("After adding new data at beginning : ");
        sl1.printNode();

        // adding new Data at the end of linked list
        System.out.println("Adding new data is successful ? : " + sl1.addNodeAtEnd(40));
        System.out.println("After adding new data at end : ");
        sl1.printNode();

        // adding new Data at the 2nd pos of linked list
        System.out.println("Adding new data is successful ? : " + sl1.addNodeAtPosition(1, 3));
        System.out.println("After adding new data at pos 2nd : ");
        sl1.printNode();

        sl1.reverseLinkedList();
        sl1.printNode();

        sl1.deleteNodeAt(1);
        sl1.printNode();

        System.out.println("Is 10 available ? : " + sl1.searchNode(10));

        sl1.addNodeAtPosition(2, 20);

        sl1.printNode();
        System.out.println("Middle node of linked list : " + sl1.findMiddleNode(sl1.head).data); // 10

        System.out.println("note at pos 3 from last : " + sl1.getNodeFromLastAtPosition(3).data);//

        System.out.println("Is list contain loop? : " + sl1.isListContainCycle());

        Node<Integer> startingNode = sl1.getStartingNodeIfTheLoop();
        if (startingNode == null)
            System.out.println("This list doesn't contain loop!");
        else {
            System.out.println("Starting node of the loop is : " + startingNode.data);
            System.out.println("Removing loop from List : ");
            sl1.removeLoopFromList();
            sl1.printNode();
        }


    }
}
