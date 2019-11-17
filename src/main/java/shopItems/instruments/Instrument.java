package shopItems.instruments;

import behaviors.IPlay;
import shopItems.ShopItem;

public abstract class Instrument extends ShopItem implements IPlay {
    private String material;
    private String color;
    private InstrumentType instrumentType;
    private String sound;

    public Instrument(int boughtPrice, int sellPrice, String material, String color, InstrumentType instrumentType, String sound){
        super(boughtPrice, sellPrice);
        this.material = material;
        this.color = color;
        this.instrumentType = instrumentType;
        this.sound = sound;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public String getSound() {
        return sound;
    }

    public String play(){
        return "I " + sound + "!";
    }
}
