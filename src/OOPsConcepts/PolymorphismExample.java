package OOPsConcepts;


// Polymorphism : It is a ability to show output in multiple form.
// Polymorphism is something that to display in more than one form.
// Real world example of Polymorphism is a Human who can be an Employee, Husband and Father at the same time.
// But Behavior is changed as per situation.
// Polymorphism can be achieved as two types :
// 1. Compile time Polymorphism(Method Overloading)
// 2. Runtime Polymorphism(Method Overriding)

// 1. Method Overloading : It can be achieved at compile time.
// When we have more than one method having same name but different no. parameter
// or different types of parameter then it is called method overloading.
// Which method is executed is decided on compile time that's why it is called compile time polymorphism.
// Let's see Demo.

class MethodOverloadingDemo{

    void showInfo(){
        System.out.println("This is showInfo1, having no parameter");
    }
    void showInfo(String name){
        System.out.println("This is showInfo2, having 1 parameter as : "+name);
    }
    void showInfo(int roll){
        System.out.println("This is showInfo2, having 1 parameter as : "+roll);
    }
}

// 2. Method Overriding : This can be achieved at Runtime.
// When a Sub class override a method of Super class and provide
// their own implementation is called Method Overriding.
// Which method executes is decide on runtime that's why it is called Runtime polymorphism.
// The signature of method does not changed.

class MethodOverriding extends MethodOverloadingDemo{
    // Annotation : Override, tells this method is override
    @Override
    void showInfo() {
        super.showInfo();// calling super showInfo() method

        System.out.println("This is methodOverriding without parameter");
    }
    // It is not necessary to specify Override annotation, but it's standard.
    @Override
    void showInfo(String name) {
        System.out.println("This is methodOverriding with parameter : "+name);
    }

    void config(){
        System.out.println("This is special method of MethodOverriding class.");
    }
}
public class PolymorphismExample {
    public static void main(String[] args) {
        MethodOverloadingDemo methodOverloadingDemo = new MethodOverloadingDemo();
        // calling showInfo1
        methodOverloadingDemo.showInfo();
        // calling with one parameter String
        methodOverloadingDemo.showInfo("Nikhil");
        // calling with one parameter integer.
        methodOverloadingDemo.showInfo(48);

        // referencing MethodOverloading class but create object MethodOverriding class
        methodOverloadingDemo = new MethodOverriding();
        // so what happened here methodOverloadingDemo object can access only those method that present on both class.
        // as config method not in super class so, we got an error.
        //methodOverloadingDemo.config(); Error : config method is not in super class.
        // calling showInfo method of Sub class
        methodOverloadingDemo.showInfo("Nikhil kumar");

        methodOverloadingDemo.showInfo();


    }
}
