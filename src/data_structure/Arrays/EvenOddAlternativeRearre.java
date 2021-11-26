package data_structure.Arrays;

import java.util.ArrayList;
import java.util.Arrays;

class EvenOddAlternativeRearrangement {

    public static void main(String[] args) {

        int[] arr = { 9, 8, 13, 2, 19, 14 };
        int n = arr.length ;

        alternateRearrange(arr, n);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    private static void alternateRearrange(int[] arr, int n) {
        Arrays.sort(arr);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (arr[i] %2 == 0)
                even.add(arr[i]);
            else
                odd.add(arr[i]);
        }
        boolean isEven = false;
        if (arr[0] % 2==0)
            isEven = true;

        int i = 0,j =0, index = 0;
        while (index < n){
            if (isEven && i < even.size()){
                arr[index] = even.get(i);
                i++;
            }else if(!isEven && j < odd.size()){
                arr[index] = odd.get(j);
                j++;
            }
            index++;
            isEven = !isEven;
        }
    }
}
