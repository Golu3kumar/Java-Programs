package design_pattern.StrategyPattern.Fighters;

import design_pattern.StrategyPattern.BombBehaviours.GasBomb;
import design_pattern.StrategyPattern.Fighter;
import design_pattern.StrategyPattern.KillBehaviours.KillWithKnife;

public class OptimusPrimeFighter extends Fighter {

    public OptimusPrimeFighter() {
        killBehaviour = new KillWithKnife();
        bombBehavior = new GasBomb();
        display();
    }

    @Override
    public void fly() {
        System.out.println("I can Fly");
    }

    @Override
    public void display() {
        System.out.println("I am Optimus Prime!");
    }
}
