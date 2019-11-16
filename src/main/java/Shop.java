import behaviors.ISell;
import shopItems.ShopItem;

import java.util.ArrayList;

public class Shop {
    private ArrayList<ISell> shopItems;

    public Shop(){
        this.shopItems = new ArrayList<ISell>();
    }

    public ArrayList<ISell> getStock() {
        return shopItems;
    }

    public void addStock(ShopItem shopItem){
        this.shopItems.add(shopItem);
    }

    public void removeStock(ShopItem shopItem){
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
