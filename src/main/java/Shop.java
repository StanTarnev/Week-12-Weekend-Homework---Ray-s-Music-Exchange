import behaviors.ISell;
import shopItems.ShopItem;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> shopItems;

    public Shop(){
        this.shopItems = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getShopItems() {
        return shopItems;
    }

    public void addShopItem(ShopItem shopItem){
        this.shopItems.add(shopItem);
    }

    public void removeShopItem(ShopItem shopItem){
        this.shopItems.remove(shopItem);
    }

    public int calculatePotentialProfit(){
        int totalPotentialProfit = 0;
        for (ISell shopItem : shopItems) {
            totalPotentialProfit += shopItem.calculateMarkup();
        }
        return totalPotentialProfit;

    }
}
