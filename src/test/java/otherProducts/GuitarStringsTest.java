package otherProducts;

import org.junit.Before;
import org.junit.Test;
import otherproducts.GuitarStrings;

import static org.junit.Assert.assertEquals;

public class GuitarStringsTest {

    GuitarStrings guitarStrings;

    @Before
    public void before(){
        guitarStrings = new GuitarStrings("D'Adarrio 11-49", 2.00, 5.99);
    }

    @Test
    public void hasDescription(){
        assertEquals("D'Adarrio 11-49", guitarStrings.getDescription());
    }

    @Test
    public void hasBuyCost(){
        assertEquals(2.00, guitarStrings.getBuyCost(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(5.99, guitarStrings.getSellPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(3.99, guitarStrings.calculateMarkup(), 0.0);
    }
}
