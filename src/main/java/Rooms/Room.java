package Rooms;

import Players.Character;
import Players.Enemy;

import java.util.ArrayList;

public abstract class Room {
    private String name;
    private ArrayList<Character> players;
    private ArrayList<Enemy> enemies;
    private TreasureType treasure;

    public Room(String name, TreasureType treasure) {
        this.name = name;
        this.players = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.treasure = treasure;
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


    public TreasureType getTreasure() {
        return treasure;
    }

    public void setTreasure(TreasureType treasure) {
        this.treasure = treasure;
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
        if(enemies.size() == 0) {
            this.players.clear();
        }
    }
}
