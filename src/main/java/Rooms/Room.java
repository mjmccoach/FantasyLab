package Rooms;

import Players.Character;
import Players.Enemy;

import java.util.ArrayList;

public abstract class Room {
    private String name;
    private ArrayList<Character> players;
    private ArrayList<Enemy> enemies;
    private ArrayList<TreasureType> treasure;
    private boolean completed;

    public Room(String name) {
        this.name = name;
        this.players = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.treasure = new ArrayList<>();
        this.completed = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int countCharacters() {
        return players.size();
    }


    public int countEnemies() {
        return enemies.size();
    }


    public int getTreasure() {
        return this.treasure.size();
    }

    public void addTreasure(TreasureType treasure) {
        this.treasure.add(treasure);
    }

    public void addPlayer(Character playerToAdd) {
        this.players.add(playerToAdd);
    }

    public void addEnemy(Enemy enemyToAdd) {
        this.enemies.add(enemyToAdd);
    }

    public void removeEnemy(Enemy enemyToRemove) {
        if(enemyToRemove.getHealth() == 0) {
            this.enemies.remove(enemyToRemove);
        }
    }

    public void removePlayers() {
        if(enemies.size() == 0 && this.treasure.size() == 0) {
            this.players.clear();
        }
        this.completed = true;
    }
    public TreasureType retrieveLoot() {
        return this.treasure.get(0);
    }
}
