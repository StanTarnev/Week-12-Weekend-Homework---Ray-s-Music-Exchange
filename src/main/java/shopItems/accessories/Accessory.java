package shopItems.accessories;

import shopItems.ShopItem;

public abstract class Accessory extends ShopItem {
    private String description;


    public Accessory(int boughtPrice, int sellPrice, String type){
        super(boughtPrice, sellPrice);
        this.description = type;
    }

    public String getType() {
        return description;
    }
}
