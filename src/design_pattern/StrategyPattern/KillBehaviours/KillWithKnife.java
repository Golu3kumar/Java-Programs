package design_pattern.StrategyPattern.KillBehaviours;

public class KillWithKnife implements KillBehaviour{
    @Override
    public void kill() {
        System.out.println("Cut! Copy! But don't Paste! Knife War!");
    }
}
