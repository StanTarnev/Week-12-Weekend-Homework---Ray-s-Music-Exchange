package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.Piano;
import shopItems.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;
import static shopItems.instruments.InstrumentType.KEYBOARD;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano(120, 160, "Wood", "Mahogany", KEYBOARD, "ding", 88);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(120, piano.getBoughtPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(160, piano.getSellPrice());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("Mahogany", piano.getColor());
    }

    @Test
    public void hasType(){
        assertEquals(KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void hasSound(){
        assertEquals("ding", piano.getSound());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(88, piano.getNumberOfKeys());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(40, piano.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("I ding!", piano.play());
    }
}
