package data_structure.challenges;

public class MoveZeroesInTheEndOfArray {

    public static int[] arr = {5,4,0,2,1,0,7};

    // function to perform swap
    public static void zeroShifter(int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {

        //before shifting zeroes
        System.out.println("Before shifting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        // j variable is for locating zero
        int j = 0;
        // i variable is for traversing whole array.
        for (int i = 0; i < arr.length; i++) {
            // here if arr of j is zero and i is non zero then we performed swap
            if (arr[i]!=0 && arr[j]==0)
                zeroShifter(i,j);

            // here if arr of j is not zero then we increment j by 1
            if (arr[j]!=0)
                j++;
        }

        // let's print the array
        System.out.println();
        System.out.println("after shifting : ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
