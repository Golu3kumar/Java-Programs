package data_structure.challenges;


import java.util.HashSet;
import java.util.Stack;

class LinkedListNode {
    int data;

    LinkedListNode next;

    public LinkedListNode(int data) {
        this.data = data;
        next = null;
    }

    public LinkedListNode() {
        next = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

// for Challenge 6(2)
class PartialSum {
    public int carry = 0;
    public LinkedListNode sum = null;
}

// for Challenge 8
class Result {
    int size;
    LinkedListNode tail;

    public Result(int size, LinkedListNode tail) {
        this.size = size;
        this.tail = tail;
    }
}

public class LinkedListChallenges {

    LinkedListNode head;

    LinkedListNode headA, headB;

    LinkedListNode headL1, headL2;

    public void createLinkedList() {
        LinkedListNode first = new LinkedListNode(3);
        LinkedListNode second = new LinkedListNode(5);
        LinkedListNode third = new LinkedListNode(8);
        LinkedListNode fourth = new LinkedListNode(5);
        LinkedListNode fifth = new LinkedListNode(10);
        LinkedListNode sixth = new LinkedListNode(2);
        LinkedListNode seven = new LinkedListNode(1);

        // creating link between nodes as :
        // head -> 3 -> 5 -> 10 -> 5 -> 8 -> 2 -> 1
        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seven;
    }

    public void createLinkedList(int num) {
        LinkedListNode firstA = new LinkedListNode(7);
        LinkedListNode secondA = new LinkedListNode(1);
        LinkedListNode thirdA = new LinkedListNode(6);
        LinkedListNode firstB = new LinkedListNode(5);
        LinkedListNode secondB = new LinkedListNode(9);
        LinkedListNode thirdB = new LinkedListNode(2);

        // linking of nodes for A
        firstA.next = secondA;
        secondA.next = thirdA;
        headA = firstA;
        // linking of nodes for B
        firstB.next = secondB;
        secondB.next = thirdB;
        headB = firstB;

    }

    private void createLinkedListForChallenge7() {
        LinkedListNode a = new LinkedListNode(3);
        LinkedListNode b = new LinkedListNode(1);
        LinkedListNode c = new LinkedListNode(5);
        LinkedListNode d = new LinkedListNode(9);
        LinkedListNode e = new LinkedListNode(7);
        LinkedListNode f = new LinkedListNode(2);
        LinkedListNode g = new LinkedListNode(1);

        LinkedListNode h = new LinkedListNode(4);
        LinkedListNode i = new LinkedListNode(6);

        // linking the nodes
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e; // intersect node
        e.next = f;
        f.next = g;

        headL1 = a;
        h.next = i;
        i.next = e; // intersect node.
        headL2 = h;

    }

    public void printNodes(LinkedListNode headNode) {
        if (headNode == null)
            return;

        while (headNode != null) {
            System.out.print(headNode.data + " -> ");
            headNode = headNode.next;
        }
    }
    // Now challenges start
    // Challenge 1 : Remove Duplicates from Unsorted Linked List.

    public void removeDuplicates(LinkedListNode headNode) {
        if (headNode == null)
            return;
        // We gonna use HashSet to store unique nodes
        // 1 -> 2 -> 3 -> 2 -> 1 -> null
        HashSet<Integer> buffer = new HashSet<>();
        LinkedListNode last = null;
        while (headNode != null) {
            if (buffer.contains(headNode.data)) {
                last.next = headNode.next;
            } else {
                buffer.add(headNode.data);
                last = headNode;
            }
            headNode = headNode.next;
        }
    }
    // Challenge 2 : Return Kth to Last element of a Linked List

    public int kthToLastElement(LinkedListNode headNode, int k) {
        if (headNode == null)
            return 0;
        int count = 0;
        LinkedListNode currNode = headNode;
        while (count < k - 1 && currNode != null) {
            currNode = currNode.next;
            count++;
        }
        while (currNode.next != null) {
            currNode = currNode.next;
            headNode = headNode.next;
        }

        return headNode.data;
    }
    // Challenge 3 : Delete Middle Node of Linked List

    public LinkedListNode deleteMiddleNode(LinkedListNode headNode) {
        if (headNode == null) // Edge case
            return null;
        LinkedListNode fastPointer = headNode;
        LinkedListNode slowPointer = headNode;
        LinkedListNode temp = null;
        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            temp = slowPointer;
            slowPointer = slowPointer.next;
        }
        if (temp != null)
            temp.next = slowPointer.next;
        return slowPointer;
    }
    // Challenge 4 : Delete Middle Node(Given Middle Node) without access of Head Node.
    // Note : Assume Middle Node is not Head and Last Node.

    public boolean deleteMiddle(LinkedListNode node) {
        if (node == null || node.next == null)
            return false;

        LinkedListNode next = node.next;
        node.data = next.data;
        node.next = next.next;
        return true;
    }
    // Challenge 5 : Partition of Linked List around a value x such that all nodes less than x come
    //               before all nodes greater than or equal to x.
    // value x may appear in the Linked list or not
    // Input : 3 -> 5 -> 10 -> 5 -> 8 -> 2 -> 1 [partition = 5]
    // Output : 3 -> 2 -> 1 -> 5 -> 5 -> 10 -> 8
    // let's do it

    public LinkedListNode partition(LinkedListNode headNode, int x) {
        if (headNode == null)
            return null;

        // create for Linked List
        LinkedListNode beforeStart = null;
        LinkedListNode beforeEnd = null;
        LinkedListNode afterStart = null;
        LinkedListNode afterEnd = null;

        while (headNode != null) {
            LinkedListNode next = headNode.next;
            headNode.next = null;
            if (headNode.data < x) {
                if (beforeStart == null) {
                    beforeStart = headNode;
                    beforeEnd = beforeStart;
                } else {
                    beforeEnd.next = headNode;
                    beforeEnd = headNode;
                }
            } else {
                if (afterStart == null) {
                    afterStart = headNode;
                    afterEnd = afterStart;
                } else {
                    afterEnd.next = headNode;
                    afterEnd = headNode;
                }
            }
            headNode = next;
        }

        // if beforeStart = null, return afterStart
        if (beforeStart == null)
            return afterStart;

        // merge both linked list
        beforeEnd.next = afterStart;
        return beforeStart;
    }
    // second approach of challenge 5
    // something difficult to understand.

    public LinkedListNode partition2(LinkedListNode headNode, int x) {
        LinkedListNode head = headNode;
        LinkedListNode tail = headNode;

        while (headNode != null) {
            LinkedListNode next = headNode.next;
            if (headNode.data < x) {
                headNode.next = head;
                head = headNode;
            } else {
                tail.next = headNode;
                tail = headNode;
            }
            headNode = next;
        }
        tail.next = null;
        return head;
    }
    // Challenge 6 : Two linked list where each node contains a single digit,
    //               The digits are stored in reverse order, such that the 1's digit is the head.
    // you have to add both numbers and return a linked list number
    // Input : (7 -> 1 -> 6) + (5 -> 9 -> 2). (That is 617 + 295 = 912)
    // Output : 2 -> 1 -> 9. (That is 912)
    // Let's do this (Is it lengthy?)

    public LinkedListNode sumLists() {
        // creating to linked list called headA and headB
        createLinkedList(2);
        if (headA == null || headB == null)
            return null;

        LinkedListNode headA = this.headA;
        LinkedListNode headB = this.headB;
        LinkedListNode sum = null;
        StringBuilder forA = new StringBuilder();
        StringBuilder forB = new StringBuilder();
        // processing A
        while (headA != null) {
            forA.append(headA.data);
            headA = headA.next;
        }
        // Processing B
        while (headB != null) {
            forB.append(headB.data);
            headB = headB.next;
        }

        int totalSumInt = Integer.parseInt(forA.reverse().toString()) + Integer.parseInt(forB.reverse().toString());
        System.out.println("Sum = " + totalSumInt);
        StringBuilder forSum = new StringBuilder(String.valueOf(totalSumInt));
        forSum.reverse();
        System.out.println(forSum);
        LinkedListNode temp;
        for (int i = 0; i < forSum.length(); i++) {
            int num = Integer.parseInt(String.valueOf(forSum.charAt(i)));
            temp = new LinkedListNode(num);
            if (sum == null) {
                sum = temp;
            } else {
                LinkedListNode tmp = sum;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                tmp.next = temp;
            }
        }

        return sum;

    }
    // second approach

    public LinkedListNode sumLists2() {
        // creating the linked list
        createLinkedList(2);
        if (headA == null || headB == null)
            return null;
        LinkedListNode headA = this.headA;
        LinkedListNode headB = this.headB;
        LinkedListNode result = null;
        int carry = 0;
        while (headA != null || headB != null || carry != 0) {

            int value = carry;
            if (headA != null) {
                value += headA.data;
            }
            if (headB != null) {
                value += headB.data;
            }
            LinkedListNode temp = new LinkedListNode(value % 10);
            if (result == null) {
                result = temp;
            } else {
                LinkedListNode temp2 = result;
                while (temp2.next != null) {
                    temp2 = temp2.next;
                }
                temp2.next = temp;
            }

            headA = headA == null ? null : headA.next;
            headB = headB == null ? null : headB.next;
            carry = value >= 10 ? 1 : 0;

        }
        return result;
    }
    // Challenge 6(2) : Two linked list where each node contains a single digit,
    //               The digits are stored in forward order, such that the 1's digit is the head.
    // you have to add both numbers and return a linked list number
    // Input : (7 -> 1 -> 6) + (5 -> 9 -> 2). (That is 716 + 592 = 1308)
    // Output : 1 -> 3 -> 0 -> 8. (That is 1308)
    // Let's do this (Is it lengthy?)
    // It's not easy as you think! (We can solve this just like sumList() method but we go through tricky one!)

    public LinkedListNode sumListForwardOrder() {
        createLinkedList(2);
        if (headA == null || headB == null) // I love to write the edge cases.(Failed case)
            return null;
        LinkedListNode headA = this.headA;
        LinkedListNode headB = this.headB;

        // get the length of each linked list.
        // this is because i some case one list is short for other list (See the example below)
        // Trust me I am not one that let you leave in the middle of the ocean!
        // (7 -> 1 -> 6) + (5 -> 9). In this case we need to know that the 5 should be matched with 2 not 7.
        // for this we need to padding the shorter list with 0 in the beginning. (Understand?)
        // now get the length of the lists
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        // Pad the shorter list with 0
        if (lenA > lenB) {
            headB = padLinkedList(headB, lenA - lenB); // padding headB with 0
        } else {
            headA = padLinkedList(headA, lenB - lenA); // padding headA with 0
        }
        PartialSum sum = addLinkedListHelper(headA, headB);
        // check there is carry or not
        if (sum.carry != 0) {
            sum.sum = insertBefore(sum.sum, sum.carry);
            return sum.sum;
        }
        return sum.sum;
    }

    private PartialSum addLinkedListHelper(LinkedListNode headA, LinkedListNode headB) {
        if (headA == null && headB == null) {
            return new PartialSum();
        }
        // Add last digits first (By recursive)
        PartialSum sum = addLinkedListHelper(headA.next, headB.next);
        // add data with carry
        int value = sum.carry + headA.data + headB.data;
        // insert sum of current digits
        sum.sum = insertBefore(sum.sum, value % 10);
        sum.carry = value / 10;
        return sum;
    }

    // for Challenge 6(2) : Padding List
    private LinkedListNode padLinkedList(LinkedListNode headB, int i) {
        LinkedListNode head = headB;
        for (int j = 0; j < i; j++) {
            head = insertBefore(head, 0);
        }
        return head;
    }

    // for Challenge 6(2) : Insert at Beginning.
    private LinkedListNode insertBefore(LinkedListNode head, int data) {
        LinkedListNode newNode = new LinkedListNode(data);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public int getLength(LinkedListNode headNode) {
        int len = 0;
        if (headNode == null)
            return len;
        LinkedListNode current = headNode;
        while (current != null) {
            len += 1;
            current = current.next;
        }
        return len;
    }

    // Challenge 7 : Is palindrome ?
    public boolean isPalindrome(LinkedListNode headNode) {
        LinkedListNode reversedList = reverseAndClone(headNode);
        return isEqual(headNode, reversedList);

    }

    private boolean isEqual(LinkedListNode one, LinkedListNode two) {
        while (one != null && two != null) {
            if (one.data != two.data) {
                return false;
            }
            one = one.next;
            two = two.next;
        }
        return one == null && two == null;
    }

    private LinkedListNode reverseAndClone(LinkedListNode headNode) {
        LinkedListNode reverseHead = null;
        while (headNode != null) {
            LinkedListNode newNode = new LinkedListNode(headNode.data);
            newNode.next = reverseHead;
            reverseHead = newNode;
            headNode = headNode.next;
        }
        return reverseHead;
    }

    // second approach (Is good approach?)
    public boolean isPalindrome2(LinkedListNode headNode) {
        LinkedListNode slow = headNode;
        LinkedListNode fast = headNode;
        Stack<Integer> stk = new Stack<>();
        while (fast != null && fast.next != null) {
            stk.push(slow.data);
            slow = slow.next;
            fast = fast.next.next;
        }

        // if list is odd number of element
        if (fast != null) {
            slow = slow.next;
        }

        while (slow != null) {
            int top = stk.pop();
            if (slow.data != top) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    // Challenge 8 : Intersection.
    // Let's talk about demo
    // There are two linked list, determine if both of them are intersect to each other or not
    // eg.
    // 1 -> 2 -> 3 -> 4 ->
    //                     5 -> 6 -> 7   (5 is Intersection node because referencing by both 4 and 9 node).
    //           8 -> 9 ->
    // Socked? I also but, I can solve this problem.(After reading the solution :))

    public LinkedListNode isIntersect() {
        createLinkedListForChallenge7();
        if (headL1 == null || headL2 == null)
            return null;
        LinkedListNode headL1 = this.headL1;
        LinkedListNode headL2 = this.headL2;

        Result r1 = getTailAndSize(headL1);
        Result r2 = getTailAndSize(headL2);

        // if both linked list has different tails then return null
        if (r1.tail != r2.tail)
            return null;

        LinkedListNode shorter = r1.size < r2.size ? headL1 : headL2;
        LinkedListNode longer = r1.size < r2.size ? headL2 : headL1;

        // Advance the pointer for the longer list by diff in length.
        longer = getKthNode(longer, Math.abs(r1.size - r2.size));

        // move the pointer of both linked list and compare the pointers to get intersection node
        while (shorter != longer) {
            shorter = shorter.next;
            longer = longer.next;
        }

        // return any of them either shorter or longer.
        return shorter;

    }

    private LinkedListNode getKthNode(LinkedListNode longer, int diff) {
        LinkedListNode current = longer;
        while (diff > 0 && current != null) {
            current = current.next;
            diff--;
        }
        return current;
    }

    private Result getTailAndSize(LinkedListNode head) {
        if (head == null)
            return null;
        int count = 0;
        LinkedListNode current = head;
        while (current.next != null) {
            count++;
            current = current.next;
        }
        return new Result(count, current);
    }


    public static void main(String[] args) {

        LinkedListChallenges llc = new LinkedListChallenges();
        llc.createLinkedList();
        System.out.println("Linked List : ");
        llc.printNodes(llc.head);
        System.out.println();
        System.out.println("Challenge 5 : Partition[x = 5] : ");
        LinkedListNode partitionHead = llc.partition(llc.head, 5);
        llc.printNodes(partitionHead);
        System.out.println();
        System.out.println("Head of Linked List : " + llc.head.data);
        System.out.println("Challenge 1: Remove Duplicates : ");
        llc.removeDuplicates(llc.head);
        llc.printNodes(llc.head);
        System.out.println();
        System.out.println("Challenge 2: 2rd to last element : " + llc.kthToLastElement(llc.head, 2));
        //System.out.println("Head of Linked List : " + llc.head.data);
        System.out.println("Challenge 3: Deleted Middle Node : " + llc.deleteMiddleNode(llc.head).data);
        llc.printNodes(llc.head);
        System.out.println();
        System.out.println("Challenge 4: Is middle node(1) deleted : " + llc.deleteMiddle(llc.head.next.next));
        llc.printNodes(llc.head);
        System.out.println();
        System.out.println("Challenge 6: Sum List : ");
        // calling function
        LinkedListNode sumList = llc.sumLists();
        // printing list A
        llc.printNodes(llc.headA);
        System.out.println();
        // printing list B
        llc.printNodes(llc.headB);
        System.out.println();
        // printing list sum
        llc.printNodes(sumList);
        System.out.println();
        System.out.println("Challenge 6(2): Sum Forward List : ");
        // calling function
        LinkedListNode sumFrwList = llc.sumListForwardOrder();
        // printing list A
        llc.printNodes(llc.headA);
        System.out.println();
        // printing list B
        llc.printNodes(llc.headB);
        System.out.println();
        // printing list sum
        llc.printNodes(sumFrwList);
        System.out.println();
        llc.printNodes(llc.head);
        System.out.println();
        System.out.println("Challenge 7: Is Palindrome?");
        System.out.print(llc.isPalindrome(llc.head));
        System.out.println();
//        System.out.println("Challenge 6: Sum Lists2 : ");
//        // calling function
//        LinkedListNode sumList2 = llc.sumLists2();
//        // printing list A
//        llc.printNodes(llc.headA);
//        System.out.println();
//        // printing list B
//        llc.printNodes(llc.headB);
//        System.out.println();
//        // printing list sum
//        llc.printNodes(sumList2);
//        System.out.println();

        System.out.println("Challenge 8: Is Intersection? ");
        LinkedListNode result = llc.isIntersect();
        if (result != null)
            System.out.println("Intersection Node: "+result.data);
        else
            System.out.println("Not Intersected.");

        // Congratulation! I have done a lot of question on linked list.
        // for more see in the data_structure/LinkedList package.

    }
}
