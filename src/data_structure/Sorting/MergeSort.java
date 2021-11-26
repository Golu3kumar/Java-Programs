package data_structure.Sorting;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {5,3,2,8,9,6,1};

        mergeSort(arr);

        System.out.println("Sorted array : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] arr) {

        int len = arr.length;
        if(len < 2)
            return;

        int mid = len/2;
        int[] left = new int[mid];
        int[] right = new int[len-mid];

        // we fill left side array into left part
        System.arraycopy(arr, 0, left, 0, mid - 1 + 1);
        // we fill right side array into right part
        if (len - mid >= 0) System.arraycopy(arr, mid, right, 0, len - mid);

        // let's divide left side till there is single element in the array
        mergeSort(left);
        // do the same with right side
        mergeSort(right);
        // now we need merge them, because they are sorted
        // so for that we need to make call
        merger(left,right,arr);

    }

    private static void merger(int[] left, int[] right, int[] arr) {

        int i = 0;
        int j = 0;
        int lEnd = left.length;
        int rEnd = right.length;
        int k = 0;
        while (i <lEnd && j < rEnd){

            if(left[i] <= right[j]){
                arr[k] = left[i];
                i++;
            }else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < lEnd){
            arr[k] = left[i];
            i++;k++;
        }

        while (j < rEnd){
            arr[k] = right[j];
            j++;k++;
        }
    }
}
