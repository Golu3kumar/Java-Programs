package design_pattern.AdapterPattern;

// Student POJO
public class Student {

    private String name;
    private int rollNumber;
    // Date class : we will cover later.
    private String dob;
    private int marks;

    public Student(String name, int rollNumber, String dob, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.dob = dob;
        this.marks = marks;
    }

    // getters and setters for properties.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
