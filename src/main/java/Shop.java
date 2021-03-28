import behaviours.ISell;

import javax.management.openmbean.ArrayType;
import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

    public Shop() {
        this.stock = new ArrayList<ISell>();
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void add(ISell product){
        this.stock.add(product);
    }

    public void remove(ISell product){
        this.stock.remove(product);
    }

    public double calculateTotalProfit(){
        double profit = 0;
        for(ISell product : stock){
            double markup = product.calculateMarkup();
            profit += markup;
        }
        return profit;
    }
}
