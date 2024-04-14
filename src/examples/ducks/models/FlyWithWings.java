package examples.ducks.models;

public class FlyWithWings implements FlyBehavior{

    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }
}
