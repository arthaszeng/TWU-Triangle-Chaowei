import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzGameTest {
    @Test
    public void shouldPrint1To15WhenUseFizzBuzz() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(15);
        assertEquals("1\n2\n3\n4\n5\n6\n7\n8\n9\n10\n11\n12\n13\n14\n15\n", fizzBuzzGame.normalPrint());
    }

    @Test
    public void shouldPrintFizzWhenNumberDisableBy3() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(15);
        assertEquals("1\n2\nFizz\n4\n5\nFizz\n7\n8\nFizz\n10\n11\nFizz\n13\n14\nFizz\n", fizzBuzzGame.FizzPrint("Fizz"));
    }

    @Test
    public void shouldPrintBuzzWhenNumberDisableBy5() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(15);
        assertEquals("1\n2\n3\n4\nBuzz\n6\n7\n8\n9\nBuzz\n11\n12\n13\n14\nBuzz\n", fizzBuzzGame.BuzzPrint("Buzz"));
    }

    @Test
    public void shouldPrintFizzBuzzWhenNumberDisableBy3And5() throws Exception {
        FizzBuzzGame fizzBuzzGame = new FizzBuzzGame(15);
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n", fizzBuzzGame.FizzBuzzPrint("FizzBuzz"));

    }
}
