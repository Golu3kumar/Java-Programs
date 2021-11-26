package Teekam;

public class FunctionDemo {


    public static void main(String[] args) {

        FunctionDemo fd = new FunctionDemo();
        fd.add(6,7);

        int sum = fd.add2();

        int sum2 = fd.add2(6,4);

        System.out.println(sum2);





    }


    /// methods 4 types
    // Method with void return type and no parameters
    // Method with void return type and parameters
    // Method with return type and no parameters
    // Method with return type and parameters

    // aim : print addition of two number

    // Method with void return type and no parameters
    void add(){
        int c = 8;
        int b = 9;
        System.out.println(c+b);

    }

    // Method with void return type and parameters
    void add(int a, int b){
        System.out.println(a+b);
    }

    int add2(){
        int a = 8;
        int b = 4;
        return a+b;
    }

    int add2(int a,int b){
        return a+b;
    }

}
