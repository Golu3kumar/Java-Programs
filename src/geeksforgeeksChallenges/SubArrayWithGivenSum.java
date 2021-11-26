package geeksforgeeksChallenges;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubArrayWithGivenSum {
    //Given an unsorted array A of size N that contains only non-negative integers,
    // find a continuous sub-array which adds to a given number S.

//    Example 1:
//    Input:
//    N = 5, S = 12
//    A[] = {1,2,3,7,5}
//    Output: 2 4
//    Explanation: The sum of elements
//    from 2nd position to 4th position is 12.

    // using sliding window concept
    // create a new variable currSum and add array elements till currSum is not greater than s
    // set last pos with i because we know that sum is must be under last index.
    // now we subtract elements from beginning of the arr into the currSum and check regularly that
    // s is equal to the currSum.

    static ArrayList<Integer> subArraySum(int[] arr,int n, int s){
        int currSum = 0;
        int start = 0;
        int last = 0;
        boolean flag = false;
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            currSum+=arr[i];

            if (currSum>=s){
                last = i;

                while (s<currSum && start<last){
                    currSum-=arr[start];
                    ++start;
                }

                if (s==currSum){
                    list.add(start+1);
                    list.add(last+1);
                    flag = true;
                    break;
                }
            }
        }

        if (!flag)
            list.add(-1);
        return list;

    }

    public static void main(String[] args) {

        ArrayList<Integer> list = SubArrayWithGivenSum.subArraySum(new int[]{4,3,5,6},4,14);

        for (int a:list) {
            System.out.println(a+" ");
        }
    }
}
