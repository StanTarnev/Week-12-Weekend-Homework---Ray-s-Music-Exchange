package shopItems.instruments;

public class DrumSet extends Instrument{
    private int numberOfDrums;

    public DrumSet(int boughtPrice, int sellPrice, String material, String color, InstrumentType instrumentType, String sound, int numberOfDrums){
        super(boughtPrice, sellPrice, material, color, instrumentType, sound);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

}
