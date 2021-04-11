
// String : It is an object that store sequence of characters. They are Immutable in nature.
public class StringManipulation {
    public static void main(String[] args) {
        // String can be stored in two manners
        //1. Intern way or string literals
        // It stores the string literals into String pool
        // String pool , stored into Heap Memory, is collection of String literals having no duplicate literals
        // str ,referencing to to "Hello" string literal, is hashCode in the form of Hexadecimal
        String str = "Hello"; // it first checks whether "Hello" is already available in the pool or not
        // if "Hello" is already available in the pool then, it returns it referencing address,
        // otherwise create a new Literals into the pool
        // Here both str and str1 referencing to the same literals in the pool i.e. having same hashCode.
        String str1 = "Hello";

        // == operator just check the hashCode of the reference variables(str and str1), so it always true
        // == never check string literals are same or not
        if (str1 == str)
            System.out.println("str == str1");
        else
            System.out.println("str != str1");

        //2. new String object creation
        // by using new keyword string objects are created into the Heap memory.
        // str3 and str4 referencing to different object of hashCode .

        String str3 = new String("Patna");
        String str4 = new String("Patna");

        // as == operator operates on the hashCode address so it always different i.e. always false
        if (str3 == str4)
            System.out.println("str3 == str4");
        else
            System.out.println("str3 != str4");

        // here equals method works on the values of the String objects, so it returns true
        if (str.equals(str1))
            System.out.println("str is same as str1");
        else
            System.out.println("str is not same as str1");

        // similar to above
        if (str3.equals(str4)) System.out.println("str3 is same as str4");

        // Strings are Immutable, means any manipulation in string is ignored on the original string
        str.concat("Golu");//str remain unchanged, but it creates a new String literal into a pool
        System.out.println(str);

        // There are also mutable form of String i.e StringBuffer and StringBuilder

        //StringBuffer : It is mutable String that store sequence of characters
        StringBuffer sf = new StringBuffer("India"); // StringBuffer is thread safe i.e already synchronised
        sf.append(" is Most Loved Country!");
        System.out.println(sf);

        //StringBuilder : It is similar to StringBuffer but it's not thread safe(needs to be synchronised explicitly)
        StringBuilder sb = new StringBuilder("Life is a ");
        sb.append("collection Moments!");
        System.out.println(sb);
        System.out.println(sb.reverse()); // reversing the string

        // Done.

    }
}
