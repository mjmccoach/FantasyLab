import Abilities.WeaponType;
import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;

    @Before
    public void before() {
        knight = new Knight("Sir Cadogan", 75, WeaponType.SWORD);
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.SWORD, knight.getWeapons());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(5, knight.getWeapons().getDamage());
    }

}
