import org.junit.Test;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by 강홍구 on 2016-12-12.
 */
public class CollectionTest {

    @Test
    public void set() {
        HashSet<String> values = new HashSet<>();
        values.add("a");
        values.add("b");
        values.add("c");
        values.add("c");

        assertEquals(3, values.size());

        values.remove("c");

        assertEquals(2, values.size());
    }

    @Test
    public void list() {
        ArrayList<String> values = new ArrayList<>();
        values.add("a");
        values.add("b");
        values.add("c");
        values.add("c");

        assertEquals(4, values.size());
        assertEquals("b", values.get(1));
    }

}
