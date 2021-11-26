package data_structure.Arrays;

public class MaximumDifferenceOfTwo {

    // Demo
    // Input  = {1,2,90,10,110}
    // Output = 109

    // Explanation : Here the maximum difference is between 1 and 110 and the greater number is
    // also after the smaller number.

    public static void main(String[] args) {

        int[] a = {110,105,100,90,10};

        int maxDiff = getMaxDiff(a,a.length);
        System.out.println(maxDiff);
    }

    private static int getMaxDiff(int[] a, int length) {
        if (length <= 1)
            return a[0];

        // approach : to keep local max_diff and local min_element while traversing the array
        int maxDiff = a[1] - a[0];
        int minElement = a[0];

        for (int i = 1; i < length; i++) {

            if (a[i] - minElement > maxDiff)
                maxDiff = a[i] - minElement;
            if (a[i] < minElement)
                minElement = a[i];
        }

        return maxDiff;
    }

}
