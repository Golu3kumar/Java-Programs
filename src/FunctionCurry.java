import java.util.function.Function;

public class FunctionCurry {

//    Function Currying is a concept of breaking a function with many arguments into
//    many functions with single argument in such a way, that the output is same.

    public static void main(String[] args) {

        Function<Integer,Function<Integer,Integer>>
                curryAdd = u -> v -> u+v;

        System.out.println("Sum of 4,5: "+curryAdd.apply(4).apply(5));

        Function<Integer,Function<Integer,Function<Integer,Integer>>>
                curryMul = x -> y -> z -> x*y*z;

        System.out.println("Multiply of 4,5,6: "+curryMul.apply(4).apply(5).apply(6));
    }
}
