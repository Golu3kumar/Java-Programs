import java.time.Clock;

public class ThreadOptimization {
    public static void main(String[] args) throws InterruptedException {
        // thread : a thread is a sub process that can executes in parallel to achieve multitasking.
        // Runnable Interface by using Anonymous class
        Runnable printer1 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Printer1 is printing pdf of "+ Thread.currentThread().getName() + (i + 1));
                }
            }
        };

        // Runnable interface by using Lambda Expression
        Runnable printer2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Printer2 is printing pdf of "+ Thread.currentThread().getName() + (i + 1));
            }
        };

        Thread th2 = new Thread(printer2, "Nikhil Printer");
        Thread th1 = new Thread(printer1, "Boss Printer");// the second argument gives name to the thread.
        // we can also setName to the therad
        //th1.setName("Like a Boss");

        // set the priority to the thread
        th1.setPriority(Thread.MAX_PRIORITY); // MAX_PRIORITY = 10 // high priority
        th2.setPriority(Thread.MIN_PRIORITY); // MAX_PRIORITY = 1 // low priority
        // start the thread
        th1.start();
        try {
            Thread.sleep(500);
        } catch (Exception ignored) {
        }
        th2.start();
        // join the thread with main thread so that it completes it's execution first.
        // Note : if we didn't call join() method then bellow statements get executed in parallel with "Boss Printer" thread
        th2.join();
        th1.join();

        System.out.println("Priority of "+th1.getName()+" is "+th1.getPriority());
        System.out.println("Priority of "+th2.getName()+" is "+th2.getPriority());
        System.out.println(th1.getName() + " is now stopped!");
        System.out.println(th2.getName() + " is now stopped!");

    }
}
