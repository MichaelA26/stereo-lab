import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before(){
        radio = new Radio();
    }

    @Test
    public void hasName(){
        radio.name("JVC");
        assertEquals("JVC", radio.getName());
    }

    @Test
    public void hasStation(){
        radio.tuneStation("Forth One");
        assertEquals("Forth One", radio.getStation());
    }
}
