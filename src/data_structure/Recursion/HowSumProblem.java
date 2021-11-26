package data_structure.Recursion;

import java.util.ArrayList;
import java.util.List;

public class HowSumProblem {

    public static void main(String[] args) {

        int[] arr = {2,3,5};
        int targetSum = 5;

        List<Integer> result = howSum(arr,targetSum);
        System.out.println(result);
    }

    private static List<Integer> howSum(int[] arr, int targetSum) {
        if (targetSum == 0)
            return new ArrayList<>();
        if (targetSum < 0)
            return null;

        for (int i : arr) {
            int rem = targetSum - i;
            List<Integer> result = howSum(arr,rem);
            if (result != null) {
                result.add(i);
                return result;
            }

        }
        return null;
    }
}
