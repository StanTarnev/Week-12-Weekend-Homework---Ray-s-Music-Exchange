package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.Guitar;
import shopItems.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;
import static shopItems.instruments.InstrumentType.STRINGS;

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(50, 70, "Wood", "Red", STRINGS, "strum", 6);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(50, guitar.getBoughtPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(70, guitar.getSellPrice());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("Red", guitar.getColor());
    }

    @Test
    public void hasType(){
        assertEquals(STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void hasSound(){
        assertEquals("strum", guitar.getSound());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(20, guitar.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("I strum!", guitar.play());
    }
}
