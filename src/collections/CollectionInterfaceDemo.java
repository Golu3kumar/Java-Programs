package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceDemo {
    // Collection : In java Collection is an interface that is used to store a group of objects
    // either having similar type or not similar.
    // Collection was introduced in Java 1.2 and it's not based on index approach,
    // mean we can not get elements by giving their index.
    // But in Java 1.3 List was introduced that work with indexes so Life is get Normal Again.
    // Lets see the demo
    public static void main(String[] args) {
        // Here Collection reference store object of ArrayList class.
        // we can add elements of any type
        Collection collections = new ArrayList<>(); // generic ArrayList
        collections.add(4);// here 4 is an object of Integer type
        collections.add("Nikhil"); // String object
        collections.add(4.5); // Double type

        // lets print the collection
        System.out.println(collections); // it prints all the elements of collection
        // we can not get the object with index
        //collection.get(5); // Error : for more details press ctrl + mouse_pointer on the Collection interface.

        // we can use enhanced for loop
        for (Object o : collections) {
            System.out.println(o);
        }

        // we can use iterator with collection

        for (Object collection : collections) {
            System.out.println(collection);
        }
    }
}
