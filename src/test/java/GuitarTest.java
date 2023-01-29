import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;
    @Before
    public void before(){
        guitar = new Guitar(150.5, 250.0, "A guitar", IntrumentType.STRINGS, "Brown", "Wood");
    }

    @Test
    public void hasType(){
        assertEquals(IntrumentType.STRINGS, guitar.getInstrumentType());
    }

    @Test
    public void hasColor(){
        assertEquals("Brown", guitar.getColor());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void canPlay(){
        assertEquals("I am playing", guitar.play());
    }
}