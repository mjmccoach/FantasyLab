import Abilities.WeaponType;
import Players.Fighters.Dwarf;
import Players.Fighters.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Fighter fighter;

    @Before
    public void before() {
        fighter = new Dwarf("Gimli", 100, WeaponType.AXE);
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.AXE, fighter.getWeapons());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(20, fighter.getWeapons().getDamage());
    }
}
