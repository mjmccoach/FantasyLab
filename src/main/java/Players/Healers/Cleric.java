package Players.Healers;

import Players.Character;

public class Cleric extends Character {

    Cleric cleric;
    private HealType healType;

    public Cleric(String name, int health, HealType healType) {
        super(name, health);
        this.healType = healType;
    }
}
