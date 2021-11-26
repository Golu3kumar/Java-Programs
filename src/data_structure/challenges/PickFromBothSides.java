package data_structure.challenges;

public class PickFromBothSides {

//    Example Input
//    Input 1:
//    A = [5, -2, 3 , 1, 2]
//    B = 3

//    Input 2:
//    A = [1, 2]
//    B = 1

//    Example Output
//    Output 1: 8
//    Output 2: 2

    public static void main(String[] args) {

        int[] A = {5, -2, 3, 1, 2};
        int maxSum = pickElements(A, 3);
        System.out.println(maxSum);
    }

    private static int pickElements(int[] A, int B) {
        int sum = 0;
        for (int i = 0; i < B; i++) {
            sum += A[i];
        }

        int lSum = sum, rSum = 0, idx = B - 1, i = A.length - 1;
        while (idx >= 0){
            rSum += A[i];
            lSum -= A[idx];
            sum = Math.max(rSum+lSum,sum);
            i--;
            idx--;
        }
        return sum;
    }
}
