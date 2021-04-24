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

// Node class
class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data = data;
        next = null;
    }
}
public class SinglyLinkedList {
    Node<Integer> head;

    public int getLength(Node<Integer> headNode){
        int count = 0;
        Node<Integer> current = headNode;
        while (current!=null){
            count++;
            current = current.next;
        }

        return count;
    }

    public void printNode(Node<Integer> headNode){
        // creating temp reference of head node
        Node<Integer> temp = headNode;
        while (temp!=null){
            // printing node address with their data.
            System.out.println(temp + " -> "+temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sl1 = new SinglyLinkedList();
        // initializing head with first node
        sl1.head = new Node<Integer>(10);
        // creating another nodes and set it's data part
        Node<Integer> second = new Node<>(1);
        Node<Integer> third = new Node<>(12);
        Node<Integer> fourth = new Node<>(4);

        // creating chain between nodes
        // storing address of next node in the next pointer
        sl1.head.next = second;
        second.next = third;
        third.next = fourth;

        System.out.println("Length of Linked List = "+sl1.getLength(sl1.head));

        System.out.println("Linked List display data : ");
        sl1.printNode(sl1.head);


    }
}
