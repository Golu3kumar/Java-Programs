

//final : It is a keyword in java used to avoid reassigning of variables as well as class and methods

// this is final class that can not be inherited
final class Area{
    // constant variable using final keyword.
    final double PI = 3.14;

    // PI = 3; // Error : Constants can not be reassign.

    // final method that can not be Override
    final void showArea(double radius){
        System.out.println("Area = "+(PI*Math.pow(radius,2)));
    }
}
public class FinalKeyword {

    public static void main(String[] args) {
        Area circleArea = new Area();

        circleArea.showArea(5);
    }
}
