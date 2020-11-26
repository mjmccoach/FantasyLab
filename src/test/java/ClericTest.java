import Abilities.HealType;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {
    private Cleric cleric;

    @Before
    public void before() {
        cleric = new Cleric("Bob the Healer", 90, HealType.GREATERHEAL);
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
}
