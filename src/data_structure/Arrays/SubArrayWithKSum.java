package data_structure.Arrays;

import java.util.ArrayList;

public class SubArrayWithKSum {

    public static void main(String[] args) {

        int[] arr = new int[]{5, 6, 3, 1, 8, 9};
        ArrayList<Integer> res = subArrayWithKSum(arr, 12);

        if (res == null || res.get(0) == -1){
            System.out.println("Sub array not found");
        }else {
            int start = res.get(0)-1;
            int end = res.get(1);

            for (int i = start; i < end; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }

    // sliding window concept
    private static ArrayList<Integer> subArrayWithKSum(int[] arr, int K) {
        int len = arr.length;
        if (len <= 0)
            return null;
        int currSum = 0;
        int start = 0;
        int last;

        ArrayList<Integer> res = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < len; i++) {

            currSum += arr[i];

            if (currSum >= K) {

                last = i;
                while (K < currSum && start < last) {
                    currSum -= arr[start++];
                }

                if (currSum == K) {
                    flag = true;
                    res.add(start + 1);
                    res.add(last + 1);
                }
            }
        }

        if (!flag)
            res.add(-1);
        return res;
    }
}
