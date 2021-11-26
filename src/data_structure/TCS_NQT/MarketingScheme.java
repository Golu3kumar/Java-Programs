package data_structure.TCS_NQT;

import java.util.Scanner;

public class MarketingScheme {

    public static void main(String[] args) {

        int amount = 5000;
        Scanner sc = new Scanner(System.in);
        String par = sc.nextLine();
        String hasChild = sc.nextLine();

        if (hasChild.equals("N")){
            System.out.println("TOTAL MEMBERS: 1");
            System.out.println("COMMISSION DETAILS");
            System.out.println(par+": 250 INR");
        }else if (hasChild.equals("Y")){
            String childrenNames = sc.nextLine();
            String[] children = childrenNames.split("[ ,]+");
            // parent details
            System.out.println("TOTAL MEMBERS: "+(children.length+1));
            System.out.println("COMMISSION DETAILS");
            System.out.println(par+": "+500* children.length+" INR");
            for (String child : children) {
                System.out.println(child+": 250 INR");
            }
        }
    }
}
