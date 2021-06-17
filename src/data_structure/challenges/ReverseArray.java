package data_structure.challenges;

public class ReverseArray {


    public static int[] arr = {5,3,25,4,5,7,6};

    public static void reverseArray(int[] a,int start,int end){

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        System.out.println("Before reverse array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }

        reverseArray(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After reverse array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
