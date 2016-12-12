
import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by 강홍구 on 2016-12-12.
 */
public class StringTest {

    @Test
    public void split() {
        String text = "a,b,c";
        String[] values = text.split(",");

        assertEquals(3, values.length);

        String[] expected = {"a", "b", "c"};
        assertArrayEquals(expected, values);

    }

    @Test
    public void test2() {
        assertEquals(1,1);
    }
}
