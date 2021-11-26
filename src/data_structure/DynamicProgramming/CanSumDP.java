package data_structure.DynamicProgramming;

import java.util.HashMap;

public class CanSumDP {

    public static void main(String[] args) {

        int[] arr = {9,7,8};
        int targetSum = 16;
        boolean canSum = canSumDP(arr,targetSum,new HashMap<>());
        System.out.println("canSum? "+canSum);
    }

    private static boolean canSumDP(int[] arr, int targetSum, HashMap<Integer,Boolean> memo) {

        if (memo.containsKey(targetSum))
            return memo.get(targetSum);
        if (targetSum == 0)
            return true;
        if (targetSum < 0)
            return false;

        for (int i : arr) {
            int rem = targetSum - i;
            if (canSumDP(arr,rem,memo)){
                memo.put(targetSum,true);
                return true;
            }
        }
        memo.put(targetSum,false);
        return false;
    }

}
