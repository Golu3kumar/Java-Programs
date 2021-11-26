package design_pattern.AdapterPattern;

import java.io.IOException;

public class PlacementService {

    EmployeeService employeeService = new EmployeeService();

    public Employee process(Student student) throws IOException {

        if (student.getMarks()>70){
            // here EmployeeAdapter class convert Student into Employee.
            Employee newEmp = EmployeeAdapter.getEmployee(student);
            employeeService.saveEmployee(newEmp);
            return newEmp;
        }
        return null;
    }
}
