package java_interview_challenges;

import java.util.Arrays;
import java.util.BitSet;

public class OneToHundredWithoutLoopAndRecursion {

    public static void main(String[] args) {

        // Method 1 : Array fill
        Object obj[] = new Object[100];
        Arrays.fill(obj, new Object() {
            int count = 0;

            @Override
            public String toString() {
                return Integer.toString(++count);
            }
        });

        System.out.print(Arrays.toString(obj));
        System.out.println();

        // Method 2 : BitSet class
        String set = new BitSet() {{
            set(1, 101);
        }}.toString();

        System.out.append(set,1,set.length());

    }
}
