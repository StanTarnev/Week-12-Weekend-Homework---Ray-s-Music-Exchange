package shopItems.instruments;

public class Guitar extends Instrument{
    private int numberOfStrings;

    public Guitar(int boughtPrice, int sellPrice, String material, String color, InstrumentType instrumentType, String sound, int numberOfStrings){
        super(boughtPrice, sellPrice, material, color, instrumentType, sound);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

}
