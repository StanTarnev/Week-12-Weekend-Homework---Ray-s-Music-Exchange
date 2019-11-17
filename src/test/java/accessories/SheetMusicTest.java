package accessories;

import org.junit.Before;
import org.junit.Test;
import shopItems.accessories.SheetMusic;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {
    SheetMusic sheetMusic;

    @Before
    public void before(){
        sheetMusic = new SheetMusic(3, 4, "Sheet Music");
    }

    @Test
    public void hasBoughtPrice(){
        assertEquals(3, sheetMusic.getBoughtPrice());
    }

    @Test
    public void hasSellPrice(){
        assertEquals(4, sheetMusic.getSellPrice());
    }

    @Test
    public void hasDescription(){
        assertEquals("Sheet Music", sheetMusic.getDescription());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1, sheetMusic.calculateMarkup());
    }
}
