package data_structure.Sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {5,3,7,8,5,3,2,9,1};

        insertionSort(arr,arr.length);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] arr, int length) {

        for(int i = 1;i<length;i++){
            int temp = arr[i];
            int j = i;

            while(j > 0 && arr[j-1] > temp){
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = temp;
        }
    }

}
