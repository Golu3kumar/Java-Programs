package java_interview_challenges;

import java.util.stream.IntStream;

public class OneToHundredWithoutLoop {

    public static void main(String[] args) {

        // Method 1 : Recursive call
        printNum(1);
        System.out.println();

        // Method 2 : Java Stream Class
        // the second range is Exclusive
        IntStream.range(1,101).forEach((num)-> System.out.print(num+" "));
    }

    public static void printNum(int num){
        if (num > 100) {
            return;
        }
        System.out.print(num + " ");
        num++;
        printNum(num);
    }
}
