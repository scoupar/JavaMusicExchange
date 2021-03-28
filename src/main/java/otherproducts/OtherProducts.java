package otherproducts;

import behaviours.ISell;

public abstract class OtherProducts implements ISell {

    private String description;
    private double buyCost;
    private double sellPrice;

    public OtherProducts(String description, double buyCost, double sellPrice) {
        this.description = description;
        this.buyCost = buyCost;
        this.sellPrice = sellPrice;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyCost() {
        return buyCost;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double calculateMarkup(){
        return sellPrice - buyCost;
    }
}
