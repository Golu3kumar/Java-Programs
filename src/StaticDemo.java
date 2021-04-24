
// static : In java when everything is belongs to an object,
// but when we declare as static it means it is class specific not object itself.
// Consider an example as there is a class Student and it contains three variable std_roll,std_name and principal_name
// we create to object of Student class that is Nikhil and Ram and we initialize their corresponding variable.
// Suppose principal_name is "Rahul Kumar" for both the
// students(Ram and Nikhil). as there is only one Principal in a school
// But due to covid - 19 ,the principal is changed, and the new principal_name is "Ankit Singh"
// so here is that we change principal of Ram student but it
// didn't reflect to Nikhil object as principal_name is object specific. So to make new principal
// we have to change in each and every object of student class. (Oh that is tedious..)
// so too avoid this scenario we have to mention principal_name to class specific
// i.e. achieved by using static keyword.(Life is so simple now!)
// see the demo.
// To reference static member we can use classname.member_name;

class Student {
    int roll;
    String std_name; // by default null
    static String principal_name; // by default null

    Student() {
        System.out.println("This is constructor");
    }

    // static block : used to initialize static members
    // it executes before constructor
    static {
        principal_name = "Rahul Kumar";
        System.out.println("In static block");
    }

    void print() {
        System.out.println(roll + " : " + std_name + " : " + principal_name);
    }

    static void printPrincipalName() {
        //roll = 5; // Error : static method access only static members
        System.out.println("Principal Name : " + principal_name);
    }
}

public class StaticDemo {
    // even main method is also static as it called without creating object of this class.
    //if you remove static keyword, then welcome to the DeadLock Arena!
    public static void main(String[] args) {
        Student nikhil = new Student();
        nikhil.roll = 50;
        nikhil.std_name = "Nikhil Kumar";
        Student.principal_name = "Rahul Kumar"; // accessing static member.

        Student ram = new Student();
        ram.roll = 49;
        ram.std_name = "Ram Kumar";
        Student.principal_name = "Ankit Singh";

        nikhil.print();
        ram.print();

        Student.printPrincipalName();// calling static method

    }
}
