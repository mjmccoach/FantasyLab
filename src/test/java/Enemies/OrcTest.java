package Enemies;

import Abilities.PetType;
import Abilities.SpellType;
import Players.Casters.Wizard;
import Players.Character;
import Players.Enemies.Dragon;
import Players.Enemies.Orc;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    private Orc orc;
    private Character wizard;

    @Before
    public void before(){
        orc = new Orc("Brian", 120, 5);
        wizard = new Wizard("Gandalf the White", 100, PetType.UNICORN, SpellType.BLIZZARD);
    }

    @Test
    public void hasName(){
        assertEquals("Brian", orc.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(120, orc.getHealth());
    }

    @Test
    public void canAttack(){
        orc.attack(wizard);
        assertEquals(95, wizard.getHealth());
    }

    @Test
    public void canIncreaseHealth(){
        orc.addHealth();
        assertEquals(135, orc.getHealth());
    }
}
