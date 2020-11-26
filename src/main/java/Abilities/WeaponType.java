package Abilities;

public enum WeaponType {
    AXE(20),
    SWORD(5),
    BOW(15),
    CLUB(15);

    private int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        return damage;
    }
}
