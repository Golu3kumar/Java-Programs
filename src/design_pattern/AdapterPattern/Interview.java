package design_pattern.AdapterPattern;

import java.io.IOException;

public class Interview {

    // main class that conduct Interview

    public static void main(String[] args) throws IOException {

        System.out.println("Welcome to the interview!");
        Student nikhil = new Student("Nikhil Barnwal",2001,"25/10/2001",79);

        PlacementService interviewProcess = new PlacementService();
        Employee employee = interviewProcess.process(nikhil);

        if (employee!=null){
            System.out.println("Congrats! "+nikhil.getName());
            System.out.println("Now you are the part of our company as : ");
            System.out.println(employee.toString());
        }else {
            System.out.println("You need to work hard "+nikhil.getName());
            System.out.println("Try again!");
        }
    }
}
