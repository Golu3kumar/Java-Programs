package data_structure.Recursion;

public class PrintStairsPath {
    static int numberOfWays = 0;

    public static void main(String[] args) {

        int numberOfStairs = 4;
        printAllPossiblePaths(numberOfStairs,"");
        System.out.println("Number of ways : "+numberOfWays);
    }

    private static void printAllPossiblePaths(int numberOfStairs, String path) {
        if (numberOfStairs < 0)
            return;
        if (numberOfStairs == 0) {
            numberOfWays++;
            System.out.println(path);
            return;
        }
        printAllPossiblePaths(numberOfStairs - 1,path + "1 ");
        printAllPossiblePaths(numberOfStairs - 2,path + "2 ");
        printAllPossiblePaths(numberOfStairs - 3,path + "3 ");
    }
}
