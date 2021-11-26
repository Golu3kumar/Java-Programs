package design_pattern.StrategyPattern.Fighters;

import design_pattern.StrategyPattern.BombBehaviours.GrenadeBomb;
import design_pattern.StrategyPattern.Fighter;
import design_pattern.StrategyPattern.KillBehaviours.KillWithHand;

public class KillerBeanFighter extends Fighter {

    public KillerBeanFighter() {
        killBehaviour = new KillWithHand();
        bombBehavior = new GrenadeBomb();
        display();
    }

    @Override
    public void fly() {
        System.out.println("Sorry I can't fly!");
    }

    @Override
    public void display() {
        System.out.println("Killer Bean!");
    }
}
