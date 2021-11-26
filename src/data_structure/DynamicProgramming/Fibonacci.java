package data_structure.DynamicProgramming;


import java.util.HashMap;

public class Fibonacci {


    public static void main(String[] args) {
        // Fibonacci Number : 0,1,1,2,3,5,8,13,21,.....
        long fibNumber = fib(6);
        System.out.println(fibNumber);

        long fib = fibMemo(6, new HashMap<Integer, Long>());
        System.out.println(fib);
    }

    static long fib(int num) {
        long[] arr = new long[num+1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= num; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[num];
    }

    // using memoization
    static long fibMemo(int n, HashMap<Integer, Long> memo) {
        if(n < 2 && n >= 0)
            return n;
        if (memo.containsKey(n))
            return memo.get(n);
        else {
            memo.put(n, fibMemo(n - 1, memo) + fibMemo(n - 2, memo));
        }
        return memo.get(n);

    }
}
