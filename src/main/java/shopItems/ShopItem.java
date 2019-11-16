package shopItems;

import behaviors.ISell;

public abstract class ShopItem implements ISell {
    private int boughtPrice;
    private int sellPrice;


    public ShopItem(int boughtPrice, int sellPrice){
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public int getBoughtPrice() {
        return boughtPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public int calculateMarkup() {
        return this.sellPrice - this.boughtPrice;
    }
}
