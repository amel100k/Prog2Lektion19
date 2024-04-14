package examples.ducks.models;

import examples.ducks.models.flybehaviors.FlyNoWay;
import examples.ducks.models.quackbehaviors.Squeak;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }

    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
