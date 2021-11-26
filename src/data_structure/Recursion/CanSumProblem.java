package data_structure.Recursion;

public class CanSumProblem {

    // the problem is you have given an array with a target sum and
    // you have to find whether the two elements are present in the array that makes sum is equal to
    // the target sum or not.
    // Demo
    // array[2, 3, 5], targetSum = 9
    // output = true (because 2+2+2+3 = 9)

    public static void main(String[] args) {
        int[] arr = {7,14};
        int targetSum = 300;
        boolean canSum = canSum(arr,targetSum);
        System.out.println("canSum? "+canSum);
    }

    // Time complexity : O(n^m), where n = number of element in array and m = targetSum
    // Space Complexity : O(m)
    private static boolean canSum(int[] arr, int targetSum) {
        if (targetSum == 0)
            return true;
        if (targetSum < 0)
            return false;
        for (int i : arr) {
            int remainder = targetSum - i;
            if (canSum(arr,remainder))
                return true;
        }
        return false;
    }
}
