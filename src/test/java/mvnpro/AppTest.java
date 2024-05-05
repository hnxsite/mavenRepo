package mvnpro;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * This class contains test cases for the mathematical operations in the {@link App} class.
 */
public class AppTest {

    /**
     * Test division with valid inputs.
     */
    @Test
    public void testDivide() {
        double result = App.divide(10, 2);
        assertEquals(5.0, result, 0.0); 
    }

    /**
     * Test primality checking for prime and non-prime numbers.
     */
    @Test
    public void testIsPrime() {
        assertTrue("7 should be prime", App.isPrime(7));
        assertFalse("10 should not be prime", App.isPrime(10));
    }
}
