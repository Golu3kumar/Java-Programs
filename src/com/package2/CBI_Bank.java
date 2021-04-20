package com.package2;

import com.package1.Features;

import java.util.Scanner;

public class CBI_Bank {
    // In order to access in different package we have to used public keyword.
    static public int currentBalance = 0;
    public static void main(String[] args) {
        System.out.println("Welcome to CBI Bank!");
        Scanner scanner = new Scanner(System.in);
        Features features = new Features();
        while (true){
            System.out.println("1. View Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    features.showBalance();
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw : ");
                    int withdrawAmt = scanner.nextInt();
                    features.withdraw(withdrawAmt);
                    break;
                case 3:
                    System.out.println("Enter amount to Deposit : ");
                    int depositAmt = scanner.nextInt();
                    features.deposit(depositAmt);
                    break;
                case 4:
                    System.exit(1);
                default:
                    System.out.println("Please enter correct option");
                    break;

            }
        }
    }

}
