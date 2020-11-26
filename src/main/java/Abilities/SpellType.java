package Abilities;

public enum SpellType {

    FIREBALL(10),
    BLIZZARD(20),
    THUNDERSTORM(25);

    private int damage;

    SpellType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return this.damage;
    }
}
