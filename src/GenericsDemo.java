import java.util.Collections;
import java.util.Comparator;

public class GenericsDemo{

    static <T extends Comparable<T>> void bubbleSort(T[] array){
        System.out.println();
        System.out.println("Before sorting : ");
        for (T ele:array) {
            System.out.print(ele+" ");
        }
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j].compareTo(array[j+1])>0){
                    T temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("After sorting : ");
        for (T ele:array) {
            System.out.print(ele+" ");
        }

    }
    public static void main(String[] args) {
        bubbleSort(new Integer[]{4,2,5,6,1,});
        bubbleSort(new Double[]{4.5,2.2,5.6,6.4,2.4});
    }

}
