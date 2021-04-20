import java.util.Arrays;

public class VarargsDemo {

    // varargs : varargs is a variable length of arguments i.e. we can pass any no. of arguments to a method.
    // this is achieved by using ... (three dots).
    // Here int ... n , n act as an array
    public int sum(int... n) {
        return Arrays.stream(n).sum();
    }

    public static void main(String[] args) {


        VarargsDemo varargsDemo = new VarargsDemo();

        // we can pass any no. of arguments
        // here we pass 4 arguments
        System.out.println("Sum : " + varargsDemo.sum(8, 4, 3, 2));
        // here we pass 2 arguments
        System.out.println("Sum : " + varargsDemo.sum(8, 4));
    }
}
