package Characters;

import Players.Character;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTest {

    Character character;

    @Before
    public void before() {
        character = new Character("Gandalf",100) {
        };
    }

    @Test
    public void hasName() {
        assertEquals("Gandalf", character.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(100, character.getHealth());
    }

    @Test
    public void canSetName() {
        character.setName("Dumbledore");
        assertEquals("Dumbledore", character.getName());
    }

    @Test
    public void canSetHealth() {
        character.setHealth(50);
        assertEquals(50, character.getHealth());
    }
}
