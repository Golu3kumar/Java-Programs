package data_structure.challenges;

public class MergeTwoSortedArray {

    public static void mergeArray(int[] arr1, int[] arr2, int len1, int len2) {
        int i, j, k;
        i = j = k = 0;
        int len = len1 + len2;
        int[] mergedArray = new int[len];

        while (i < len1 && j < len2) {
            if (arr1[i] < arr2[j]) {
                mergedArray[k] = arr1[i];
                i++;
            } else {
                mergedArray[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < len1) {
            mergedArray[k] = arr1[i];
            i++;
            k++;
        }
        while (j < len2) {
            mergedArray[k] = arr2[j];
            j++;
            k++;
        }

        for (int i1 : mergedArray) {
            System.out.print(i1+" ");
        }

    }

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 6, 9};
        int[] arr2 = {0, 2, 4, 7, 10, 56};

        mergeArray(arr1, arr2, arr1.length, arr2.length);
    }
}
