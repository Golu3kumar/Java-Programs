package serialization;

import java.io.Serializable;

// class which implements Serialization ie. marker interface
// Marker interface is an interface that has no any abstract method and default method.
public class CricketCurrentScore implements Serializable {

    private int currentRuns;
    private int currentOvers;
    private int currentWickets;
    // here transient keyword is used to prevent from serialization of this variable
    transient int targetRun;



    public CricketCurrentScore(int currentRuns, int currentOvers, int currentWickets) {
        this.currentRuns = currentRuns;
        this.currentOvers = currentOvers;
        this.currentWickets = currentWickets;
    }

    public int getCurrentRuns() {
        return currentRuns;
    }

    public void setCurrentRuns(int currentRuns) {
        this.currentRuns = currentRuns;
    }

    public int getCurrentOvers() {
        return currentOvers;
    }

    public void setCurrentOvers(int currentOvers) {
        this.currentOvers = currentOvers;
    }

    public int getCurrentWickets() {
        return currentWickets;
    }

    public void setCurrentWickets(int currentWickets) {
        this.currentWickets = currentWickets;
    }

    public int getTargetRun() {
        return targetRun;
    }

    public void setTargetRun(int targetRun) {
        this.targetRun = targetRun;
    }
}
