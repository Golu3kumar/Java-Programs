package data_structure.challenges;

public class MoveZeroesInTheEndOfArray {

    public static int[] arr = {0,4,0,2,1,0,7};

    // function to perform swap
    public static void zeroShifter(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void zeroTailing(int[] arr){
        // pointer for index of zeros
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            // if arr of i != 0 and arr of j == 0 then perform swap
            if (arr[i]!=0 && arr[j]==0)
                zeroShifter(i,j);

            // if arr of j != 0 , then increment
            if (arr[j] != 0)
                j++;
        }
    }

    public static void main(String[] args) {

        //before shifting zeroes
        System.out.println("Before shifting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        zeroTailing(arr);

        // let's print the array
        System.out.println();
        System.out.println("after shifting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
