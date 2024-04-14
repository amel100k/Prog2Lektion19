package examples.ducks.models.quackbehaviors;

import examples.ducks.models.quackbehaviors.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
