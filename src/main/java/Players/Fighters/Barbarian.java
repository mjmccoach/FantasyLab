package Players.Fighters;

import Abilities.WeaponType;

public class Barbarian extends Fighter {

    public Barbarian(String name, int health, WeaponType weapons) {
        super(name, health, weapons);
    }


    public void shout() {
        int existingHealth = this.getHealth();
        this.setHealth(existingHealth + 25);
    }
}
