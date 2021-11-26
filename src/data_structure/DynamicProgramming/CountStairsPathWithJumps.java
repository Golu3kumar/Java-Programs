package data_structure.DynamicProgramming;

public class CountStairsPathWithJumps {

    public static void main(String[] args) {

        int topStair = 6;
        int[] jumps = {3,2,0,5,3,4};

        System.out.println("Number of ways : "+countPath(topStair,jumps));
    }

    private static int countPath(int topStair, int[] jumps) {
        int[] memo = new int[topStair+1];
        // base case
        memo[topStair] = 1;
        for (int i = topStair-1; i >= 0; i--) {
            for (int j = 1; j <= jumps[i] && i + j < memo.length; j++) {
                memo[i] += memo[i + j];
            }
        }
        return memo[0];
    }
}
