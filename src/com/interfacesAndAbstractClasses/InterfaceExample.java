package com.interfacesAndAbstractClasses;

// Interfaces are just like class but it hides the implementation of methods.
// these are used to achieve multiple inheritance
interface Mobile{
    void RAM();
    void ROM();
    boolean hasSimSlot();
}
interface Laptop{
    void screenSize();
    void batteryCapacity();
    boolean hasKeyboard();
}

class Tablet implements Mobile,Laptop{
    Tablet(){
        RAM();
        ROM();
        screenSize();
        batteryCapacity();
    }

    @Override
    public void RAM() {
        System.out.println("Tablet has 8GB RAM");
    }

    @Override
    public void ROM() {
        System.out.println("Tablet has 16GB ROM");
    }

    @Override
    public boolean hasSimSlot() {
        return true;
    }

    @Override
    public void screenSize() {
        System.out.println("Tablet has big screen of size 8'inch");
    }

    @Override
    public void batteryCapacity() {
        System.out.println("It's battery capacity is 8000 mAH");
    }

    @Override
    public boolean hasKeyboard() {
        return false;
    }
}
public class InterfaceExample {
    public static void main(String[] args) {
        Mobile mobile = new Tablet();
        Laptop laptop = new Tablet();
        System.out.println("Tablet has sim slot : "+mobile.hasSimSlot());
        System.out.println("Tablet has keyboard : "+laptop.hasKeyboard());
    }
}
