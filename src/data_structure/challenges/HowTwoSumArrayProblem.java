package data_structure.challenges;

import java.util.Hashtable;
import java.util.Map;

public class HowTwoSumArrayProblem {

    public static int[] howSum(int[] arr, int targetSum) {
        Map<Integer, Integer> memory = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            int temp = targetSum - arr[i];
            if (!memory.containsKey(temp)) {
                memory.put(arr[i], i);
            } else {
                return new int[]{memory.get(temp), i};
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 11, 5, 10, 7, 8};
        int targetSum = 9;
        int[] result = howSum(arr, targetSum);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
        if (result != null) {
            System.out.println("Target sum : " + targetSum);
            System.out.println("first num = " + arr[result[0]]);
            System.out.println("second num = " + arr[result[1]]);
        } else {
            System.out.println("Sum can't be possible!");
        }
    }
}
