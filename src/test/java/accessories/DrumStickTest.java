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
    public void canCalculateMarkup(){
        assertEquals(1, drumStick.calculateMarkup());
    }
}