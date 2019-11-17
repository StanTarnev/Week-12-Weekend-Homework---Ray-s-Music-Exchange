package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.DrumSet;
import shopItems.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;
import static shopItems.instruments.InstrumentType.PERCUSSION;

public class DrumSetTest {
    DrumSet drumSet;

    @Before
    public void before(){
        drumSet = new DrumSet(70, 100, "Wood", "Yellow", PERCUSSION, "bang", 9);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(70, drumSet.getBoughtPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100, drumSet.getSellPrice());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", drumSet.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("Yellow", drumSet.getColor());
    }

    @Test
    public void hasType(){
        assertEquals(PERCUSSION, drumSet.getInstrumentType());
    }

    @Test
    public void hasSound(){
        assertEquals("bang", drumSet.getSound());
    }

    @Test
    public void hasNumberOfDrums(){
        assertEquals(9, drumSet.getNumberOfDrums());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30, drumSet.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("I bang!", drumSet.play());
    }
}
