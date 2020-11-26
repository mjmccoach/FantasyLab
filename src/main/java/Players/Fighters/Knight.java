package Players.Fighters;

import Abilities.WeaponType;
import Players.Character;

public class Knight extends Fighter {
    Knight knight;


    public Knight(String name, int health, WeaponType weapons) {
        super(name, health, weapons);
    }


    public void defend(Character characterToDefend) {
        int existingHealth = characterToDefend.getHealth();
        characterToDefend.setHealth(existingHealth+30);
    }
}
