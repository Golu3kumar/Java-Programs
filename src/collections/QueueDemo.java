package collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Queue : Queue is a data structure that works on FIFO concepts i.e. FIRST IN FIRST OUT
        // It has two sides first one is Front for deletion and second Rear for Insertion

        Queue<Integer> pQueue = new PriorityQueue<>();

        for (int i = 10; i > 0; i--) {
            pQueue.add(i);
        }

        //Priority Queue : It sorts the elements of Queue
        // (front) 10 9 8 7 6 5 4 3 2 1 (rear)
        // but in pQueue = (front) 1, 2, 5, 4, 3, 9, 6, 10, 7, 8 (rear) // I don't know why
        System.out.println("Priority Queue : "+pQueue);
        System.out.println("Size of queue is : "+pQueue.size());
        System.out.println("Head of pQueue : "+pQueue.peek()); // peek returns first element from front
        pQueue.poll(); // it removes the head(front)
        System.out.println("Priority Queue after poll: "+pQueue);
        System.out.println("Size of queue is after poll: "+pQueue.size());
        System.out.println("Head of pQueue after poll: "+pQueue.peek());


    }
}
