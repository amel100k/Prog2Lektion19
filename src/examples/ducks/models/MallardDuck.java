package examples.ducks.models;

import examples.ducks.models.flybehaviors.FlyWithWings;
import examples.ducks.models.quackbehaviors.Quack;

public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
