package OOPsConcepts;

// Encapsulation : Wrapping of data variables and methods into a single unit is called Encapsulation.
// Class is one of the example of Encapsulation, as it contains
// member variable and member function that are binned together.
// It is used to provide data hiding as to increase security.
// It can be achieved by using getters and setters methods.
// Let's see Demo.
// Just Blame the night!

import regularExpressions.EmailValidator;
import regularExpressions.PasswordValidator;

import java.util.Scanner;

// This is also called POJO class (data class)
class Login {

    // private member variable.
    private String email;
    private String password;

    // to create getters and setters press alt + insert.
    // setters : setters are the methods which is use to set the value to a member variable.
    // syntax -> setVariableName(parameter)
    public void setEmail(String email) {
        this.email = email;
    }

    // getters : getters are the methods that returns the value of a particular variable.
    // syntax -> getVariableName()
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // object creation
        Scanner sc = new Scanner(System.in);
        Login login = new Login();
        System.out.println("Enter email : ");
        String email = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();
        // using EmailValidator class that we created in Regex module.
        boolean isEmailValid = EmailValidator.isEmailValidate(email);
        // using PasswordValidator class to validate a password.
        boolean isPasswordValid = PasswordValidator.isPasswordValid(password);
        // Oh... there is too much security....
        // :)
        // if both email and password valid then call setters
        if (isEmailValid && isPasswordValid) {
            login.setEmail(email);
            login.setPassword(password);
        } else {
            System.out.println("Invalid email or Invalid Password,\nPlease enter a new one");
            return;
        }
        System.out.println("You Logged in! Welcome Back");
        System.out.println("Email : "+login.getEmail());
        System.out.println("Password : "+login.getPassword());
    }

}
