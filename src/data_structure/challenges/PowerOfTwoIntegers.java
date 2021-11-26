package data_structure.challenges;

public class PowerOfTwoIntegers {
    // given a integer


    public static void main(String[] args) {

        int num = 25;
        boolean res = isPerfect(num);
        System.out.println(res);
    }

    private static boolean isPerfect(int num) {

        int p;
        for (int i = 1; i <= (int)Math.sqrt(num); i++) {

            p = (int)(Math.log(num)/Math.log(i));
            if (Math.pow(i,p) == num) return true;
        }
        return false;
    }
}
