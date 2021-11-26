package data_structure.BinarySearch;

public class RotatedArray {

//    Suppose a sorted array A is rotated at some pivot unknown to you beforehand.
//    (i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).
//    Find the minimum element. (return 0)

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("Min Element : " + findMin(arr));
    }

    private static int findMin(int[] arr) {
        if (arr.length == 0)
            return 0;

        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = (start + end) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return arr[start];
    }
}
