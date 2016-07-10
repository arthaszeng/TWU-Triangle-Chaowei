import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLineDrawer {
    @Test
    public void shouldPrintOneAsteriskWhenNIs1() throws Exception {
        LineDrawer lineDrawer = new LineDrawer();
        assertEquals("*", lineDrawer.draw(1));
    }
}
