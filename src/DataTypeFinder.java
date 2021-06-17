import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. off test cases: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String val = sc.next();
            try {
                long longVal = Long.parseLong(val);
                System.out.println(val + " can be fitted in:");
                if (longVal >= -128 && longVal <= 127) {
                    System.out.println("* byte\n* short\n* int\n* long");
                }
                else if (longVal >= -32768 && longVal <= 32767) {
                    System.out.println("* short\n* int\n* long");
                }
                else if (longVal >= -2147483648 && longVal <= 2147483647) {
                    System.out.println("* int\n* long");
                }else {
                    System.out.println("* long");
                }
            }catch (Exception e){
                System.out.println(val+" can't be fitted.");
            }
        }
    }
}
