package otherProducts;

import org.junit.Before;
import org.junit.Test;
import otherproducts.DrumSticks;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumSticks drumSticks;

    @Before
    public void before(){
        drumSticks = new DrumSticks("Promark Classic", 5.65, 11.50);
    }

    @Test
    public void hasDescription(){
        assertEquals("Promark Classic", drumSticks.getDescription());
    }

    @Test
    public void hasBuyCost(){
        assertEquals(5.65, drumSticks.getBuyCost(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(11.50, drumSticks.getSellPrice(), 0.0);
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(5.85, drumSticks.calculateMarkup(), 0.0);
    }
}

