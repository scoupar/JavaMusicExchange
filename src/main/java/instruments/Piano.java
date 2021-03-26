package instruments;

public class Piano extends Instrument{

    private int noOfKeys;

    public Piano(String type, String brand, String model, String colour, Double buyCost, Double sellPrice, String sound, int noOfKeys) {
        super(type, brand, model, colour, buyCost, sellPrice, sound);
        this.noOfKeys = noOfKeys;
    }

    public int getNoOfKeys() {
        return noOfKeys;
    }
}
