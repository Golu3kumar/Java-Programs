package data_structure.challenges;

import java.util.HashMap;

public class OddNumberOfOccurrence {

    // An Array contain some repeated elements in which there are some odd number of repetition
    // We need to get that odd repetition
    // e.g.
    // 1. [4,3,2,4,2]
    // 4 and 2 repeats 2 times(even) and 3 repeats only once(odd) so return 3 output

    // 2. [5,4,4,5,5,3,3] return 5, as 5 repeats for 3 times(odd).
    // let's do it!
    public static void main(String[] args) {

        int[] arr = {4,3,2,4,2};
        System.out.println("Odd number : "+findOddRepeats(arr,arr.length));
        System.out.println("Odd number : "+findOddRepeats(new int[]{5,4,4,5,5,3,3},7));
    }

    private static int findOddRepeats(int[] arr, int length) {
        if (length<0)
            return -1;
        // We can easily implement by using HashMap
        HashMap<Integer,Integer> memo = new HashMap<>();
        for (int i = 0; i < length; i++) {
            if (memo.containsKey(arr[i])){
                memo.remove(arr[i]);
            }else {
                memo.put(arr[i],length);
            }
        }
        int result = 0;
        for (Integer eachV : memo.keySet()) {
            result = eachV;
            break;
        }
        return result;
    }
}
