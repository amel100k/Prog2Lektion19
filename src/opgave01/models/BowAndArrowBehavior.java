package opgave01.models;

public class BowAndArrowBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("shoots an arrow at you with a bow");
    }

    public BowAndArrowBehavior() {
    }
}
