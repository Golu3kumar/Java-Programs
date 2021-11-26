package data_structure.TCS_NQT;

import java.util.Scanner;

public class MonkeyLeftOnTheTree {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int k = sc.nextInt();
        int j = sc.nextInt();
        int b = sc.nextInt();
        int p = sc.nextInt();

        int numberOfLeftMonkeyOnTree = getMonkey(m, k, j, b, p);
        System.out.println(numberOfLeftMonkeyOnTree);
    }

    private static int getMonkey(int m, int k, int j, int b, int p) {
        if (m < 0 || k < 0 || j < 0 || b < 0 || p < 0){
            System.out.println("INVALID OUTPUT");
            return 0;
        }
        int result = 0;
        result = result + (b/k);
        result = result + (p/j);
        return m - result;
    }
}
