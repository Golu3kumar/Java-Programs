package java_interview_challenges;

public class PrintOneToHundredWithoutUsingNumber {
    // In this program we print 1 to 100 without using any number.
    // let's do it.

    public static void main(String[] args) {
        // Method 1 :
        int one = 'A' / 'A'; // we got here 1
        String ten = ".........."; // here length of ten is 10
        // now we start for loop
        for (int i = one; i <= (ten.length()*ten.length()); i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        // Method 2:
        for (int i = one; i <= 'd'; i++) { // here Unicode Value for 'd' = 100
            System.out.print(i+" ");
        }
    }

}
