package Players;

public abstract class Enemy {
    private String name;
    private int health;
    private int damage;


    public Enemy(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;

    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public void attack(Character characterToAttack){
        int characterHealth = characterToAttack.getHealth();
        characterToAttack.setHealth(characterHealth - this.damage);
    }
}
