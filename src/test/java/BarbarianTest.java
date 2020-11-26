import Abilities.WeaponType;
import Players.Fighters.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before() {
        barbarian = new Barbarian("Dave", 150, WeaponType.CLUB);
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
}
