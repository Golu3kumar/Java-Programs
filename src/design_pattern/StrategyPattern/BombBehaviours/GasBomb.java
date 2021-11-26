package design_pattern.StrategyPattern.BombBehaviours;

public class GasBomb implements BombBehavior{
    @Override
    public void boom() {
        System.out.println("Boom... Gas is spreading now you gonna die!");
    }
}
