package shopItems.instruments;

public class Piano extends Instrument{
    private int numberOfKeys;

    public Piano(int boughtPrice, int sellPrice, String material, String color, InstrumentType instrumentType, String sound, int numberOfKeys){
        super(boughtPrice, sellPrice, material, color, instrumentType, sound);
        this.numberOfKeys = numberOfKeys;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

}
