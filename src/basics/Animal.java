package basics;

public class Animal {

    // properties
    String name;
    int age;
    String color;
    double height;
    boolean isVeg;
    String talk;

    // behavior
    void speaking(){
        System.out.println(name + " is barking....");

    }

    //
    void walk(){

        System.out.println(name + " is walking....");

    }


    public static void main(String[] args) {

        // object creation
        Animal cat = new Animal();
        cat.name = "cat";
        cat.walk();

        Animal dog = new Animal();
        dog.name = "dog";
        dog.speaking();

    }

}
