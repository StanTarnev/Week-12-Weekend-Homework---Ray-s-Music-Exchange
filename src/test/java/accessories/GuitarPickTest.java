package accessories;

import org.junit.Before;
import org.junit.Test;
import shopItems.accessories.GuitarPick;

import static org.junit.Assert.assertEquals;

public class GuitarPickTest {
    GuitarPick guitarPick;

    @Before
    public void before(){
        guitarPick = new GuitarPick(1, 2, "Guitar Pick");
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1, guitarPick.calculateMarkup());
    }
}
