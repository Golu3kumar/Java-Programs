package data_structure.DynamicProgramming;

import java.util.HashMap;
import java.util.Map;

public class Knapsacks0_1 {

    public static Map<Integer, Integer> res = new HashMap<>();

    public static void main(String[] args) {

        int[] prices = {4, 1, 3, 8, 5};
        int[] weights = {30, 45, 12, 23, 16};

        final int MAX_WEIGHT = 100;

        System.out.println("Maximum profit : " + knapsack(prices, weights, MAX_WEIGHT, prices.length));

        for (Map.Entry entry : res.entrySet()) {
            System.out.print("Price : "+entry.getKey()+" weight : "+entry.getValue());
            System.out.println();
        }
    }

    private static int knapsack(int[] prices, int[] weights, int max_weight, int n) {

        if (n == 0 || max_weight == 0)
            return 0;

        if (weights[n - 1] > max_weight)
            return knapsack(prices, weights, max_weight, n - 1);

        else {
            int includePrice = prices[n - 1] + knapsack(prices, weights, max_weight - weights[n - 1], n - 1);
            int restPrice = knapsack(prices, weights, max_weight, n - 1);
            if (includePrice > restPrice) {
                res.put(prices[n - 1], weights[n - 1]);

                return includePrice;
            }
            return restPrice;
        }
    }
}
