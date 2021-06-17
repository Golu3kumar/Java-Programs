package data_structure.challenges;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;


public class NumberOfPair {

    // this is Brute Force Approach
    // Time Complexity = O(n^2) (Very High).
    public static int numberOfDifference(int[] arr, int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }

    // we can improve it by using another technique
    // here we have to find pairs like that x - y = k
    // so we can change like that x = k+y
    // time complexity = O(nlog n)
    public static int numberOfDifferenceMethod2(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < n; i++) {
            // we can find the element using binary search.
            if (isPaired(arr, i + 1, n - 1, arr[i] + k)) {
                count++;
            }
        }

        return count;
    }

    // binary search for method2
    private static boolean isPaired(int[] arr, int l, int n, int x) {
        if (n >= l) {
            int mid = l + (n - l) / 2;
            if (arr[mid] == x)
                return true;
            if (x > arr[mid])
                return isPaired(arr, mid + 1, n, x);
            else
                return isPaired(arr, l, mid - 1, x);
        }
        return false;
    }

    // we can also improve this problem by using HashTable
    // we can solve this problem in O(n) time.
    // let's do it
    public static int numberOfDifferenceUsingHashTable(int[] arr, int n, int k) {
        // here we create a HashTable that store the array elements with respect to their index
        // like element having data 7 stored on index 7 ( for avoiding collision )
        int count = 0;
        // we create array with 100 elements
        int[] hashTable = new int[100];
        // add elements in hashTable on their index
        for (int i = 0; i < n; i++) {
            hashTable[arr[i]] = arr[i];
        }

        // now look for pairs
        for (int i = 0; i < n; i++) {
            int x = arr[i] + k;
            // here we search that sum of k and arr[i] is available in hashTable or not
            if (hashTable[x] == x) {
                count++;
            }
        }

        return count;

    }


    public static void main(String[] args) {

        int[] arr = {1, 7, 5, 9, 2, 12, 3};
        int n = arr.length;
        // k is difference of pair.
        int k = 8;

        long timeInMillisSecond1 = TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis());
        System.out.println("Number of difference : " + numberOfDifference(arr, n, k));
        long timeInMillisSecond2 = TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis());
        System.out.println("Time(ms) taken by Brute Force : " + (timeInMillisSecond2 - timeInMillisSecond1));

        timeInMillisSecond1 = TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis());
        System.out.println("Number of difference(method 2) : " + numberOfDifferenceMethod2(arr, n, k));
        timeInMillisSecond2 = TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis());
        System.out.println("Time(ms) taken by Method 2 : " + (timeInMillisSecond2 - timeInMillisSecond1));

        timeInMillisSecond1 = TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis());
        System.out.println("Number of difference(Using Hashing) : " + numberOfDifferenceUsingHashTable(arr, n, k));
        timeInMillisSecond2 = TimeUnit.MILLISECONDS.toMillis(System.currentTimeMillis());
        System.out.println("Time(ms) taken by Hashing Method : " + (timeInMillisSecond2 - timeInMillisSecond1));


    }
}
