package data_structure.DynamicProgramming;

public class ClimbStairsWithMinMoves {

    public static void main(String[] args) {

        int topStair = 10;
        int[] jumps = {3, 2, 4, 2, 0, 2, 3, 1, 2, 2};

        int minNumberOfMoves = minNumberOfMoves(topStair, jumps);
        System.out.println("Min number of moves : "+minNumberOfMoves);
    }

    private static int minNumberOfMoves(int topStair, int[] jumps) {
        Integer[] stairs = new Integer[topStair + 1];
        stairs[topStair] = 0;
        for (int i = topStair - 1; i >= 0; i--) {
            if (jumps[i] > 0) {
                int min = Integer.MAX_VALUE;
                for (int j = 1; j <= jumps[i] && i + j < stairs.length; j++) {
                    if (stairs[i + j] != null)
                        min = Math.min(min, stairs[i + j]);
                }

                if (min != Integer.MAX_VALUE)
                    stairs[i] = min + 1;
                else
                    stairs[i] = null;
            }
        }
        return stairs[0];
    }
}
