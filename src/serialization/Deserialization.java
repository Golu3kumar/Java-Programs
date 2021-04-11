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

        System.out.println("Team India current score : ");
        System.out.println("Score : "+score.currentRuns);
        System.out.println("Wickets : "+score.currentWickets);
        System.out.println("Over : "+score.currentOvers);

        System.out.println("Deserialization is completed...");
    }
}
