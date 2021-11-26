package Concurrency;

// Thread : A thread has separate path of execution that is the single unit of process.
// Runnable : A Runnable is an interface that perform certain task on separate thread.
// Callable : It is also an interface that perform some computation task and return it to callable thread.
// Executor : An interface that executes a runnable interface on separate thread.
// Future : It is also an interface that hold return value from Callable interface.

import java.util.concurrent.*;

public class ThreadBasics {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println(Thread.currentThread().getName());
//        Thread lambdaThread = new Thread(()->{
//            Thread.currentThread().setName("LambdaThread");
//            System.out.println(Thread.currentThread().getName());
//            for (int i = 0; i < 5; i++) {
//                System.out.println(i);
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//         starting the thread
//        lambdaThread.start();

        // executes MyRunnable interface
//        new Thread(new MyRunnable()).start();

//        Future<Integer> future = Executors.newFixedThreadPool(1).submit(new IntegerCallable());
//        System.out.println(future.get());

        // executes in the main thread one after another
//        Executor executor = new MyRunnableExecutor();
//        executor.execute(new MyRunnable());
//        executor.execute(new MyRunnable());

        // run on the separate thread simultaneously
//        Executor taskExecutor = new ThreadPerTaskExecutor();
//        taskExecutor.execute(new MyRunnable());
//        taskExecutor.execute(new MyRunnable());

    }

    // Custom Runnable
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    // custom Callable that return sum of integers till 5
    static class IntegerCallable implements Callable<Integer> {

        @Override
        public Integer call() throws Exception {
            int sum = 0;
            for (int i = 1; i <= 5; i++) {
                sum += i;
            }
            return sum;
        }
    }

    // this Executor run a particular Runnable interface
    static class MyRunnableExecutor implements Executor {

        @Override
        public void execute(Runnable command) {
            System.out.println(Thread.currentThread().getName());
            command.run();
        }
    }

    // this executor run a particular Runnable interface on a separate thread.
    static class ThreadPerTaskExecutor implements Executor {

        @Override
        public void execute(Runnable command) {
            new Thread(command).start();
        }
    }
}
