package data_structure.challenges;

import java.util.Scanner;

public class PowerOfTwo {

    public static int powerOfTwo(int n){
        if (n<=0)
            return 0;
        else if (n==1) {
            System.out.print(1+" ");
            return 1;
        }
        else {
            int ans = powerOfTwo(n/2);
            int curr = ans*2;
            System.out.print(curr+" ");
            return curr;
        }
    }

    public static void powerOfTwo2(int n){
        int i = 1;
        while (i<=n){
            System.out.print(i+" ");
            i*=2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        powerOfTwo(n);
        System.out.println();
        powerOfTwo2(n);
    }
}
