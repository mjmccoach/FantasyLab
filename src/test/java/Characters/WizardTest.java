package Characters;

import Abilities.PetType;
import Abilities.SpellType;
import Players.Casters.Wizard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {
    private Wizard wizard;

    @Before
    public void before() {
        wizard = new Wizard("Gandalf the White", 100, PetType.UNICORN, SpellType.BLIZZARD);
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf the White", wizard.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, wizard.getHealth());
    }

    @Test
    public void hasPet() {
        assertEquals(PetType.UNICORN, wizard.getPet());
    }

    @Test
    public void hasSpell() {
        assertEquals(SpellType.BLIZZARD, wizard.getSpell());
    }

    @Test
    public void canChangeName() {
        wizard.setName("Radagast");
        assertEquals("Radagast", wizard.getName() );
    }

    @Test
    public void canChangeHealth() {
        wizard.setHealth(50);
        assertEquals(50, wizard.getHealth());
    }

    @Test
    public void canChangeSpell() {
        wizard.setSpell(SpellType.THUNDERSTORM);
        assertEquals(SpellType.THUNDERSTORM, wizard.getSpell());
    }

    @Test
    public void canChangePet() {
        wizard.setPet(PetType.PHOENIX);
        assertEquals(PetType.PHOENIX, wizard.getPet());
    }
}
