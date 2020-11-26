import Abilities.HealType;
import Abilities.WeaponType;
import Players.Fighters.Dwarf;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    private Cleric cleric;
    private Dwarf dwarf;

    @Before
    public void before() {
        cleric = new Cleric("Bob the Healer", 90, HealType.GREATERHEAL);
        dwarf = new Dwarf("Bombur", 150, WeaponType.CLUB);
    }

    @Test
    public void canGetName() {
        assertEquals("Bob the Healer", cleric.getName());
    }

    @Test
    public void canGetHealth() {
        assertEquals(90, cleric.getHealth());
    }

    @Test
    public void canGetHealType() {
        assertEquals(HealType.GREATERHEAL, cleric.getHealType());
    }

    @Test
    public void canChangeHealType() {
        cleric.setHealType(HealType.POTION);
        assertEquals(HealType.POTION, cleric.getHealType());
    }

    @Test
    public void canRevive() {
        dwarf.setHealth(0);
        cleric.revive(dwarf);
        assertEquals(100, dwarf.getHealth());
    }

    @Test
    public void willNotReviveIfNotDead() {
        cleric.revive(dwarf);
        assertEquals(150, dwarf.getHealth());
    }
}
