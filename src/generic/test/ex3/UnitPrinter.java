package generic.test.ex3;

import generic.test.ex3.unit.BioUnit;
import generic.test.ex3.unit.Marine;

public class UnitPrinter<T extends BioUnit> {

    public static<U extends BioUnit> void printV1(Shuttle<U> u) {
        System.out.println("이름: " + u.out().getName() + " HP: " + u.out().getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> u) {
        System.out.println("이름: " + u.out().getName() + " HP: " + u.out().getHp());

    }
}
