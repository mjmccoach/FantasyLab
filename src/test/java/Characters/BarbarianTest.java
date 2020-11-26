package Characters;

import Abilities.WeaponType;
import Players.Enemies.Dragon;
import Players.Enemy;
import Players.Fighters.Barbarian;
import Rooms.Forest;
import Rooms.Room;
import Rooms.TreasureType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    private Barbarian barbarian;
    private Enemy dragon;
    private Room forestRoom;

    @Before
    public void before() {
        barbarian = new Barbarian("Dave", 150, WeaponType.CLUB);
        dragon = new Dragon("Smaug", 200, 20);
        forestRoom = new Forest("Enchanted Forest");
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.CLUB, barbarian.getWeapons());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(15, barbarian.getWeapons().getDamage());
    }

    @Test
    public void canShout() {
        barbarian.shout();
        assertEquals(175, barbarian.getHealth());
    }

    @Test
    public void canAttack(){
        barbarian.attack(dragon);
        assertEquals(185, dragon.getHealth());
    }

    @Test
    public void lootStartsEmpty() {
        assertEquals(0, barbarian.getLoot());
    }

    @Test
    public void canAddLoot() {
        forestRoom.addTreasure(TreasureType.GEMS);
        barbarian.lootRoom(forestRoom);
        assertEquals(1, barbarian.getLoot());
    }
}
