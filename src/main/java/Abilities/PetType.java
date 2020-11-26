package Abilities;

public enum PetType {
    PHOENIX(15),
    UNICORN(30),
    WOLF(20);

    private int damage;

    PetType(int damage) {
        this.damage = damage;
    }
//
//    public void petAttack() {
//        PET ATTACK FOR WHEN ENEMIES IMPLEMENTED
//    }
}
