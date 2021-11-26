package data_structure.DynamicProgramming;

import java.util.Random;

public class GridTravellerWithMinimumCost {

    public static void main(String[] args) {

        int m = 7;
        int n = 7;

        int[][] grid = new int[m][n];
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                grid[i][j] = random.nextInt(10);
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }



        int minCost = findMinCost(grid,m,n);

        System.out.println(minCost);
    }

    private static int findMinCost(int[][] grid, int m, int n) {
        int[][] dp = new int[m][n];
        for (int i = m-1; i >= 0; i--) {
            for (int j = n-1; j >= 0 ; j--) {

                if (i == m-1 && j == n-1)
                    dp[i][j] = grid[i][j];
                else if(i == m-1){
                    dp[i][j] = dp[i][j+1] + grid[i][j];
                }else if(j == n-1){
                    dp[i][j] = dp[i+1][j] + grid[i][j];
                }else{
                    dp[i][j] = Math.min(dp[i+1][j],dp[i][j+1]) + grid[i][j];
                }
            }
        }

        System.out.println();

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[0][0];
    }

}
