package Enemies;

import Abilities.PetType;
import Abilities.SpellType;
import Abilities.WeaponType;
import Players.Casters.Wizard;
import Players.Character;
import Players.Enemies.Dragon;
import Players.Fighters.Dwarf;
import Players.Fighters.Knight;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    private Dragon dragon;
    private Character wizard;
    private Character dwarf;
    private Character knight;

    @Before
    public void before(){
        dragon = new Dragon("Frank", 200, 10);
        wizard = new Wizard("Gandalf the White", 100, PetType.UNICORN, SpellType.BLIZZARD);
        dwarf = new Dwarf("Gimli", 100, WeaponType.AXE);
        knight = new Knight("Sir Cadogan", 75, WeaponType.SWORD);
    }

    @Test
    public void hasName(){
        assertEquals("Frank", dragon.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(200, dragon.getHealth());
    }

    @Test
    public void canAttack(){
        dragon.attack(wizard);
        assertEquals(90, wizard.getHealth());
    }

    @Test
    public void canFireAttack(){
        dragon.fireAttack(dwarf, knight, wizard);
        assertEquals(80, wizard.getHealth());
        assertEquals(80, dwarf.getHealth());
        assertEquals(55, knight.getHealth());
    }

}
