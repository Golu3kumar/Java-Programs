
// Java is Object Oriented Programming Language but it's not completely true.
// Because Java supports primitive datatype like int, float, long, char etc.
// they are fast in execution but it's doesn't used in some cases.
// Java provide some wrapper classes which will used in some of the frameworks like JSP, HyberNate etc.
// They are not fast as compare to primitive data types but although it is used.
// they are : Integer, Float , Long, String etc.
public class WrapperClasses {
    public static void main(String[] args) {
        // primitive data type initialization.
        int a = 43;

        // Wrapping or Boxing in OOPS term.
        Integer integer = new Integer(5); // It is deprecated in Java 9

        System.out.println(integer.intValue()); // this is called unboxing or unwrapping.

        Integer int1 = a; // this is called autoboxing
        int i = int1; // this is called auto unboxing
        System.out.println(i);

        // Preferred of doing wrapping or Boxing

        Integer n = Integer.valueOf(a);
        System.out.println(n);

        // we can convert String into int as

        Integer value = Integer.parseInt("99");

        System.out.println("Type of value is : "+value.getClass().getName());

    }
}
