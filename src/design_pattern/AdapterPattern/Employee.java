package design_pattern.AdapterPattern;

// Employee POJO
public class Employee {

    private int empId;
    private String empName;
    private String empDob;

    public Employee(int empId, String empName, String empDob) {
        this.empId = empId;
        this.empName = empName;
        this.empDob = empDob;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpDob() {
        return empDob;
    }

    public void setEmpDob(String empDob) {
        this.empDob = empDob;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDob=" + empDob +
                '}';
    }
}
