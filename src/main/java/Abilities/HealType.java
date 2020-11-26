package Abilities;

public enum HealType {
    POTION (10),
    GREATERHEAL (20),
    HERB (5);

    private int healing;

    HealType(int healing) {
        this.healing = healing;
    }

    public int getHealing() {
        return healing;
    }
}
