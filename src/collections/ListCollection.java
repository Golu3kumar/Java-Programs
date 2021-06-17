package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
    int roll;
    String name;

    public Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }
}

public class ListCollection {
    public static void main(String[] args) {
        //Java Collection framework : Collections are the containers that group multiple items in a single unit
        // Java collection framework provide many interfaces and classes.
        // We can perform various operations on the data like searching, sorting, insertion, deletion etc dynamically.

        //List : Java List is an interface that extends the Collection interface and store the elements in the index approach
        // even it contains duplicate elements.
        // ArrayList,LinkedList and Vector are the classes that implements the List interface.
        //ArrayList : It is collection class that implements List interface
        // where the data can be dynamically added or removed from a list
        // the size of list is increased dynamically

        // this list only store String object
        // List is an interface which is implemented by ArrayList class
        List<String> arrayList = new ArrayList<>();//Generic collections

        // this list store any type of data
        ArrayList arrayList1 = new ArrayList();

         //adding data to list
        arrayList.add("Golu");
        arrayList.add("Nikhil");
        arrayList.add("Jai Prakash");
        arrayList.add("Samrat");
        arrayList.add("Teekam");
        arrayList.add("Samrat");
        arrayList.add("Dk");
        arrayList.add("Pk");
        arrayList.add("Teekam");

        //arrayList.add(9); arrayList can store only String object
        Student student = new Student(43,"Golu");

        arrayList1.add("Samrat");
        arrayList1.add("Kumar");
        arrayList1.add(9);
        arrayList1.add(9.9);
        arrayList1.add(student);

        System.out.println(arrayList);
        System.out.println(arrayList1);

        // get data from generic class ;
        Object o = arrayList1.get(2);
        System.out.println(o);

        //update value
        arrayList.set(2,"India");

        //removing
        arrayList.remove(2);
        System.out.println(arrayList);

        // forEach loop with lambda function
        arrayList.forEach(a->{
            a="Hello "+a;
            System.out.println(a);
        });

        // enhanced for loop
        for (String a:arrayList) {
            System.out.println(a);
        }

        //iterator API

        Iterator<String> itr = arrayList.iterator();
        System.out.println("First element : "+itr.next());
        System.out.println("First second : "+itr.next());
        //System.out.println("First third : "+itr.next()); // error because arrayList has only two elements.
        // to avoid this problem use .hasNext()

        while (itr.hasNext()){// starts from index 2
            System.out.println(itr.next());
        }



    }
}
