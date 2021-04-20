package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClassDemo {
    // Collections : In java Collections is a class that is used to perform various operation on
    // the collection interfaces as List, Collection , Map which is implemented by
    // classes as ArrayList , HashMap, LinkedList etc.
    // Operations like Sorting, Searching, Max , Min etc.

    //lets see the demo
    // I always forget to add main method !!!
    public static void main(String[] args) {
        // initialize the list
        /*List<Integer> list = new ArrayList<>(){{
            add(3);
            add(4);
        }};*/

        // lists are mutable
        List<Integer> list = new ArrayList<>(); // it only takes Wrapper classes
        list.add(455);
        list.add(448);
        list.add(132);
        list.add(561);

        // Collection is a class that perform some action on list
        // reflect on the original list
        Collections.sort(list); // sort the list in ascending order

        System.out.println(list); // output - [132, 448, 455, 561]
        // sort in reverse order
        Collections.reverse(list);
        System.out.println(list); // output - [561, 455, 448, 132]

        // searching
        // it returns 1 if element found in the list otherwise -1
        int a = Collections.binarySearch(list,425);
        System.out.println(a); // element not found so a = -1


        // Comparator interface : This is a interface which compare two objects.

        // now we are going to sort the list in something different way
        // as sort from the Least Significant digit
        // eg = the above list is sorted as 561,132,455,448 (1,2,5,8)
        // Lets do it!

        // Way 1 : in only one line
        // Actually I don't know this statement
        //Collections.sort(list, Comparator.comparingInt(i -> i % 10));
        // Lambda expression
        Collections.sort(list,(i,j)->(i%10>j%10)?1:(i%10==j%10)?0:-1);
        System.out.println(list);

        // Way 2 : using anonymous class of Comparator interface
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // main logic
                return (o1%10>o2%10)?1:-1;
            }
        };

        Collections.sort(list,comparator);
        System.out.println(list);

    }

}
