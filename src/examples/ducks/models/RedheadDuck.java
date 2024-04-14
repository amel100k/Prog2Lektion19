package examples.ducks.models;

import examples.ducks.models.flybehaviors.FlyWithWings;
import examples.ducks.models.quackbehaviors.Quack;

public class RedheadDuck extends Duck {

    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
}
