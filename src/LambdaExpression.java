@FunctionalInterface
interface Uber{ // functional interface is one which contains only one abstract method
    void ride(String source,String destination); // abstract method

//    void hide(); // error
}

class UberX implements Uber{
    @Override
    public void ride(String source, String destination) {
        System.out.println("Riding from "+source+ " to "+ destination);
        //System.out.println(source.lastIndexOf(destination));
    }
}

public class LambdaExpression {
    public static void main(String[] args) {
        //1. accessing Functional interface using Class
        Uber uber1 = new UberX();
        uber1.ride("Patna","Jaipur");

        //2. using anonymous class
        Uber uber = new Uber() {
            @Override
            public void ride(String source, String destination) {
                System.out.println("Riding from "+source+ " to "+ destination);
            }
        };
        uber.ride("Jaipur","Patna");

        // 3. using Lambda expression
        Uber ub = (source,destination)->{
            System.out.println("Riding from "+source+ " to "+ destination);
        };
        ub.ride("Ramgarhwa","Raxaul");
    }
}
