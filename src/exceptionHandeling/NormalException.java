package exceptionHandeling;

//Exception = An exception is a problem that occur during the program execution
// It may be occur at compile time or run time.
public class NormalException {
    public static void main(String[] args) {
        int a = 19, b = 0;
        try {
            int c = a / b;
            System.out.println("divide is " + c);
        } catch (ArithmeticException e) {
            System.out.println("An exception is occur : ");
            System.out.println(e.getLocalizedMessage());
        }

        try {
            int num = Integer.parseInt("Hello");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("An exception occur : " + e.getLocalizedMessage());
        }
    }
}
