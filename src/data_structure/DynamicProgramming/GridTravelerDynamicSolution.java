package data_structure.DynamicProgramming;

import java.util.HashMap;

public class GridTravelerDynamicSolution {

    // for question look GridTraveler.java file in recursion package.
    public static void main(String[] args) {

        int m = 18;
        int n = 18;
        long count = gridTravelerDP(m, n, new HashMap<>());
        System.out.println("Number of ways : "+count);
    }

    private static long gridTravelerDP(int m, int n, HashMap<String, Long> memo) {
        String key = m + " , " + n;
        if (memo.containsKey(key))
            return memo.get(key);
        if (m == 0 || n == 0)
            return 0;
        if (m == 1 && n == 1)
            return 1;
        long down = gridTravelerDP(m-1,n,memo);
        long right = gridTravelerDP(m,n-1,memo);
        memo.put(key,down + right);
        return memo.get(key);
    }
}
