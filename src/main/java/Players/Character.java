package Players;

import Rooms.Room;
import Rooms.TreasureType;

import java.util.ArrayList;

public abstract class Character {
    private String name;
    private int health;
    protected ArrayList<TreasureType> loot;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
        this.loot = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLoot() {
        return this.loot.size();
    }

    public void lootRoom(Room roomToLoot) {
        TreasureType newLoot = roomToLoot.retrieveLoot();
        this.loot.add(newLoot);
    }
}
