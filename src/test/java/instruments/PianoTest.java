package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PianoTest {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("Digital", "Roland", "FP-10", "black", 275.00, 469.00, "plink plonk", 96);
    }

    @Test
    public void hasType(){
        assertEquals("Digital", piano.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Roland", piano.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("FP-10", piano.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void hasBuyCost(){
        assertEquals(275.00, piano.getBuyCost(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(469.00, piano.getSellPrice(), 0.0);
    }

    @Test
    public void hasNoOfKeys(){
        assertEquals(96, piano.getNoOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plonk", piano.play());
    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(194.00, piano.calculateMarkup(), 0.0);
    }
}
