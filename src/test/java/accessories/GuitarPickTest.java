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
    public void hasBoughtPrice(){
        assertEquals(1, guitarPick.getBoughtPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(2, guitarPick.getSellPrice());
    }

    @Test
    public void hasDescription(){
        assertEquals("Guitar Pick", guitarPick.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1, guitarPick.calculateMarkup());
    }
}
