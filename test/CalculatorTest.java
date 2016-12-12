import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by 강홍구 on 2016-12-12.
 */
public class CalculatorTest {
    private StringCaclulator cal;

    @Before
    public void setUp() {
        cal = new StringCaclulator();
    }


    @Test
    public void add_null_또는_빈문자열 () {
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void add_하나의_문자열 () {
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_콤마_구분자 () {
        assertEquals(3, cal.add("1,2"));
    }

    @Test
    public void add_콜론_구분자 () {
        assertEquals(3, cal.add("1:2"));
    }

    @Test
    public void add_콤마_콜론_구분자 () {
        assertEquals(10, cal.add("1:2,3:4"));
    }

    @Test
    public void add_콤마_커스텀_구분자 () {
        assertEquals(6, cal.add("//;\n1;2;3"));
    }

    @Test(expected = RuntimeException.class)
    public void add_RunTimeException () {
        assertEquals(0, cal.add("//;\n1;2;-3"));
    }
}