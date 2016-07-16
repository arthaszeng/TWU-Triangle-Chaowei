import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;

public class PrimeFactorsTest {
    @Test
    public void shouldReturnEmptyListWhenNIs1() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        assertEquals(null, primeFactors.generate(1));
    }

    @Test
    public void shouldReturn2WhenNIs4() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        assertEquals(Arrays.asList(2), primeFactors.generate(4));
    }

    @Test
    public void shouldReturn23WhenNIs6() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        assertEquals(Arrays.asList(2,3), primeFactors.generate(6));
    }

    @Test
    public void shouldReturn35WhenNIs15() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        assertEquals(Arrays.asList(3,5), primeFactors.generate(15));
    }

    @Test
    public void shouldReturn235WhenNIs30() throws Exception {
        PrimeFactors primeFactors = new PrimeFactors();
        assertEquals(Arrays.asList(2,3,5), primeFactors.generate(30));
    }

}
