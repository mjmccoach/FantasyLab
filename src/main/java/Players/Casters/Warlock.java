package Players.Casters;

import Abilities.PetType;
import Abilities.SpellType;
import Players.Fighters.Dwarf;
import Players.Character;

public class Warlock extends Caster {

    public Warlock(String name, int health, PetType pet, SpellType spell) {
        super(name, health, pet, spell);
    }

    public void shield(Character characterToShield) {
        int existingHealth = characterToShield.getHealth();
        characterToShield.setHealth(existingHealth + 10);
    }
}
