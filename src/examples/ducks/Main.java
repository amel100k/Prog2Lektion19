package examples.ducks;

import examples.ducks.models.MallardDuck;
import examples.ducks.models.RedheadDuck;
import examples.ducks.models.RubberDuck;

public class Main {
    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        RedheadDuck redhead = new RedheadDuck();
        redhead.performQuack();
        redhead.performFly();
        RubberDuck rubber = new RubberDuck();
        rubber.performQuack();
        rubber.performFly();
    }
}
