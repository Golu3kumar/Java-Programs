package data_structure.challenges;

public class LCM {

    // find LCM of two given number
    // 20  = 4 * 5
    // 15  = 3 * 5
    // Union of both factors  = 3 * 4 * 5 = 60 is the answer.

    // Brute force approach

    public static void main(String[] args) {

        int a = 29;
        int b = 15;

        System.out.println("Lcm of " + a + " and " + b + " is " + lcmByBruteForce(a, b));
        System.out.println("Lcm of " + a + " and " + b + " is " + lcmByGCD(a, b));
        System.out.println(GCD(20,15));

    }

    private static int lcmByGCD(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        return (a*b)/GCD(a,b);
    }

    private static int GCD(int a, int b) {
        if(b == 0)
            return a;
        return GCD(b,a%b);
    }


    private static int lcmByBruteForce(int a, int b) {
        if ( a == 0 || b == 0)
            return 0;
        int lcm = Math.max(a, b);
        while (true){

            if (lcm % a == 0 && lcm % b == 0){
                return lcm;
            }
            lcm ++;
        }

    }
}
