package design_pattern.AdapterPattern;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EmployeeService {

    public static final String FILE_NAME = "emp.txt";
    public void saveEmployee(Employee emp) throws IOException {
        File newEmpFile = new File(FILE_NAME);
        if (!newEmpFile.exists()){
            newEmpFile.createNewFile();
            newEmpFile.setWritable(true);
        }
        FileWriter fileWriter = new FileWriter(FILE_NAME);
        fileWriter.append(emp.toString());
        fileWriter.close();
    }
}
