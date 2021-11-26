package data_structure.Math;

public class TrailingZeroInFactorial {

    // demo 1 :
    // 5! = 120
    // so the answer is 1 as 120 has only one zero

    // 26! = 403,291,461,126,605,635,584,000,000
    // answer = 6.

    public static void main(String[] args) {

        int n = 26;

        System.out.println("Number of trail zeros "+getTrailingZero(n));
        System.out.println("Number of trail zeros "+getTrailingZero(12));
        System.out.println("Number of trail zeros "+getTrailingZero(19));
        System.out.println("Number of trail zeros "+getTrailingZero(0));
        System.out.println("Number of trail zeros "+getTrailingZero(4));
    }

    // as we know every number which contains zero in the end, is multiple of 2 and 5
    // so if we can count number of 5s in factors then we can tell how many zero at the end
    // look 28 = 1 * 2 * 3 * 4 * 5 * 6 * 7 * 8 * 9 * 10 * 11 * 12 * 13 ... * 15 .... * 20 ... * 25 .. * 28
    // as 5, 10 , 15, 20 give one 5 but 25 give us two 5s so therefore number of 5s = 6.
    private static int getTrailingZero(int n) {

        int count = 0;
        for(int i = 5;n/i >= 1; i*=5){
            count += n/i;
        }

        return count;
    }
}
