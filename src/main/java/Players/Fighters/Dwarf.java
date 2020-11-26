package Players.Fighters;

import Abilities.WeaponType;

public class Dwarf extends Fighter {

    public Dwarf(String name, int health, WeaponType weapons) {
        super(name, health, weapons);
    }

    public int extraAttack() {
        return 10;
    }
}
