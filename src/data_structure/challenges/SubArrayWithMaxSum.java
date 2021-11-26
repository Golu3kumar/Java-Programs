package data_structure.challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubArrayWithMaxSum {
    // Welcome back
    // Input : Arr[2,4,5,-2,100,4,-7,86]
    // Output : Arr[100,4] (as it has maximum sum) (Consecutive Positive number)
    // Input : Arr[3,2,4,-2,1,-1,9]
    // Output : Arr[9] (as 3,2,4 has sum equal to 9 but we return 9 as it also present in the array).
    // Let's crack it!

    public static ArrayList<Integer> maxSumArray(List<Integer> Arr){
        if (Arr == null)
            return null;
        ArrayList<Integer> Res = new ArrayList<>();
        ArrayList<Integer> Copy = new ArrayList<>();
        int max_sum = 0;
        int curr_sum = 0;

        for (int num : Arr) {
            if (num >= 0){
                curr_sum+=num;
                Copy.add(num);
            }else {
                curr_sum = 0;
                Copy.clear();
            }

            if (curr_sum > max_sum || (curr_sum == max_sum && Res.size() > Copy.size())){
                max_sum = curr_sum;
                Res.clear();
                Res.addAll(Copy);
            }
        }
        return Res;
    }
    public static void main(String[] args) {
        Integer[] arr = {3,2,4,-2,1,-1,9};
        List<Integer> input = Arrays.asList(arr);
        ArrayList<Integer> result = maxSumArray(input);

        for (int val : result) {
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
