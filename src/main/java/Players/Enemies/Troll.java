package Players.Enemies;

import Players.Character;
import Players.Enemy;

public class Troll extends Enemy {
    public Troll(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void makeWeapon(){
        int currentDamage = this.getDamage();
        this.setDamage(currentDamage + 20);
    }
}


