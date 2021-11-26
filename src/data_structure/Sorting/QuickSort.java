package data_structure.Sorting;

public class QuickSort {

    public static void main(String[] args) {

        int[] arr = {5,3,2,8,9,6,1};

        quickSort(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void quickSort(int[] arr, int start, int end) {

        if(start < end){

            int pIndex = partition(arr,start,end);
            quickSort(arr,start,pIndex-1);
            quickSort(arr,pIndex+1,end);
        }

    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if(arr[i] <= pivot){
                swapping(arr,pIndex,i);
                pIndex++;
            }
        }
        swapping(arr,pIndex,end);
        return pIndex;
    }

    private static void swapping(int[] arr, int pIndex, int i) {
        int temp = arr[i];
        arr[i] = arr[pIndex];
        arr[pIndex] = temp;
    }
}
