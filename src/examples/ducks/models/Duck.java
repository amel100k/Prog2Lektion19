package examples.ducks.models;

import examples.ducks.models.flybehaviors.FlyBehavior;
import examples.ducks.models.quackbehaviors.QuackBehavior;

public abstract class Duck {
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;
    public void quack() {
        System.out.println("Quack");
    }
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }

    public void performFly() {
        System.out.print(this.getClass().getSimpleName() + " ");
        flyBehavior.fly();
    }

    public void performQuack() {
        System.out.print(this.getClass().getSimpleName() + " ");
        quackBehavior.quack();
    }
}
