package data_structure.challenges;

public class MaxSumConsecutiveSubArray {

    // Welcome back
    // Input :  Arr[2,-2,100,4,-7,86]
    // output : 183 (100 + 4 -7 + 86)

    // Kadane's Algorithm
    public static void main(String[] args) {

        int[] arr = {2,-2,100,4,-7,86};

        int sum = maxSum(arr);
        System.out.println(sum);

    }

    private static int maxSum(int[] arr) {
        int max_end = Integer.MIN_VALUE;
        int max = 0;
        for (int i : arr) {
            max += i;
            if (i > max)
                max = i;

            if (max_end < max)
                max_end = max;
        }
        return max_end;
    }
}
