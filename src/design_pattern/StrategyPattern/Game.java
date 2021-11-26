package design_pattern.StrategyPattern;

import design_pattern.StrategyPattern.BombBehaviours.GrenadeBomb;
import design_pattern.StrategyPattern.Fighters.GodWarriorsFighter;
import design_pattern.StrategyPattern.Fighters.KillerBeanFighter;
import design_pattern.StrategyPattern.Fighters.OptimusPrimeFighter;


// Strategy Pattern : It defines a family of algorithms, encapsulates each one, and makes them
// interchangeable. Strategy lets the algorithm vary independently from client that use it.

public class Game {
    public static void main(String[] args) {

        Fighter fighter = new OptimusPrimeFighter();
        fighter.performKill();
        fighter.throwBomb();
        fighter.fly();

        fighter = new GodWarriorsFighter();
        fighter.throwBomb();
        fighter.performKill();
        fighter.setBombBehavior(new GrenadeBomb());
        fighter.throwBomb();

        System.out.println("I am coming.....");
        fighter = new KillerBeanFighter();
        fighter.performKill();
        fighter.throwBomb();
        fighter.fly();
        fighter.run();

    }
}
