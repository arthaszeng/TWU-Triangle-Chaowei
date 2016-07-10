import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLineDrawer {
    @Test
    public void shouldPrintOneAsteriskWhenNIs1() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("*\n", drawer.drawHorizon(1));
    }

    @Test
    public void shouldPrint3AsterisksWhenNis8 () throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("********\n", drawer.drawHorizon(8));
    }

    @Test
    public void shouldPrintOneVerticalLineWhenDrawVerticalNIs3() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("*\n*\n*\n", drawer.drawVertical(3));
    }

    @Test
    public void shouldPrintTriangleLineIs3() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("*\n**\n***\n", drawer.drawTriangle(3));
    }

    @Test
    public void shouldPrintIsoscelesLineIs3() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("  *  \n *** \n*****\n", drawer.drawIsosceles(3));

    }

    @Test
    public void shouldPrintDiamandLineIs3() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", drawer.drawDiamond(3));
    }
}
