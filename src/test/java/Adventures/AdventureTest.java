package Adventures;

import Abilities.HealType;
import Abilities.PetType;
import Abilities.SpellType;
import Abilities.WeaponType;
import Players.Casters.Wizard;
import Players.Character;
import Players.Enemies.Dragon;
import Players.Enemies.Orc;
import Players.Enemies.Troll;
import Players.Enemy;
import Players.Fighters.Dwarf;
import Players.Healers.Cleric;
import Rooms.*;
import com.sun.tools.javac.comp.Resolve;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdventureTest {
    private Adventure adventure;
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Enemy enemy1;
    private Enemy enemy2;
    private Enemy enemy3;
    private Enemy enemy4;
    private Character player1;
    private Character player2;
    private Character player3;

    @Before
    public void before() {
        adventure = new Adventure();
        room1 = new Forest("Enchanted Forest");
        room2 = new Castle("Castle Rock");
        room3 = new Volcano("Ashes to Ashes");
        room4 = new Glacier("Icescape");
        enemy1 = new Troll("Ug", 200, 20);
        enemy2 = new Dragon("Bert", 150, 15);
        enemy3 = new Orc("Frank", 80, 5);
        enemy4 = new Troll("Steph", 175, 25);
        player1 = new Dwarf("Rory", 100, WeaponType.AXE);
        player2 = new Wizard("Gandalf the Grey", 150, PetType.UNICORN, SpellType.THUNDERSTORM);
        player3 = new Cleric("Jane", 90, HealType.POTION);

        room4.addTreasure(TreasureType.GOLD);
        room3.addTreasure(TreasureType.ARMOUR);
        room2.addTreasure(TreasureType.GEMS);
        room1.addTreasure(TreasureType.GEMS);

        room1.addEnemy(enemy1);
        room2.addEnemy(enemy2);
        room3.addEnemy(enemy3);
        room4.addEnemy(enemy4);

        room1.addPlayer(player1);
        room1.addPlayer(player2);
        room1.addPlayer(player3);

        adventure.addRoom(room1);
        adventure.addRoom(room2);
        adventure.addRoom(room3);
        adventure.addRoom(room4);
    }

//    @Test
//    public void checkRoomsStartEmpty() {
//        assertEquals(0, adventure.countRooms());
//    }

    @Test
    public void canAddRoomsToAdventure() {
        assertEquals(4, adventure.countRooms());
    }

    @Test
    public void can

}
