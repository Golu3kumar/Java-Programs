package com.interfacesAndAbstractClasses;

class Demo{
    // Number is an abstract class
    // It can be anything Integer, Float, Double etc.
    void printSomething(Number num){
        System.out.println(num);
    }
}
public class AbstractDemo {

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.printSomething(5);// passing Integer value
        demo.printSomething(5.6);// passing Double value
    }
}
