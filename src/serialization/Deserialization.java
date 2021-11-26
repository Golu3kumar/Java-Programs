package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
// Deserialization : It is a process of converting byte stream into the Object to get the current status of an object
*/
public class Deserialization {
    public static void main(String[] args) throws Exception{


        FileInputStream fis = new FileInputStream("cricket_current_score.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);

        CricketCurrentScore score = (CricketCurrentScore) ois.readObject();

        // you should must close the stream classes
        fis.close();
        ois.close();
        System.out.println("Team India current score : ");
        System.out.println("Score : "+score.getCurrentRuns());
        System.out.println("Wickets : "+score.getCurrentWickets());
        System.out.println("Over : "+score.getCurrentOvers());
        // when we print transient variable we didn't get value whatever we saved
        System.out.println("Target run : "+score.getTargetRun());

        System.out.println("Deserialization is completed...");
    }
}
