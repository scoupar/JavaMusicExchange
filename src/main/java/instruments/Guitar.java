package instruments;

public class Guitar extends Instrument{

    private String guitarType;
    private int noOfStrings;

    public Guitar(String type, String brand, String model,  String colour, String material, Double buyCost, Double sellPrice, String sound, String guitarType, int noOfStrings) {
        super(type, brand, model, colour, material, buyCost, sellPrice, sound);
        this.guitarType = guitarType;
        this.noOfStrings = noOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public int getNoOfStrings() {
        return noOfStrings;
    }
}
