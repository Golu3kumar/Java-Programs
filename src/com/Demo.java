package com;

public class Demo {


    public static void main(String[] args) {

//        System.out.println(angle("09:06"));

        System.out.println(factorialSum(new int[]{264,653,780,396,360,122}));
    }

    public static int check(String[] B) {
        int count = 0;
        for (int i = 0; i < B.length; i++) {

            if (B[i].charAt(0) == 'A' || B[i].charAt(0) == 'a')
                count++;
        }

        return count;
    }

    public static int angle(String time) {

        String[] arr = time.split(":");
        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        if (h == 12)
            h = 0;
        if (m == 60) {
            m = 0;
            h += 1;
            if (h > 12)
                h = h - 12;
        }
        int hour_angle = (int) (0.5 * (h * 60 + m));
        int minute_angle = (int) (6 * m);
        int angle = Math.abs(hour_angle - minute_angle);
        angle = Math.min(360 - angle, angle);
        return angle;
    }

    public static int factorialSum(int[] arr) {

        int[] sumArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int sum = 0;
            while (n > 0 || sum > 9) {
                if (n == 0) {
                    n = sum;
                    sum = 0;
                }
                sum += n % 10;
                n /= 10;
            }
            sumArr[i] = sum;
            System.out.print(sum+" ");
        }

        System.out.println();

        int c = 0;
        for (int i = 0; i < sumArr.length; i++) {
            sumArr[i] = factorial(sumArr[i]);
            System.out.print(sumArr[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            int[] memo = new int[10];
            int n = sumArr[i];
            boolean flag = true;
            while (n > 0) {
                int k = n % 10;
                memo[k]++;
                n /= 10;
            }

            int r = arr[i];
            while (r > 0) {
                int k = r % 10;
                if (memo[k] == 0) {
                    flag = false;
                    break;
                }
                r /= 10;
            }
            if (flag) {
                c++;
            }
        }

        return c;

    }

    private static int factorial(int i) {
        if (i == 0)
            return 1;
        if (i <= 2)
            return i;
        return i * factorial(i - 1);
    }
}
