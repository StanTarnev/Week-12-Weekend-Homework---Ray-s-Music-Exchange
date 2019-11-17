package accessories;

import org.junit.Before;
import org.junit.Test;
import shopItems.accessories.DrumStick;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {
    DrumStick drumStick;

    @Before
    public void before(){
        drumStick = new DrumStick(2, 3, "Drum Stick");
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(2, drumStick.getBoughtPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(3, drumStick.getSellPrice());
    }

    @Test
    public void hasDescription(){
        assertEquals("Drum Stick", drumStick.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1, drumStick.calculateMarkup());
    }
}