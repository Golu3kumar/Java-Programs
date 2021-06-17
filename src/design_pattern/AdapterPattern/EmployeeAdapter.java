package design_pattern.AdapterPattern;

public class EmployeeAdapter {

    // So here we are , The most imp topic probably.
    // Adapter class : Adapter design pattern in java is a structural design pattern.
    // It provides solution for helping incompatible things to communicate with each other.
    // It works as an inter-mediator who takes output from one client and
    // gives it to other after converting in the expected format.
    // Adapter pattern is also known as wrapper.

    // in this example this adapter class provide Employee class to the PlacementService class
    // which further provide to EmployeeService class in order to store the data.
    // The cool thing is that this Adapter class is converting Student into Employee,
    // How cool is that?
    public static Employee getEmployee(Student student){
        return new Employee(student.getRollNumber(),student.getName(),student.getDob());
    }
}
