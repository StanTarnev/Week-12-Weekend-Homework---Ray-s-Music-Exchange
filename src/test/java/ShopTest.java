import behaviors.ISell;
import org.junit.Before;
import org.junit.Test;
import shopItems.accessories.DrumStick;
import shopItems.accessories.GuitarPick;

import java.util.ArrayList;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Shop shop;
    DrumStick drumStick;
    GuitarPick guitarPick;

    @Before
    public void before(){
        shop = new Shop();
        drumStick = new DrumStick(2, 3, "Drum Stick");
        guitarPick = new GuitarPick(1, 2, "Guitar Pick");
    }

    @Test
    public void startsWithoutShopItems(){
        assertEquals(0, shop.getShopItems().size());
    }

    @Test
    public void canAddShopItem(){
        this.shop.addShopItem(drumStick);
        assertEquals(1, shop.getShopItems().size());
    }

    @Test
    public void canRemoveShopItem(){
        shop.addShopItem(drumStick);
        this.shop.addShopItem(guitarPick);
        this.shop.removeShopItem(guitarPick);
        assertEquals(1, shop.getShopItems().size());
    }

    @Test
    public void canCalculatePotentialProfit(){
        this.shop.addShopItem(drumStick);
        this.shop.addShopItem(guitarPick);
        assertEquals(2, shop.calculatePotentialProfit());
    }
}
