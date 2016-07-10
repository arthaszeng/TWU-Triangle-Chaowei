import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLineDrawer {
    @Test
    public void shouldPrintOneAsteriskWhenNIs1MaxIs1() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("*\n", drawer.drawHorizon(1, 1));
    }

    @Test
    public void shouldPrint3AsterisksWhenNis8MaxIs8 () throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("********\n", drawer.drawHorizon(8, 8));
    }

    @Test
    public void shouldPrint9AsterisksWhenNis9MaxIs9() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("*********\n", drawer.drawHorizon(9, 9));
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
    public void shouldPrintDiamondLineIs3() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("  *  \n *** \n*****\n *** \n  *  \n", drawer.drawDiamond(3));
    }

    @Test
    public void shouldPrintDiamondAndPrintMyName() throws Exception {
        Drawer drawer = new Drawer();
        assertEquals("  *  \n *** \nChaowei\n *** \n  *  \n", drawer.drawDiamondWithName(3));

    }
}
