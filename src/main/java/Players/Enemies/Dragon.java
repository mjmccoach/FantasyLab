package Players.Enemies;

import Players.Enemy;
import Players.Character;

public class Dragon extends Enemy {

    public Dragon(String name, int health, int damage) {
        super(name, health, damage);
    }

    public void fireAttack(Character firstTarget, Character secondTarget, Character thirdTarget) {
        int firstTargetHealth = firstTarget.getHealth();
        int secondTargetHealth = secondTarget.getHealth();
        int thirdTargetHealth = thirdTarget.getHealth();
        firstTarget.setHealth(firstTargetHealth - 20);
        secondTarget.setHealth(secondTargetHealth - 20);
        thirdTarget.setHealth(thirdTargetHealth - 20);
    }
}
