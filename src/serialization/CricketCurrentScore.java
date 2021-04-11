package serialization;

import java.io.Serializable;

// class which implements Serialization ie. marker interface
// Marker interface is an interface that has no any abstract method and default method.
public class CricketCurrentScore implements Serializable {
    public int currentRuns;
    public int currentOvers;
    public int currentWickets;

    public CricketCurrentScore(int currentRuns, int currentOvers, int currentWickets) {
        this.currentRuns = currentRuns;
        this.currentOvers = currentOvers;
        this.currentWickets = currentWickets;
    }
}
