package opgave01.models;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("hits you with a sword");
    }

    public SwordBehavior() {
    }
}
