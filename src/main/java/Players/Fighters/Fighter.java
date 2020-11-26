package Players.Fighters;


import Abilities.WeaponType;
import Players.Character;

import java.util.ArrayList;

public abstract class Fighter extends Character {
    private WeaponType weapons;

    public Fighter(String name, int health, WeaponType weapons) {
        super(name, health);
        this.weapons = weapons;
    }

    public WeaponType getWeapons() {
        return weapons;
    }

    public void setWeapons(WeaponType newWeapons) {
        this.weapons = newWeapons;
    }
}
