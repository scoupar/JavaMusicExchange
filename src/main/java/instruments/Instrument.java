package instruments;

import behaviours.IPlay;
import behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String type;
    private String brand;
    private String model;
    private String colour;
    private Double buyCost;
    private Double sellPrice;
    private String sound;

    public Instrument(String type, String brand, String model, String colour, Double buyCost, Double sellPrice, String sound) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.colour = colour;
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



    public String getColour() {
        return colour;
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

    public double calculateMarkup(){
        return sellPrice - buyCost;
    }
}
