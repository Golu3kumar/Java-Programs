public class BoundedType<T extends A> {

//    <T extends superClassName>
//    Note that, in this context, extends is used in a general sense to mean either “extends”
//    (as in classes). Also, This specifies that T can only be replaced by superClassName,
//    or subclasses of superClassName. Thus, superclass defines an inclusive, upper limit.

    private T refObj;

    public BoundedType(T refObj) {
        this.refObj = refObj;
    }

    public void doRunTest(){
        this.refObj.displayClass();
    }
}

class A{

    int a = 0;
    public void displayClass(){
        System.out.println("From class A");
    }
}

class B extends A{

    public void displayClass(){
        System.out.println("From class B");
    }
}

class C extends A{

    public void displayClass(){
        System.out.println("From class C");
    }
}

class BoundTest{

    public static void main(String[] args) {

        // bounded type for class c
        BoundedType<C> bec = new BoundedType<>(new C());
        bec.doRunTest();
        BoundedType<B> beb = new BoundedType<>(new B());
        beb.doRunTest();
        BoundedType<A> bea = new BoundedType<>(new A());
        bea.doRunTest();

        // contains error as String not extend from class A
        //BoundedType<String> bes = new BoundedType<String>(new String());


    }
}


