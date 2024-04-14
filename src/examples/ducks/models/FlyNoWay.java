package examples.ducks.models;

public class FlyNoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " can't fly");
    }
}
