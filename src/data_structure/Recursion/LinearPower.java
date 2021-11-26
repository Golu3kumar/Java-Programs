package data_structure.Recursion;

public class LinearPower {

    // write recursive code to find x^n
    public static void main(String[] args) {

        int x = 5;
        int n = 3;
        int result = power(x,n);
        System.out.println(result);
    }

    private static int power(int x, int n) {
        if (n == 0)
            return 1;
        return x*power(x,n-1);
    }
}
