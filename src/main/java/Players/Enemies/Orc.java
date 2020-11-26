package Players.Enemies;

import Players.Enemy;

public class Orc extends Enemy {
    public Orc(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void addHealth() {
        int currentHealth = this.getHealth();
        this.setHealth(currentHealth + 15);
    }
}
