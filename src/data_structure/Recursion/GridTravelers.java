package data_structure.Recursion;

public class GridTravelers {

    // You have given a grid of m,n dimension.
    // and you are standing on position 1,1 and you have to go position m,n
    // but the condition is you can only move down and right;
    // find the path and also number of ways.
    // I just hate commenting!

    public static void main(String[] args) {

        int m = 3;
        int n = 2;
        System.out.println("Possible solutions : ");
        int numberOfWays = gridTraveler(m,n,"");
        System.out.println("Number of ways : "+numberOfWays);
    }

    // Time Comp. : O(2^(m+n))
    // Space :
    private static int gridTraveler(int m, int n, String path) {
        if (m == 0 || n == 0)
            return 0;
        if (m == 1 && n == 1){
            System.out.println(path);
            return 1;
        }
        int down = gridTraveler(m-1,n,path+"down ");
        int right = gridTraveler(m,n-1,path+"right ");
        return down+right;
    }
}
