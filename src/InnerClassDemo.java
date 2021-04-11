

// Inner Class : Inner class is class that is belongs to a particular class.
// This class used as supportive of outer class.
// This can be : Non - Static, Static and Anonymous class.

class OuterClass{
    // member variable
    int id;

    // Constructor
    OuterClass(){
        System.out.println("This is outer class constructor");
    }

    //class InnerClass{ // Non - Static class
    static class InnerClass{ // static class
        //Inner class variable
        String name;

        // Inner class constructor
        InnerClass(){
            System.out.println("This is Inner class constructor");
        }
    }


}
public class InnerClassDemo {
    public static void main(String[] args) {
        // OuterClass object creation.
        OuterClass out = new OuterClass();

        // to create inner class object we have to follow this approach
        // this approach is for Non - Static class.
        //OuterClassName.InnerClassName = OuterClassObject.new InnerClassName();
        //OuterClass.InnerClass innerClass = out.new InnerClass();

        //for static class :
        OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass();
        OuterClass.InnerClass innerClass2 = new OuterClass.InnerClass();

        innerClass1.name = "Golu Kumar";
        innerClass2.name = "Samrat Kumar";

        System.out.println(innerClass1.name);
        System.out.println(innerClass2.name);
    }
}
