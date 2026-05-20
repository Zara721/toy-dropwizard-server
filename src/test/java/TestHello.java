import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHello {

    @Test
    public void testFoo() {
        int result = 10 + 2 * 2;
        assertEquals(result, 14);
    }

}