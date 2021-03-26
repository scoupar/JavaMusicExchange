package instruments;

import behaviours.IPlay;

public abstract class Instrument implements IPlay {

    private String type;
    private String brand;
    private String model;
    private String colour;
    private String material;
    private Double buyCost;
    private Double sellPrice;
    private String sound;

    public Instrument(String type, String brand, String model, String colour, String material, Double buyCost, Double sellPrice, String sound) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
        this.material = material;
        this.buyCost = buyCost;
        this.sellPrice = sellPrice;
        this.sound = sound;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getSound() {
        return sound;
    }

    public String getColour() {
        return colour;
    }

    public String getMaterial() {
        return material;
    }

    public Double getBuyCost() {
        return buyCost;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public String play(){
        return sound;

    }
}
