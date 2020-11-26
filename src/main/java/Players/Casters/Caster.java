package Players.Casters;

import Abilities.PetType;
import Abilities.SpellType;
import Players.Character;
import Players.Enemy;

public abstract class Caster extends Character {
    private PetType pet;
    private SpellType spell;

    public Caster(String name, int health,PetType pet, SpellType spell) {
        super(name, health);
        this.pet = pet;
        this.spell = spell;
    }

    public PetType getPet() {
        return pet;
    }

    public SpellType getSpell() {
        return spell;
    }

    public void setPet(PetType pet) {
        this.pet = pet;
    }

    public void setSpell(SpellType spell) {
        this.spell = spell;
    }

    public void castSpell(Enemy enemyToAttack){
        int enemyHealth = enemyToAttack.getHealth();
        enemyToAttack.setHealth(enemyHealth - this.spell.getDamage());
    }
}
