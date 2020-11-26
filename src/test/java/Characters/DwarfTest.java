package Characters;

import Abilities.WeaponType;
import Players.Fighters.Dwarf;
import Players.Fighters.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;

    @Before
    public void before() {
        dwarf = new Dwarf("Gimli", 100, WeaponType.AXE);
    }

    @Test
    public void hasWeapon() {
        assertEquals(WeaponType.AXE, dwarf.getWeapons());
    }

    @Test
    public void weaponHasDamage() {
        assertEquals(20, dwarf.getWeapons().getDamage());
    }

    @Test
    public void canExtraAttack() {
        assertEquals(10, dwarf.extraAttack());
    }
}
