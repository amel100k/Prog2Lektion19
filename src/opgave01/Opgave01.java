package opgave01;

import opgave01.models.AxeBehavior;
import opgave01.models.BowAndArrowBehavior;
import opgave01.models.King;
import opgave01.models.SwordBehavior;

public class Opgave01 {
    public static void main(String[] args) {
        King king = new King();
        SwordBehavior sword = new SwordBehavior();
        BowAndArrowBehavior bowAndArrow = new BowAndArrowBehavior();
        king.setWeaponBehavior(sword);
        king.fight();
        king.setWeaponBehavior(bowAndArrow);
        king.fight();
    }
}
