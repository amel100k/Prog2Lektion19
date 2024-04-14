package examples.ducks.models.quackbehaviors;

import examples.ducks.models.quackbehaviors.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
