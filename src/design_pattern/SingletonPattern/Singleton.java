package design_pattern.SingletonPattern;

import java.util.Arrays;
import java.util.LinkedList;

public class Singleton {


    private static Singleton firstInstance = null;

    String[] scrabbleLetters = {"a", "a", "a", "b", "c", "c", "d", "d", "e", "f", "f", "f"};

    private LinkedList<String> letterList = new LinkedList<>(Arrays.asList(scrabbleLetters));
    static boolean firstThread = true;

    private Singleton() {
    }

    public static Singleton getInstance() throws InterruptedException {

        if (firstInstance == null) {

            if (firstThread){

                firstThread = false;
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            }
            firstInstance = new Singleton();
        }
        return firstInstance;
    }

    public LinkedList<String> getLetterList(){
        return firstInstance.letterList;
    }

    
}
