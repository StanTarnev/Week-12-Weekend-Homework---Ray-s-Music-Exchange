package shopItems.accessories;

import shopItems.ShopItem;

public abstract class Accessory extends ShopItem {
    private String description;


    public Accessory(int boughtPrice, int sellPrice, String description){
        super(boughtPrice, sellPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
