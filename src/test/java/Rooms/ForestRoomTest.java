package Rooms;

import Abilities.WeaponType;
import Players.Enemies.Troll;
import Players.Enemy;
import Players.Fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;
import Players.Character;

import static org.junit.Assert.assertEquals;

public class ForestRoomTest {
    private Forest forestRoom;
    private Character dwarf;
    private Enemy troll;



    @Before
    public void before() {
        forestRoom = new Forest("Enchanted Forest", TreasureType.GEMS);
        dwarf = new Dwarf("Gimli", 100, WeaponType.AXE);
        troll = new Troll("Jule", 400, 20);
    }

    @Test
    public void hasName(){
        assertEquals("Enchanted Forest", forestRoom.getName());
    }

    @Test
    public void hasTreasureType() {
        assertEquals(TreasureType.GEMS, forestRoom.getTreasure());
    }

    @Test
    public void roomStartsEmpty() {
        assertEquals(0, forestRoom.countCharacters());
        assertEquals(0, forestRoom.countEnemies());
    }

    @Test
    public void canAddToRoom() {
        forestRoom.addPlayer(dwarf);
        forestRoom.addEnemy(troll);

        assertEquals(1, forestRoom.countCharacters());
        assertEquals(1, forestRoom.countEnemies());
    }

    @Test
    public void playersCanLeave() {
        forestRoom.addPlayer(dwarf);
        forestRoom.addEnemy(troll);
        troll.setHealth(0);
        forestRoom.removeEnemy(troll);
        forestRoom.removePlayers();

        assertEquals(0, forestRoom.countCharacters());
    }
}
