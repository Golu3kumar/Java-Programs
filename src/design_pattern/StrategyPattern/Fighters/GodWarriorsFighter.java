package design_pattern.StrategyPattern.Fighters;

import design_pattern.StrategyPattern.BombBehaviours.GasBomb;
import design_pattern.StrategyPattern.Fighter;
import design_pattern.StrategyPattern.KillBehaviours.KillWithGun;

public class GodWarriorsFighter extends Fighter {

    public GodWarriorsFighter() {
        killBehaviour = new KillWithGun();
        bombBehavior = new GasBomb();
        display();
    }

    @Override
    public void fly() {
        System.out.println("I am God and I can fly");
    }

    @Override
    public void display() {
        System.out.println("Let's war begin with God Warrior");
    }
}
