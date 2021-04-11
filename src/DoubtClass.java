class A{
    int a = 5; // we can initialize variables in the class
    float b = 5.4f;
    int c; // by default is 0
}
public class DoubtClass {

    static int a = 5;
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.b+a.a);
        int d;
        //System.out.println(d); //Error d must be initialized
        System.out.println(DoubtClass.a);


    }
}
