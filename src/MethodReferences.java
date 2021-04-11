// functional interface
interface Display {
    void showDetails(String name, byte age);
}

interface Messenger {
    Message getMessage(String msg);
}

class Message {
    public Message(String message) {
        System.out.println("Message>> " + message);
    }
}

public class MethodReferences {
    static void displayDetails(String name, byte age) {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    void printDetails(String name, byte age) {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        //referencing to static method
        Display display = MethodReferences::displayDetails;
        display.showDetails("Golu", (byte) 22);

        // referencing to non static method
        MethodReferences mRef = new MethodReferences();
        Display display1 = mRef::printDetails;
        display1.showDetails("Samrat", (byte) 25);

        //referencing to constructor
        Messenger m = Message::new;
        m.getMessage("Do it for that people who wants to see you fail!!");
    }

}
