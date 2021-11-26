package Anotations;


import java.lang.annotation.Annotation;

// Using custom Annotation
@BasicBenefits(bId = "102", bName = "Special class B Employees")
public class Employee {

    private final String id;
    private final String category;

    public Employee(String id, String category) {
        this.id = id;
        this.category = category;
    }

    public void printInfo() {
        System.out.println("Id : " + this.id + "\nCategory : " + this.category);
    }

    public static void main(String[] args) {

        Employee emp = new Employee("1000", "Developer");
        emp.printInfo();

        // Getting class Annotation value
        Class empClassName = emp.getClass();
        Annotation ant = empClassName.getAnnotation(BasicBenefits.class);
        BasicBenefits basicBenefits = (BasicBenefits) ant;

        System.out.println("bId : " + basicBenefits.bId());
        System.out.println("bName : " + basicBenefits.bName());
    }
}
