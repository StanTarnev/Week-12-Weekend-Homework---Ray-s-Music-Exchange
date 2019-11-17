package shopItems.instruments;

public class Trumpet extends Instrument{
    private int numberOfValves;

    public Trumpet(int boughtPrice, int sellPrice, String material, String color, InstrumentType instrumentType, String sound, int numberOfValves){
        super(boughtPrice, sellPrice, material, color, instrumentType, sound);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

}