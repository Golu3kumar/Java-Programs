class Cars {
    String name;
    String color;
    int price;

    public Cars() {
        // default constructor(No parameter)
        System.out.println("In cars default constructor");
    }

    // constructor overloading
    public Cars(String name, String color, int price) {
        // parameterized constructor
        this.name = name;
        this.color = color;
        this.price = price;
        System.out.println("In cars parameterized constructor");
        System.out.println(this.name + " : " + this.color + " : " + this.price);
    }
}

class Lamborghini extends Cars {

    // default constructor
    Lamborghini(){
        //super();// there is super() by default so that it call super class constructor firstly.
        System.out.println("In Lamborghini Default constructor");
    }

    // parameterized constructor
    Lamborghini(String name, String color, int price){
        // super(); // by default calling
        // we can call super parameterized constructor as
        //super(name,color,price); // this statement call super constructor(parameterized)
        this.name = name;
        this.color = color;
        this.price = price;
        System.out.println("In Lamborghini parameterized constructor");
        System.out.println(this.name + " : " + this.color + " : " + this.price);
    }
}


// super : super is a keyword in java used to access members of super class in child class.
// this is basically used to call super class methods in child class.
// Just for Fun : GrandSon calls his GrandFather to protect from his Father.
public class SuperDemo extends Lamborghini {

    public static void main(String[] args) {
        // this statement calls constructor of Lamborghini class as well as Cars class.
        // this is because every constructor contains a super() method calling
        // even we didn't mention super() calling explicitly
        // so this statement calls default constructor of both class
        Lamborghini lamborghini = new Lamborghini(); // what happened here?

        
        //but what happened if we call parameterized constructor?
        // it will call default constructor of Cars class and
        // then called parameterized constructor of Lamborghini class
        // again this is because super() method calling by default
        Lamborghini lamborghini1 = new Lamborghini("Lamborghini","Red",8_000_000);
    }
}
