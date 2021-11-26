class Printer {
    synchronized void print(String name) { // synchronized the method to achieve multithreading
        for (int i = 0; i <= 10; i++) {
            System.out.println("Printing Doc " + name + " " + i);
        }
    }
}

class OneThread extends Thread {
    Printer pr;

    public OneThread(Printer pr) {
        this.pr = pr;
    }

    @Override
    public void run() {
        pr.print("golu.pdf");
    }
}

class SecondThread extends Thread {
    Printer pr;

    public SecondThread(Printer pr) {
        this.pr = pr;
    }

    @Override
    public void run() {
        pr.print("teekam.pdf");
    }
}



public class ThreadExample {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("-----Application Starts ------");
        Printer printer = new Printer();
        //printer.print("some.pdf");

        //one thread
        OneThread oneThread = new OneThread(printer);
        oneThread.start();
        //oneThread.join();
        //oneThread.setDaemon(true);

        //second thread
        SecondThread secondThread = new SecondThread(printer);
        secondThread.start();

        System.out.println("-------Application Ends--------");
    }

}
