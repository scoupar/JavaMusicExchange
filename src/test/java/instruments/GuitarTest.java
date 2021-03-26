package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar("String", "Fender", "Telecaster", "Fiesta Red", "Alder", 450.00, 600.00, "krang", "electric", 6);

    }

    @Test
    public void hasType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasBrand(){
        assertEquals("Fender", guitar.getBrand());
    }

    @Test
    public void hasModel(){
        assertEquals("Telecaster", guitar.getModel());
    }

    @Test
    public void hasColour(){
        assertEquals("Fiesta Red", guitar.getColour());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Alder", guitar.getMaterial());
    }

    @Test
    public void hasBuyCost(){
        assertEquals(450.00, guitar.getBuyCost(), 0.0);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(600.00, guitar.getSellPrice(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("krang", guitar.play());
    }

    @Test
    public void hasGuitarType(){
        assertEquals("electric", guitar.getGuitarType());
    }

    @Test public void has6Strings(){
        assertEquals(6, guitar.getNoOfStrings());
    }
}
