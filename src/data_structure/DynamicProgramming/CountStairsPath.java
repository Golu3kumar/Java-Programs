package data_structure.DynamicProgramming;

public class CountStairsPath {

    public static void main(String[] args) {

        int numberOfStairs = 10;
        int numberOfWays = countNumberOfPath(numberOfStairs, new int[numberOfStairs + 1]);
        System.out.println("Number of Ways = " + numberOfWays);
        numberOfWays = countNumberOfPathWithTabulationDP(numberOfStairs);
        System.out.println("Number of ways = " + numberOfWays);
    }

    private static int countNumberOfPath(int numberOfStairs, int[] memo) {

        if (numberOfStairs < 0)
            return 0;
        if (numberOfStairs == 0) {
            return 1;
        }
        if (memo[numberOfStairs] > 0)
            return memo[numberOfStairs];

        int c1 = countNumberOfPath(numberOfStairs - 1, memo);
        int c2 = countNumberOfPath(numberOfStairs - 2, memo);
        int c3 = countNumberOfPath(numberOfStairs - 3, memo);

        int cp = c1 + c2 + c3;
        memo[numberOfStairs] = cp;
        return memo[numberOfStairs];
    }

    public static int countNumberOfPathWithTabulationDP(int numberOfStairs) {
        int[] tab = new int[numberOfStairs + 1];
        tab[0] = 1;
        for (int i = 1; i <= numberOfStairs; i++) {
            if (i == 1)
                tab[i] = tab[i - 1];
            else if (i == 2)
                tab[i] = tab[i - 1] + tab[i - 2];
            else
                tab[i] = tab[i - 1] + tab[i - 2] + tab[i - 3];
        }

        return tab[numberOfStairs];
    }
}
