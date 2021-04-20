package com.package1; // this is package

import com.package2.*;
// package : package is a collection of classes and interfaces that are combined to together to form a package.
// Access Modifiers : Access Modifiers are used to provide restriction on the accessibility
// of the variables as well as methods and class.
// these are the access modifiers in java :
// 1. final : this can be accessed only within the same package but can not be inherited
// 2. abstract :
// 3. default Member : by default all the members of class are default in nature that can be
// -> accessed within the same package(in any class).We can not access outside the package.
// 4. public : It can be accessed any where within the project(any package any class any where)
// 5. protected : It can be accessed in any class within the same package and sub classes of different package.
// 6. private : It can be only access within the same class using member methods.
// -> It can not be visible outside the class even within the same package
public class Features {
    // default member variable
    int amt = 0;

    // method to withdraw amount
    // protected in nature
    public void withdraw(int amt) {
        this.amt = amt;
        if (amt <= CBI_Bank.currentBalance) {
            CBI_Bank.currentBalance -= amt;
            System.out.println("Amount is Withdraws!");
            System.out.println("Thanks for Using CBI Bank");
        } else System.out.println("You don't have much balance to withdraw!");
    }

    public void deposit(int amt){
        this.amt = amt;
        CBI_Bank.currentBalance+=amt;
        System.out.println("Amount is deposited!");
        System.out.println("Thanks for using CBI Bank!");
    }

    public void showBalance(){
        System.out.println("Current Balance : "+CBI_Bank.currentBalance);
    }

}
