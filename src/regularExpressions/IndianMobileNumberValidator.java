package regularExpressions;

import javax.swing.*;
import java.util.regex.Pattern;

public class IndianMobileNumberValidator {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        String mobileNumber = JOptionPane.showInputDialog(frame,"Enter Indian Mobile Number : ");

        //String numberPattern = "^[+91]{3}[6-9][0-9]{9}$";
        String numberPattern2 = "^[+91]{3}[6-9]\\d{9}$";
        if (Pattern.matches(numberPattern2,mobileNumber)){
            JOptionPane.showMessageDialog(frame,"Mobile Number Validate(Matched)");
        }else JOptionPane.showMessageDialog(frame,"Mobile Number not Validate");
    }
}
