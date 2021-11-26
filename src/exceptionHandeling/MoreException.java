package exceptionHandeling;

import lib.Library;

public class MoreException {

    void divideByZero(int a,int b) throws ArithmeticException{
        int c = (a/b);
        System.out.println("answer : "+c);
        throw new ArithmeticException("demo"); // it will call the catch block.
    }

    public static void main(String[] args) {
        try{
            MoreException moreException = new MoreException();
            moreException.divideByZero(9,8);
        }catch (Exception e){
            System.err.println(e.getMessage()); // err is an instance
        }
        finally {//it executes always whether the exception is handled or not
            System.out.println("Exception occur is handled");
        }

        System.out.println("after error!");

        Library lib = new Library();
        System.out.println(lib.getFact(5));
    }
}
