package com.interfacesAndAbstractClasses;

//Abstract class : Abstract class are those classes which are not instantiated.
// Suppose a scenario where we create a class and we want that
// no one can create object of that class, it means it only extends from other classes to implements
// methods of abstract class.
// Abstract classes are used for future perceptive where method implementation doesn't provided.
// Abstract classes also contain non - Abstract methods as well as constructor and variables.

// Abstract class Human
abstract class Human{ // this is called abstract class
    // we need to mention abstract keyword to make abstract class as well as abstract method
    public abstract boolean canWalk();

    // normal method with their own implementation.
    public void name(String name){
        System.out.println("Name : "+name);
    }
}

// extending Abstract Human class from Man class
// We must Override the abstract methods that are present in Human class.
class Man extends Human{ // this is called concrete class
    // we can omit @Override annotation
    @Override
    public boolean canWalk() {
        return true;
    }

    public void callCanWalkMethod(){
        boolean walk = canWalk();

        if (walk) System.out.println("Yes! You can walk.");
    }

}
public class AbstractClass {
    public static void main(String[] args) {
        //Human human = new Human(); // Error : We can not create Object of Abstract class.
        // But we can create reference of a abstract class. but it can access only those member
        // which are present in both of the class.
        Human human = new Man();
        human.name("Golu Kumar");
        // creating object of Man class
        Man man = new Man();
        man.callCanWalkMethod();
    }
}
