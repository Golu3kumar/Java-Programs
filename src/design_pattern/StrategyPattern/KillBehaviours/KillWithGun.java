package design_pattern.StrategyPattern.KillBehaviours;

public class KillWithGun implements KillBehaviour{
    @Override
    public void kill() {
        System.out.println("Fire... thai thai thai... Short GUN attack.");
    }
}
