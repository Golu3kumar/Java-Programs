package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {

    // Set Interface : Set interface is very similar to List interface, it also extends Collection interface.
    // But Set interface doesn't store duplicate objects and It doesn't store objects in sequences.
    // Implementer class : HashSet and TreeSet.
    // HashSet : It is a class that implements Set interface in order to store group of objects.
    // TreeSet : It is another java class that implements Set interface but it store the object in ascending order.


    public static void main(String[] args) {

        // initializing a set using HashSet class
        Set<Integer> set = new HashSet<>(){{
            add(45);
            add(27);
            add(73);
            add(73); // it doesn't store in the Heap Memory
        }};

        // set.get(2); // Error : we can not get objects on the basis of index.
        for (int i : set) {
            System.out.println(i);
        }

        // initializing a set using TreeSet class
        Set<String> name = new TreeSet<>(){{
            add("Golu");
            add("Nikhil");
            add("Nikhil");
            add("Rahul");
            add("Kumar");
            add("Sam");
        }};

        for (String n : name) {
            System.out.println(n);
        }
    }
}
