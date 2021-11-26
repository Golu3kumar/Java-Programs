package data_structure.Heap;

import data_structure.Tree.BinarySearchTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EmptyStackException;

public class BinaryHeap {

    // Heap : Heap is a special based tree data structure in which the tree is complete binary tree.
    // there are two types of heap
    // Max Heap : In this type of heap the value of each node is greater than both it's child node.
    // Min Heap : The value of node is less than it's child nodes. Root is minimum node in tree.
    // We can efficiently represent a heap with array.

    // Array Representation
    // A binary heap is represented as an array. The representation follows some property.
    // > The root of the tree will be at Arr[0].
    // > For any node at Arr[i], its left and right children will be at Arr[2*i + 1] and Arr[2*i+2] respectively.
    // > For any node at Arr[i], its parent node will be at Arr[(i-1)/2].

    // Operations on Heaps
    // The common operation involved using heaps are:
    // Heapify → Process to rearrange the heap in order to maintain heap-property.
    // Find-max (or Find-min) → find a maximum item of a max-heap, or a minimum item of a min-heap, respectively.
    // Insertion → Add a new item in the heap.
    // Deletion → Delete an item from the heap.
    // Extract Min-Max → Returning and deleting the maximum or minimum element in max-heap and min-heap respectively.

    private final int d = 2;
    private int[] heap;
    private int heapSize;

    public BinaryHeap(int capacity) {
        heap = new int[capacity];
        heapSize = 0;
        Arrays.fill(heap, -1);
    }

    public boolean isEmpty() {
        return heapSize == 0;
    }

    public boolean isFull() {
        return heapSize == heap.length;
    }

    public int getParent(int child) {
        return (child - 1) / 2;
    }

    public void insert(int key) {
        if (isFull()) throw new StackOverflowError("Heap is full!");

        heap[heapSize++] = key;
        heapifyUp(heapSize - 1);
    }

    private void heapifyUp(int i) {
        int parent = getParent(i);
        int temp = heap[i];
        if (heap[parent] < heap[i]) {
            heap[i] = heap[parent];
            heap[parent] = temp;
            heapifyUp(parent);
        }
    }

    public int delete() {
        int key = heap[0];
        heap[0] = heap[heapSize - 1];
        heap[heapSize - 1] = -1;
        heapifyDown(0);
        heapSize--;
        return key;
    }

    private void heapifyDown(int i) {
        int parent = getParent(i);
        int left = d * i + 1;
        int right = d * i + 2;
        int largest = parent;
        int temp = heap[parent];

        if (left <= heapSize-1 && heap[left] > heap[parent])
            largest = left;
        if (right <= heapSize-1 && heap[right] > heap[largest])
            largest = right;

        if (largest != parent){
            heap[parent] = heap[largest];
            heap[largest] = temp;
            heapifyDown(largest);
        }

    }

    public void printHeap(){
        if (isEmpty()) throw new EmptyStackException();

        for (int i = 0; i < heapSize; i++) {
            System.out.print(heap[i] + " ");
        }
    }

    public int getMax(){
        if (isEmpty()) throw new EmptyStackException();
        return heap[0];
    }

    public static void main(String[] args) {

        // creating object of heap class
        BinaryHeap maxHeap = new BinaryHeap(10);

        maxHeap.insert(1);
        maxHeap.insert(2);
        maxHeap.insert(3);
        maxHeap.insert(4);
        maxHeap.insert(5);
        maxHeap.insert(6);
        maxHeap.insert(7);

        System.out.print("max Heap : ");
        maxHeap.printHeap();
        System.out.println();
        System.out.println("Max key = "+maxHeap.getMax());

        maxHeap.delete();
        System.out.print("Max heap after deleting max number : ");
        maxHeap.printHeap();

    }

}
