import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;
import otherproducts.DrumSticks;
import otherproducts.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    Piano piano;
    GuitarStrings guitarStrings;
    DrumSticks drumSticks;

    @Before
    public void before(){
        shop = new Shop();
        guitar = new Guitar("String", "Fender", "Telecaster", "Fiesta Red", 450.00, 600.00, "krang", "electric", 6);
        piano = new Piano("Digital", "Roland", "FP-10", "black", 275.00, 469.00, "plink plonk", 96);
        guitarStrings = new GuitarStrings("Ernie Ball 11-46", 2.50, 5.75);
        drumSticks = new DrumSticks("Promark Classic", 4.55, 11.50);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canAddGuitar(){
        shop.add(guitar);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canAddPiano(){
        shop.add(piano);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canAddGuitarStrings(){
        shop.add(guitarStrings);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canAddDrumSticks(){
        shop.add(drumSticks);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveGuitar(){
        shop.add(guitar);
        shop.remove(guitar);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canRemovePiano(){
        shop.add(guitar);
        shop.add(piano);
        shop.remove(piano);
        assertEquals(1, shop.stockCount());
    }

    @Test
    public void canRemoveGuitarStrings(){
        shop.add(guitarStrings);
        shop.add(guitar);
        shop.add(piano);
        shop.remove(guitarStrings);
        assertEquals(2, shop.stockCount());
    }

    @Test
    public void canRemoveDrumSticks(){
        shop.add(drumSticks);
        shop.remove(drumSticks);
        assertEquals(0, shop.stockCount());
    }

    @Test
    public void canCalculateTotalProfit(){
        shop.add(guitar);
        shop.add(piano);
        assertEquals(344.0, shop.calculateTotalProfit(), 0.0);
    }
}
