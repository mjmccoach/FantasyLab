package Enemies;

import Abilities.PetType;
import Abilities.SpellType;
import Players.Casters.Wizard;
import Players.Character;
import Players.Enemies.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {

    private Troll troll;
    private Character wizard;

    @Before
    public void before(){
        troll = new Troll("Jule", 400, 20);
        wizard = new Wizard("Gandalf the White", 100, PetType.UNICORN, SpellType.BLIZZARD);
    }

    @Test
    public void hasName(){
        assertEquals("Jule", troll.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(400, troll.getHealth());
    }

    @Test
    public void canAttack(){
        troll.attack(wizard);
        assertEquals(80, wizard.getHealth());
    }

    @Test
    public void canMakeWeapon(){
        troll.makeWeapon();
        assertEquals(40, troll.getDamage());
    }
}
