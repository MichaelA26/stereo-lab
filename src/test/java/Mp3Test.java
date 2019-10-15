import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3Test {
    Mp3 mp3;

    @Before
    public void before(){
        mp3 = new Mp3();
    }

    @Test
    public void hasConnectivity(){
        assertEquals("radio", mp3.connect("radio"));
    }
}
