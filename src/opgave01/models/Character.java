package opgave01.models;

public abstract class Character {
    protected WeaponBehavior weaponBehavior;
    public void fight() {
        System.out.print(this.getClass().getSimpleName() + " ");
        weaponBehavior.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}
