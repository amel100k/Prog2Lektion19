package examples.ducks.models.flybehaviors;

import examples.ducks.models.flybehaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
