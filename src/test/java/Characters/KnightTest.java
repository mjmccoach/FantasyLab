package Characters;

import Abilities.WeaponType;
import Players.Fighters.Dwarf;
import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    private Knight knight;
    private Dwarf dwarf;

    @Before
    public void before() {
        knight = new Knight("Sir Cadogan", 75, WeaponType.SWORD);
        dwarf = new Dwarf("Gimli", 100, WeaponType.AXE);
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.SWORD, knight.getWeapons());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(5, knight.getWeapons().getDamage());
    }

    @Test
    public void canDefend() {
        knight.defend(dwarf);
        assertEquals(130, dwarf.getHealth());
    }

}
