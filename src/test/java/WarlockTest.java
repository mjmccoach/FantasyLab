import Abilities.PetType;
import Abilities.SpellType;
import Abilities.WeaponType;
import Players.Casters.Warlock;
import Players.Fighters.Dwarf;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    private Warlock warlock;
    private Dwarf dwarf;

    @Before
    public void before() {
        warlock = new Warlock("Gul'dan", 120, PetType.WOLF, SpellType.FIREBALL);
        dwarf = new Dwarf("Thorin", 100, WeaponType.AXE);
    }

    @Test
    public void canShield() {
        warlock.shield(dwarf);
        assertEquals(110, dwarf.getHealth());
    }
}
