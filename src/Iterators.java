import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Iterators {

//    Iterators are used in the Collection framework in Java to retrieve elements one by one.
//    There are three iterators in Java
//
//    Enumeration: It is an interface used to get elements of legacy collections(Vector, Hashtable).
//    Iterator: It is a universal iterator as we can apply it to any Collection object. By using Iterator,
//    we can perform both read and remove operations.
//    ListIterator: It is only applicable for List collection implemented classes like ArrayList, LinkedList, etc.
//    It provides bi-directional iteration.


    public static void main(String[] args) {


        Vector<Integer> v = new Vector<>();
        for(int i=0;i<10;i++)
            v.addElement(i);

        // Enumeration iterator
        Enumeration<Integer> enumeration = v.elements();
        while (enumeration.hasMoreElements())
            System.out.print(enumeration.nextElement() + " ");

        System.out.println();
        // Iterator
        Iterator<Integer> iterator = v.iterator();

        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
            if (iterator.next()%2 == 0)
                iterator.remove();
        }

        System.out.println();
        System.out.println(v);

        ListIterator<Integer> listIterator = v.listIterator();

        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }


    }
}

