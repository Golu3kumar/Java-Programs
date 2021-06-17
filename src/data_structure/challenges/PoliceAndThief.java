package data_structure.challenges;

import java.util.ArrayList;
import java.util.Arrays;

public class PoliceAndThief {
    // Read below comments.
    // Police And Thief Problem
    // Condition :
    // There is an Array that contain only two types of character 'P' and 'T'
    // A Police can caught only one thief
    // Police can caught only that thief which is 'K' nearest by that Police;
    // Find maximum thief can be caught.
    // Example :
    // arr = {'P','T','T','P','P','T','T'}
    // 1 :
    // K = 1
    // Output : 3 (Last Thief can not be caught because it's distance is 2 from nearest Police.
    // 2 :
    // k = 2
    // Output : 3
    public static void main(String[] args) {

        char[] arr = new char[]{'P', 'P', 'T', 'T', 'T', 'P', 'T','T','T','P'};
        int n = arr.length;
        System.out.println("Number of caught thief(k = 2) : " + caughtThief(arr, n, 2));
        System.out.println("Number of caught thief(k = 3) : " + caughtThief(arr, n, 3));
        System.out.println("Number of caught thief(k = 1) : " + caughtThief(arr, n, 1));
    }

    private static int caughtThief(char[] arr, int n, int k) {
        ArrayList<Integer> polices = new ArrayList<>(); // 0,1,5,9
        ArrayList<Integer> thieves = new ArrayList<>(); // 2,3,4,6,7,8

        for (int i = 0; i < n; i++) {
            if (arr[i] == 'P')
                polices.add(i);
            else if (arr[i] == 'T')
                thieves.add(i);
        }

        int l = 0, r = 0,count = 0;
        while (l<thieves.size() && r<polices.size()){
            if (Math.abs(thieves.get(l) - polices.get(r))<=k){
                count++;
                r++;
                l++;
            }
            else if (thieves.get(l) < polices.get(r))
                l++;
            else
                r++;
        }

        return count;
    }
}
