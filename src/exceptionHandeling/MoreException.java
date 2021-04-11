package exceptionHandeling;

public class MoreException {

    void divideByZero(int a,int b) throws ArithmeticException{
        int c = (a/b);
        System.out.println("answer : "+c);
        throw new ArithmeticException("demo");
    }

    public static void main(String[] args) {
        try{
            MoreException moreException = new MoreException();
            moreException.divideByZero(9,0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {//it executes always whether the exception is handled or not
            System.out.println("Exception occur is handled");
        }
    }
}
