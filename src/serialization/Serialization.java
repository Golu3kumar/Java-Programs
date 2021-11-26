package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
/*
// Serialization : It is a process of saving the current state of an object into byte stream
 in onder to transmit from one JVM to another JVM
*/
public class Serialization {
    public static void main(String[] args) throws Exception{
        CricketCurrentScore cricketCurrentScore = new CricketCurrentScore(200,19,5);
        // here we set value to transient variable
        cricketCurrentScore.setTargetRun(210);
        // it is a class which is used to write byte or character stream into a file
        FileOutputStream fos = new FileOutputStream("cricket_current_score.txt");
        // it is a class which can write an object into the file
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        //writing object into file
        oos.writeObject(cricketCurrentScore);

        System.out.println("Serialization is successfully completed...");
    }
}
