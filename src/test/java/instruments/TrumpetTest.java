package instruments;

import org.junit.Before;
import org.junit.Test;
import shopItems.instruments.Trumpet;
import shopItems.instruments.InstrumentType;

import static org.junit.Assert.assertEquals;
import static shopItems.instruments.InstrumentType.BRASS;

public class TrumpetTest {
    Trumpet trumpet;

    @Before
    public void before(){
        trumpet = new Trumpet(80, 110, "Metal", "Golden", BRASS, "blare", 3);
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(80, trumpet.getBoughtPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(110, trumpet.getSellPrice());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Metal", trumpet.getMaterial());
    }

    @Test
    public void hasColor(){
        assertEquals("Golden", trumpet.getColor());
    }

    @Test
    public void hasType(){
        assertEquals(BRASS, trumpet.getInstrumentType());
    }

    @Test
    public void hasSound(){
        assertEquals("blare", trumpet.getSound());
    }

    @Test
    public void hasNumberOfValves(){
        assertEquals(3, trumpet.getNumberOfValves());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(30, trumpet.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("I blare!", trumpet.play());
    }
}

