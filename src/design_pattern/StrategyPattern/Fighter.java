package design_pattern.StrategyPattern;

import design_pattern.StrategyPattern.BombBehaviours.BombBehavior;
import design_pattern.StrategyPattern.KillBehaviours.KillBehaviour;

public abstract class Fighter {
    public KillBehaviour killBehaviour;
    public BombBehavior bombBehavior;

    public void setKillBehaviour(KillBehaviour killBehaviour) {
        this.killBehaviour = killBehaviour;
    }

    public void setBombBehavior(BombBehavior bombBehavior) {
        this.bombBehavior = bombBehavior;
    }

    public abstract void fly();

    public void run(){
        System.out.println("I can run!");
    }

    public void performKill(){
        killBehaviour.kill();
    }
    public void throwBomb(){
        bombBehavior.boom();
    }

    public abstract void display();
}
