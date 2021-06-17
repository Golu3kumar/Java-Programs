package data_structure;

import java.util.Arrays;

// used to ignore warnings
@SuppressWarnings("unchecked")
class Array<T> {
    T[] arr;
    int len = 0; // no. of elements
    int capacity = 0; //size of Array

    Array() {
        this(10);
    }

    Array(int capacity) {
        if (capacity < 0) throw new IllegalArgumentException("Illegal Capacity = " + capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
        len = capacity;
    }

    // method to get the size of array
    public int size() {
        return len;
    }

    // method to check array is empty or not
    public boolean isEmpty() {
        return size() == 0;
    }

    // method to get the element of a particular index
    public T get(int index) {
        return arr[index];
    }

    // method to set the element on the particular index
    public void set(int index, T data) {
        arr[index] = data;
    }

    // method to clear the array
    public void clear() {
        for (int i = 0; i < capacity; i++)
            arr[i] = null;
        len = 0;

    }

    // method to add new elements and also double the array size.
    public void add(T element) {
        // resize the array
        if (len + 1 > capacity) {
            if (capacity == 0) capacity = 1;
            else capacity *= 2;

            T[] new_arr = (T[]) new Object[capacity];
            for (int i = 0; i < len; i++)
                new_arr[i] = arr[i];
            arr = new_arr;
        }
        arr[len++] = element;
    }

    // method to remove element at a particular index
    public T removeAt(int rm_index) {
        if (rm_index >= len || rm_index < 0) throw new IndexOutOfBoundsException();
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len - 1];
        for (int i = 0, j = 0; i < len; i++, j++) {
            if (rm_index == i) j--;
            else new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --len;
        return data;
    }

    // method to remove a particular object(element)
    public boolean remove(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj)) {
                removeAt(i);
                return true;
            }
        }
        return false;
    }

    // method to get index of a particular object(element)
    public int indexOf(Object obj) {
        for (int i = 0; i < len; i++) {
            if (arr[i].equals(obj))
                return i;

        }
        return -1;
    }

    // method to check a particular object has or not
    public boolean contains(Object obj){
        return indexOf(obj)!=-1;
    }

    @Override
    public String toString() {
        return "Array{" +
                "arr=" + Arrays.toString(arr) +
                "\n len=" + len +
                "\n capacity=" + capacity +
                '}';
    }
}

public class DynamicArrayDemo {

    // Array : Array is a collection of elements having similar datatype
    // Static Array : An Array has fixed sized of elements called static array.(Size known on compile time)
    // Dynamic Array : An Array can grow and shrink as per their no. of elements is called Dynamic Array.
    // In java we cannot create dynamic array but we can create with static array as per need.

    public static void main(String[] args) {

        // this is the object of my array class
        //Cool....
        Array<Integer> array = new Array<>(5);

        System.out.println("Size of array : "+array.size());

        array.set(2,6);

        System.out.println("data : "+array.get(2));

        System.out.println(array.size());

        System.out.println(array.toString());

        array.add(4);
        System.out.println(array.size());

    }
}