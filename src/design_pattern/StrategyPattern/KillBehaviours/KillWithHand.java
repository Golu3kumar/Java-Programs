package design_pattern.StrategyPattern.KillBehaviours;

public class KillWithHand implements KillBehaviour{
    @Override
    public void kill() {
        System.out.println("Punch! Slapped! Welcome to HandLand!");
    }
}
