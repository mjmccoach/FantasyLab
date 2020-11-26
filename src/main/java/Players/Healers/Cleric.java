package Players.Healers;

import Abilities.HealType;
import Players.Character;

public class Cleric extends Character {

    Cleric cleric;
    private HealType healType;

    public Cleric(String name, int health, HealType healType) {
        super(name, health);
        this.healType = healType;
    }

    public HealType getHealType() {
        return healType;
    }

    public void setHealType(HealType newHealType) {
        this.healType = newHealType;
    }

    public void revive(Character characterToHeal) {
        if(characterToHeal.getHealth() == 0) {
            characterToHeal.setHealth(100);
        }
    }
}
