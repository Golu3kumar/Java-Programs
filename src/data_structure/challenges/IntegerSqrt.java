package data_structure.challenges;

import java.util.Scanner;

public class IntegerSqrt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(integerSqrt(num,1,num));
    }

    private static int integerSqrt(int num,int min,int max) {
        if (max<min)
            return -1;

        int guess = (min+max)/2;
        int result = guess*guess;
        if (result==num) // found sqrt value
            return guess;
        else if(result<num){
            return integerSqrt(num,guess+1,max);// try higher
        }else {
            return integerSqrt(num,min,guess-1);// try lower
        }
    }
}
