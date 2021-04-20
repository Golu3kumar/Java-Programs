public class RunnableExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableThread());
        thread.start();
        //RunnableThread runnableThread = new RunnableThread();
        //System.out.println(runnableThread); //hashcode reference in Hexadecimal number
        //runnableThread.run();

        Runnable runnable = new RunnableThread();
        new Thread(runnable).start(); 
    }
}

class RunnableThread implements Runnable{

    @Override
    public void run() {

        for (int i = 1; i<=10;i++){
            System.out.println("Hello Golu");
        }
    }
}