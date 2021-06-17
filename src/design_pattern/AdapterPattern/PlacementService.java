package design_pattern.AdapterPattern;

import java.io.IOException;

public class PlacementService {

    EmployeeService employeeService = new EmployeeService();

    public Employee process(Student student) throws IOException {

        if (student.getMarks()>70){
            employeeService.saveEmployee(EmployeeAdapter.getEmployee(student));
            return EmployeeAdapter.getEmployee(student);
        }
        return null;
    }
}
