package design_pattern.StrategyPattern.BombBehaviours;

public class GrenadeBomb implements BombBehavior{
    @Override
    public void boom() {
        System.out.println("Grenade Boom... User Died!");
    }
}
